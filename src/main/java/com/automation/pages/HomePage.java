package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement women;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement dresses;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tshirts;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signInLinks;
    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement logo;


    public void clickOnWomen() {
        clickOnElement(women);
    }


    public void clickOnSignIn() {
        clickOnElement(signInLinks);
    }
    public boolean signInLinkDisplayed(){
        return signInLinks.isDisplayed();
    }


}
