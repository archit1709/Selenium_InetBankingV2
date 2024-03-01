package com.banking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        this.ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(name = "uid")
    @CacheLookup
    WebElement userName;

    @FindBy(name = "password")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "//input[@name='btnLogin']")
    @CacheLookup
    WebElement loginBtn;

    @FindBy(xpath = "//a[normalize-space()='Log out']")
    @CacheLookup
    WebElement logoutBtn;

    public void setUserName(String username){

        userName.sendKeys(username);
    }

    public void setPassword(String password1){
        password.sendKeys(password1);
    }

    public void clickButton(){
        loginBtn.click();
    }

    public void clickLogoutBtn(){
        logoutBtn.click();
    }
}
