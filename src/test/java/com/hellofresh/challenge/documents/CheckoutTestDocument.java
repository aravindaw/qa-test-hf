package com.hellofresh.challenge.documents;

import com.hellofresh.challenge.pages.AccountPage;
import com.hellofresh.challenge.pages.MyStoreWomwn;
import com.hellofresh.challenge.pages.OrderConfirmationPage;
import com.hellofresh.challenge.pages.OrderPage;
import com.hellofresh.challenge.scripts.StartDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutTestDocument extends StartDriver {

    public void checkout() {
        WebDriverWait wait = new WebDriverWait(driver, 10, 50);
//----------------------------Web pages---------------------------------
        AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
        MyStoreWomwn myStoreWomwn = PageFactory.initElements(driver, MyStoreWomwn.class);
        OrderPage orderPage = PageFactory.initElements(driver, OrderPage.class);
        OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
//----------------------------Web pages---------------------------------

        accountPage.clickWomen1Link();
        myStoreWomwn.item.click();
        myStoreWomwn.item.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("processAddress"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-cgv"))).click();
        orderPage.clickProceedToCheckout4Link();

        orderPage.clickPayByBankWire();
        orderPage.clickConfirmOrder();

//----------------------------Assertions---------------------------------
        Assert.assertEquals("ORDER CONFIRMATION", orderConfirmationPage.header.getText());
        Assert.assertTrue(orderConfirmationPage.fourthTab.isDisplayed());
        Assert.assertTrue(orderConfirmationPage.fifththTab.isDisplayed());
        Assert.assertTrue(orderConfirmationPage.orderNote.getText().contains("our order on My Store is complete."));
        Assert.assertTrue(driver.getCurrentUrl().contains("controller=order-confirmation"));
//----------------------------Assertions---------------------------------

    }
}
