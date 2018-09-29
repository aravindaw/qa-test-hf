package com.hellofresh.challenge.documents;

import com.hellofresh.challenge.contexts.CustomerDetailContext;
import com.hellofresh.challenge.pages.AccountPage;
import com.hellofresh.challenge.pages.HomePage;
import com.hellofresh.challenge.pages.LoginPage;
import com.hellofresh.challenge.pages.SigninPage;
import com.hellofresh.challenge.scripts.StartDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterNewCustomerDocument extends StartDriver {
    private final CustomerDetailContext context;

    public RegisterNewCustomerDocument(CustomerDetailContext context) {
        this.context = context;
    }

    public void registerNewCustomer() {
//----------------------------Web pages---------------------------------
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SigninPage signinPage = PageFactory.initElements(driver, SigninPage.class);
        AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
//----------------------------Web pages---------------------------------

        homePage.clickSignInLink();
        loginPage.setEmailAddress1TextField(context.getEmail());
        loginPage.clickCreateAnAccountButton();
        signinPage.setMrRadioButtonField();
        signinPage.setFirstName1TextField(context.getFirstName());
        signinPage.setLastName1TextField(context.getLastName());
        signinPage.setPasswordPasswordField(context.getPassword());
        Select select = new Select(signinPage.dateOfBirth1);
        select.selectByValue(context.getDay());
        select = new Select(signinPage.dateOfBirth2);
        select.selectByValue(context.getMonth());
        select = new Select(signinPage.dateOfBirth3);
        select.selectByValue(context.getYear());
        signinPage.setCompanyTextField(context.getCompany());
        signinPage.setAddressTextField(context.getAddressLine1());
        signinPage.setAddressLine2TextField(context.getAddressLine2());
        signinPage.setCityTextField(context.getCity());
        select = new Select(signinPage.state);
        select.selectByVisibleText(context.getState());
        signinPage.setZippostalCodeTextField(context.getPostcode());
        signinPage.setAdditionalInformationTextareaField(context.getOther());
        signinPage.setHomePhoneTextField(context.getPhone());
        signinPage.setMobilePhoneTextField(context.getMobile());
        signinPage.setAssignAnAddressAliasForFutureTextField(context.getAlias());
        signinPage.clickRegisterButton();

//----------------------------Assertions---------------------------------
        Assert.assertEquals(accountPage.pageHeading.getText(), "MY ACCOUNT");
        Assert.assertEquals(accountPage.accountName.getText(), context.getFirstName() + " " + context.getLastName());
        Assert.assertTrue(accountPage.infoAccount.getText().contains("Welcome to your account."));
        Assert.assertTrue(accountPage.signOut1.isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("controller=my-account"));
//----------------------------Assertions---------------------------------
    }
}
