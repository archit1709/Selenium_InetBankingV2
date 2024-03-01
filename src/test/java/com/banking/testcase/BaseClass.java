package com.banking.testcase;

import com.banking.utility.ReadConfig;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;

public class BaseClass {

    public WebDriver driver;

    public static Logger logger;

    public ReadConfig readConfig;

    {
        readConfig = new ReadConfig();

    }

    @BeforeClass
    @Parameters("browser")
    public void setup(String br){
        logger = Logger.getLogger("ebanking");
        PropertyConfigurator.configure("log4j.properties");

        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            driver = new ChromeDriver();
        }else if(br.equals("IE")){
            System.setProperty("webdriver.ie.driver", readConfig.getIEPath());
            driver = new InternetExplorerDriver();
        }
        driver.get(readConfig.getURL());

    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }

    public String generateRandomString(){
       String random= RandomStringUtils.randomAlphabetic(5);
       return random;
    }

    public String generateRandomNumber(){
       String randomNo= RandomStringUtils.randomNumeric(6);
       return randomNo;
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
    }
}
