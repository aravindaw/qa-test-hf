package com.hellofresh.challenge.documents;

import com.hellofresh.challenge.contexts.CustomerDetailContext;
import com.hellofresh.challenge.pages.AccountPage;
import com.hellofresh.challenge.pages.HomePage;
import com.hellofresh.challenge.pages.LoginPage;
import com.hellofresh.challenge.scripts.StartDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class LogInTestDocument extends StartDriver {
    private final CustomerDetailContext context;

    public LogInTestDocument(CustomerDetailContext context) {
        this.context = context;
    }

    public void logInTest() {
//----------------------------Web pages---------------------------------
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
//----------------------------Web pages---------------------------------


        homePage.clickSignInLink();
        loginPage.setEmailAddress2TextField(context.getEmail());
        loginPage.setPasswordPasswordField(context.getPassword());
        loginPage.clickSignIn2Button();


//----------------------------Assertions---------------------------------
        Assert.assertEquals("MY ACCOUNT", accountPage.pageHeading.getText());
        Assert.assertEquals(context.getAccountName(), accountPage.accountName.getText());
        Assert.assertTrue(accountPage.infoAccount.getText().contains("Welcome to your account."));
        Assert.assertTrue(accountPage.signOut1.isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("controller=my-account"));
//----------------------------Assertions---------------------------------

    }
}
