package com.hellofresh.challenge.pages;

import java.awt.*;
import java.util.List;
import java.util.Map;

import com.hellofresh.challenge.scripts.StartDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends StartDriver {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart1ProductProducts1651;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses3;

    @FindBy(id = "button_order_cart")
    @CacheLookup
    private WebElement checkOut;

    @FindBy(css = "#center_column div:nth-of-type(1) div:nth-of-type(2) small a")
    @CacheLookup
    private WebElement colorOrangeSize;

    @FindBy(css = "#product_1_1_0_59258 td:nth-of-type(2) small:nth-of-type(2) a")
    @CacheLookup
    private WebElement colorOrangeSizeS;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(css = "a.button-exclusive.btn.btn-default")
    @CacheLookup
    private WebElement continueShopping;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses3;

    @FindBy(css = "a._blank")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop;

    @FindBy(id = "newsletter-input")
    @CacheLookup
    private WebElement ecommerceSoftwareByPrestashop2014;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses2;

    @FindBy(css = "a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
    @CacheLookup
    private WebElement eveningDresses3;

    @FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a.cart_block_product_name")
    @CacheLookup
    private WebElement faded;

    @FindBy(css = "a.cart-images")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts1;

    @FindBy(css = "#center_column div:nth-of-type(1) div:nth-of-type(2) p.product-name a")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts2;

    @FindBy(css = "#product_1_1_0_59258 td:nth-of-type(1) a")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts3;

    @FindBy(css = "#product_1_1_0_59258 td:nth-of-type(2) p.product-name a")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts4;

    @FindBy(name = "quantity_1_1_0_59258")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts5;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a.account")
    @CacheLookup
    private WebElement joeBlack;

    @FindBy(css = "a[title='Manage my customer account']")
    @CacheLookup
    private WebElement myAccount;

    @FindBy(css = "a[title='My addresses']")
    @CacheLookup
    private WebElement myAddresses;

    @FindBy(css = "a[title='My credit slips']")
    @CacheLookup
    private WebElement myCreditSlips;

    @FindBy(css = "a[title='My orders']")
    @CacheLookup
    private WebElement myOrders;

    @FindBy(css = "a[title='Manage my personal information']")
    @CacheLookup
    private WebElement myPersonalInfo;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a[title='Product detail']")
    @CacheLookup
    private WebElement orangeS;

    @FindBy(css = "a[title='Our stores']")
    @CacheLookup
    private WebElement ourStores;

    private final String pageLoadedText = "Faded Short Sleeve T-shirts";

    private final String pageUrl = "/index.php?controller=order";

    @FindBy(css = "#layer_cart div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(4) a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout1;

    @FindBy(css = "a.button.btn.btn-default.standard-checkout.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout2;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a.logout")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(css = "a[title='Specials']")
    @CacheLookup
    private WebElement specials;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses2;

    @FindBy(css = "a[title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    @CacheLookup
    private WebElement summerDresses3;

    @FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    @CacheLookup
    private WebElement supportseleniumframeworkCom;

    @FindBy(css = "a[title='Terms and conditions of use']")
    @CacheLookup
    private WebElement termsAndConditionsOfUse;

    @FindBy(css = "a[title='Tops']")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tshirts2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts3;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "a[title='Women']")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;

    @FindBy(xpath = "//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
    @CacheLookup
    public WebElement preseedToCheckout1;

    @FindBy(name = "processAddress")
    @CacheLookup
    public WebElement preseedToCheckout2;

    @FindBy(id = "uniform-cgv")
    @CacheLookup
    public Checkbox terms;

    @FindBy(name = "processCarrier")
    @CacheLookup
    public WebElement processCarrier;

    @FindBy(className = "bankwire")
    @CacheLookup
    public WebElement bankwire;

    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    @CacheLookup
    public WebElement confirmOrder;

    public OrderPage() {
    }

    public OrderPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public OrderPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public OrderPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickProceedToCheckout4Link() {
        processCarrier.click();
        return this;
    }

    public OrderPage clickPayByBankWire() {
        bankwire.click();
        return this;
    }

    public OrderPage clickConfirmOrder() {
        confirmOrder.click();
        return this;
    }
    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickProceedToCheckout3Link() {
        preseedToCheckout2.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage agreeWithTerms() {
        preseedToCheckout2.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Cart 1 Product Products 16.51 Empty Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickCart1ProductProducts1651Link() {
        cart1ProductProducts1651.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Color Orange Size S Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickColorOrangeSizeLink() {
        colorOrangeSize.click();
        return this;
    }

    /**
     * Click on Color Orange Size S Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickColorOrangeSizeSLink() {
        colorOrangeSizeS.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Continue Shopping Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickContinueShoppingLink() {
        continueShopping.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Faded... Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickFadedLink() {
        faded.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickFadedShortSleeveTshirts1Link() {
        fadedShortSleeveTshirts1.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickFadedShortSleeveTshirts2Link() {
        fadedShortSleeveTshirts2.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickFadedShortSleeveTshirts3Link() {
        fadedShortSleeveTshirts3.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickFadedShortSleeveTshirts4Link() {
        fadedShortSleeveTshirts4.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Joe Black Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickJoeBlackLink() {
        joeBlack.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Orange S Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickOrangeSLink() {
        orangeS.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickOurStoresLink() {
        ourStores.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickProceedToCheckout1Link() {
        preseedToCheckout1.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickProceedToCheckout2Link() {
        proceedToCheckout2.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSpecialsLink() {
        specials.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTermsAndConditionsOfUseLink() {
        termsAndConditionsOfUse.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        setFadedShortSleeveTshirts5TextField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Faded Short Sleeve Tshirts Text field.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage setFadedShortSleeveTshirts5TextField() {
        return setFadedShortSleeveTshirts5TextField(data.get("FADED_SHORT_SLEEVE_TSHIRTS_5"));
    }

    /**
     * Set value to Faded Short Sleeve Tshirts Text field.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage setFadedShortSleeveTshirts5TextField(String fadedShortSleeveTshirts5Value) {
        fadedShortSleeveTshirts5.sendKeys(fadedShortSleeveTshirts5Value);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the OrderPage class instance.
     */
    public OrderPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
