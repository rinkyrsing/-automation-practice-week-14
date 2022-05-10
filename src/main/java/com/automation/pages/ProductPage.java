package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement productnavigate;
    @FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
    WebElement quantity;
    @FindBy(xpath = "//option[contains(text(),'S')]")
    WebElement size;
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement colour;

    @FindBy(xpath = "//a[@title='Women']")
    WebElement clickOnWomenLink;
    public void setClickOnWomenLink(){
        clickOnElement(clickOnWomenLink);
    }

    public void verifyproductnavigate(){

        clickOnElement(productnavigate);
    }
    public void verifySelectquantity(){

        clickOnElement(quantity);
    }
    public void verifySize(){

        clickOnElement(size);
    }
    public void verifycolour(){

        clickOnElement(colour);
    }

}
