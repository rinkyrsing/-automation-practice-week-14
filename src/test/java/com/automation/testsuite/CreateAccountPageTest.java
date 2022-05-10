package com.automation.testsuite;

import com.automation.pages.AccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountPageTest extends Utility {

    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;
    SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage =new HomePage();
        signInPage = new SignInPage();
        accountPage = new AccountPage();
        softAssert = new SoftAssert();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnSignIn();
        signInPage.setCreateEmail("jay413@gmail.com");
        signInPage.clickOnCreateNewAccount();
        accountPage.selectMrRadio();
        accountPage.setFirstnameField("Jason");
        accountPage.setLastnameField("Park");
        accountPage.setPasswordField("Jwas@121");
        accountPage.setFirstnameAdd("Jason");
        accountPage.setLastnameAdd("Park");
        accountPage.setAddress("34 bond street");
        accountPage.setCityField("Newpagecity");
        accountPage.selectState("Alaska");
        accountPage.setZipCode("02345");
        accountPage.selectCountry("United States");
        accountPage.setMobileNum("01789334563");
        accountPage.setFutureReference("xzc");
        accountPage.clickOnRegisterButton();
        String actualText =accountPage.getMyAccountText();
        String expectedText = "MY ACCOUNT";
        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();

    }

}
