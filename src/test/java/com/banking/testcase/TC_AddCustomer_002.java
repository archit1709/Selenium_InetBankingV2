package com.banking.testcase;

import com.banking.pageObject.AddCustomer;
import com.banking.pageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_AddCustomer_002 extends BaseClass {

    //WebDriver driver;

    private LoginPage loginPage;
    private AddCustomer addCustomer;
    @Test(priority = 1)
    public void login() throws InterruptedException, IOException {

         loginPage = new LoginPage(driver);
        loginPage.setUserName(readConfig.getUserName());
        Thread.sleep(3000);
        loginPage.setPassword(readConfig.getPassword());
        Thread.sleep(3000);

        loginPage.clickButton();

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
       }else{

            captureScreen(driver,"login");
            Assert.assertTrue(false);
        }

    }

     @Test(priority = 2)
     public void addCustomer() throws InterruptedException {
         addCustomer=new AddCustomer(driver);

         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        addCustomer.clickAddCustBtn();
        logger.info("Clicked Add Customer Button");

        addCustomer.setName(generateRandomString());
        Thread.sleep(1000);
        addCustomer.setMale();
         Thread.sleep(1000);
        addCustomer.setDob("17091990");
         Thread.sleep(1000);
        addCustomer.setAddress("Hari singh nagar");
         Thread.sleep(1000);
        addCustomer.setCity("jhansi");
         Thread.sleep(1000);
        addCustomer.setState("Jharkhand");
         Thread.sleep(1000);
        addCustomer.setPin(generateRandomNumber());
         Thread.sleep(1000);
        addCustomer.setMobileno(generateRandomNumber());
         Thread.sleep(1000);
        addCustomer.setEmail(generateRandomString()+"@gmail.com");
         Thread.sleep(1000);
        addCustomer.setPassword(generateRandomString());
         Thread.sleep(1000);

        addCustomer.clicksubmitBtn();
       logger.info("Add customer Submit button clicked");
        if(driver.getPageSource().contains("Customer Registered Successfully!!!")){
            logger.info("if block{}");
            Assert.assertTrue(true);
        }else{
            logger.info("Else block of Add customer");
            Assert.assertTrue(false);
        }


    }

}
