package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Sign out")
    WebElement signOutLink;
    public boolean verifySignOutLink(){
        return signOutLink.isDisplayed();
    }
    public void clickOnSignOut(){
        clickOnElement(signOutLink);
    }
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement maleRadio;
    public void selectMrRadio(){
        clickOnElement(maleRadio);
    }
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstnameField;
    public void setFirstnameField(String first){
        sendTextToElement(firstnameField,first);
    }

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastnameField;
    public void setLastnameField(String last){
        sendTextToElement(lastnameField,last);
    }
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    public void setPasswordField(String password){
        sendTextToElement(passwordField,password);
    }


    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstname1;
    public void setFirstnameAdd(String firstAdd){
        sendTextToElement(firstname1,firstAdd);
    }
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastname1;
    public void setLastnameAdd(String lastAdd){
        sendTextToElement(lastname1,lastAdd);
    }

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;
    public void setAddress(String address){
        sendTextToElement(addressField,address);
    }

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    public void setCityField(String cityField){
        sendTextToElement(city,cityField);
    }
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    public void selectState(String stateName){
        selectByVisibleTextFromDropDown(state,stateName);
    }
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;
    public void selectCountry(String countryName){
        selectByVisibleTextFromDropDown(country,countryName);
    }

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNum;
    public void setMobileNum(String number){
        sendTextToElement(mobileNum,number);
    }
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;
    public void setZipCode(String zip){
        sendTextToElement(zipCode,zip);
    }

    @FindBy(xpath = "//input[@id='alias']")
    WebElement futureReference;
    public void setFutureReference(String add){
        sendTextToElement(futureReference,add);
    }
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    @FindBy(xpath = "//div[@id=\"center_column\"]/h1")
    WebElement myAccount;
    public String getMyAccountText(){
        return getTextFromElement(myAccount);
    }

}
