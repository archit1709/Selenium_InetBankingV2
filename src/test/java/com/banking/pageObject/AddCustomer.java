package com.banking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

    public WebDriver ldriver;

    public AddCustomer(WebDriver rdriver){
        this.ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
    @CacheLookup
    WebElement customerBtn;

    @FindBy(how = How.XPATH,using = "//input[@name='name']")
    @CacheLookup
    WebElement name;

    @FindBy(how = How.XPATH,using = "//input[@value='f']")
    @CacheLookup
    WebElement female;

    @FindBy(how = How.XPATH,using = "//input[@value='m']")
    @CacheLookup
    WebElement male;

    @FindBy(how = How.ID,using = "dob")
    @CacheLookup
    WebElement dob;

    @FindBy(how = How.XPATH,using = "//textarea[@name='addr']")
    @CacheLookup
    WebElement address;

    @FindBy(how = How.XPATH,using = "//input[@name='city']")
    @CacheLookup
    WebElement city;

    @FindBy(how = How.XPATH,using = "//input[@name='state']")
    @CacheLookup
    WebElement state;

    @FindBy(how = How.XPATH,using = "//input[@name='pinno']")
    @CacheLookup
    WebElement pin;

    @FindBy(how = How.NAME,using = "telephoneno")
    @CacheLookup
    WebElement mobileNo;

    @FindBy(how = How.XPATH,using = "//input[@name='emailid']")
    @CacheLookup
    WebElement email;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.XPATH,using = "//input[@name='sub']")
    @CacheLookup
    WebElement submitBtn;

    public void setName(String name1) {
        name.sendKeys(name1);
    }

    public void setMale(){
        male.click();
    }

    public void setFemale(){
        female.click();
    }
    public void setDob(String dob1){
       dob.sendKeys(dob1);
    }

    public void setAddress(String address1){
        address.sendKeys(address1);
    }

    public void setCity(String city1){
         city.sendKeys(city1);
    }

    public void setState(String state1){
         state.sendKeys(state1);
    }

    public void setPin(String pin1){
         pin.sendKeys(pin1);
    }

    public void setMobileno(String mobileno1){
        mobileNo.sendKeys(mobileno1);
    }

    public void setEmail(String email1){
         email.sendKeys(email1);
    }

    public void setPassword(String password1){
         password.sendKeys(password1);
    }

    public void clickAddCustBtn(){
        customerBtn.click();
    }
    public void clicksubmitBtn(){
        submitBtn.click();
    }
}
