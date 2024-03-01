package com.banking.testcase;

import com.banking.pageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

   private LoginPage loginPage;
   @Test
   public void login() throws InterruptedException {

        loginPage=new LoginPage(driver);
       loginPage.setUserName(readConfig.getUserName());
       Thread.sleep(3000);
       loginPage.setPassword(readConfig.getPassword());
       Thread.sleep(3000);

       loginPage.clickButton();
       Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
   }

   @Test
    public void logout() throws InterruptedException {

       loginPage=new LoginPage(driver);
       loginPage.clickLogoutBtn();
       Thread.sleep(2000);
       driver.switchTo().alert().accept();

   }


}
