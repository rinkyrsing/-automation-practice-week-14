package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {

    //Email address, Password, Sign In Button, Create an account button and
//"AUTHENTICATION" text, "CREATE AN ACCOUNT" text Locators
//and create appropriate methods for it.


        public SignInPage() {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//*[@id=\"email\"]")
        WebElement email;

        @FindBy(xpath = "//*[@id=\"passwd\"]")
        WebElement Password;

        @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
        WebElement signInButton;

        @FindBy(xpath = "//button[@id='SubmitCreate']")
        WebElement createanaccountbutton;

        @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
        WebElement creatanaccountText;

        @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
        WebElement authentication;

        @FindBy(xpath = "//input[@id='email_create']")
        WebElement createEmail;

        @FindBy (xpath = "//ol//li")
        WebElement errorText;


        public void setCreateEmail(String email){
            sendTextToElement(createEmail,email);
        }
        public void clickOnCreateAnAccount(){
            clickOnElement(createanaccountbutton);
        }

        public String getErrorText(){
            return getTextFromElement(errorText);
        }

        public void setEmail(String str) {
            sendTextToElement(email, str);
        }

        public void setPassword(String str) {
            sendTextToElement(Password, str);
        }

        public void clickOnSignButton() {
            clickOnElement(signInButton);
        }

        public void clickOnCreateNewAccount() {
            clickOnElement(createanaccountbutton);
        }

        public String getTextAuthentication() {
            return getTextFromElement(authentication);
        }

        public String getTextCreateAccount() {
            return getTextFromElement(creatanaccountText);
        }


    }
