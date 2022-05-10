package com.automation.testsuite;

import com.automation.pages.AccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends Utility {

    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage =new HomePage();
        signInPage = new SignInPage();
        accountPage = new AccountPage();


    }
    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToSignInPageSuccessFully(){
        homePage.clickOnSignIn();
        String actualText= signInPage.getTextAuthentication();
        String expectedText = "AUTHENTICATION";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(groups = {"regression","smoke"},dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                            String message){
        homePage.clickOnSignIn();
        signInPage.setEmail(username);
        signInPage.setPassword(password);
        signInPage.clickOnSignButton();
        String actualText =signInPage.getErrorText();
        String expectedText = message;
        Assert.assertEquals(actualText,expectedText);
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnSignIn();
        signInPage.setEmail("jay12@gmail.com");
        signInPage.setPassword("Jay@123");
        signInPage.clickOnSignButton();
        boolean signOutLink = accountPage.verifySignOutLink();
        Assert.assertTrue(signOutLink);



    }
    @Test
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignIn();
        signInPage.setEmail("jay12@gmail.com");
        signInPage.setPassword("Jay@123");
        signInPage.clickOnSignButton();
        accountPage.clickOnSignOut();
        boolean signInLinkDisplayed=homePage.signInLinkDisplayed();
        Assert.assertTrue(signInLinkDisplayed);
    }
}
