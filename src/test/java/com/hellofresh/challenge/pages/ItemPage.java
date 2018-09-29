package com.hellofresh.challenge.pages;

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

public class ItemPage extends StartDriver {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='1']")
    @CacheLookup
    private WebElement _1;

    @FindBy(css = "a[title='2']")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "a[title='3']")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "a[title='4']")
    @CacheLookup
    private WebElement _4;

    @FindBy(css = "a[title='5']")
    @CacheLookup
    private WebElement _5;

    @FindBy(css = "a[title='About us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(name = "Submit")
    @CacheLookup
    public WebElement addToCart;

    @FindBy(id = "wishlist_button")
    @CacheLookup
    private WebElement addToWishlist;

    @FindBy(id = "new_comment_tab_btn")
    @CacheLookup
    private WebElement beTheFirstToWrite;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "a[title='Match your favorites blouses with the right accessories for the perfect look.']")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(css = "#send_friend_form_content p.submit a.closefb")
    @CacheLookup
    private WebElement cancel1;

    @FindBy(css = "#new_comment_form_footer p:nth-of-type(2) a.closefb")
    @CacheLookup
    private WebElement cancel2;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart0ProductProductsEmpty;

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

    @FindBy(id = "content")
    @CacheLookup
    private WebElement comment;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(name = "resetImages")
    @CacheLookup
    private WebElement displayAllPictures;

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

    @FindBy(id = "friend_email")
    @CacheLookup
    private WebElement emailAddressOfYourFriend;

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

    @FindBy(css = "button.btn.btn-default.btn-google-plus")
    @CacheLookup
    private WebElement google;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(css = "a.account")
    @CacheLookup
    private WebElement joeBlack;

    @FindBy(css = "#short_description_block p.buttons_bottom_block a.button")
    @CacheLookup
    private WebElement moreDetails;

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

    @FindBy(id = "friend_name")
    @CacheLookup
    private WebElement nameOfYourFriend;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(id = "view_scroll_right")
    @CacheLookup
    private WebElement next;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(css = "a[title='Our stores']")
    @CacheLookup
    private WebElement ourStores;

    private final String pageLoadedText = "The brand offers feminine designs delivering stylish separates and statement dresses which has since evolved into a full ready-to-wear collection in which every item is a vital part of a woman's wardrobe";

    private final String pageUrl = "/index.php?id_product=1&controller=product";

    @FindBy(css = "button.btn.btn-default.btn-pinterest")
    @CacheLookup
    private WebElement pinterest;

    @FindBy(id = "view_scroll_left")
    @CacheLookup
    private WebElement previous;

    @FindBy(css = "a[href='javascript:print();']")
    @CacheLookup
    private WebElement print;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(id = "quantity_wanted")
    @CacheLookup
    private WebElement quantity;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(id = "sendEmail")
    @CacheLookup
    private WebElement send1;

    @FindBy(id = "submitNewMessage")
    @CacheLookup
    private WebElement send2;

    @FindBy(id = "send_friend_button")
    @CacheLookup
    private WebElement sendToAFriend;

    @FindBy(css = "button.btn.btn-default.btn-facebook")
    @CacheLookup
    private WebElement share;

    @FindBy(css = "a.logout")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(id = "group_1")
    @CacheLookup
    private WebElement size;

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

    @FindBy(id = "comment_title")
    @CacheLookup
    private WebElement title;

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

    @FindBy(css = "button.btn.btn-default.btn-twitter")
    @CacheLookup
    private WebElement tweet;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "#columns div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement women2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last a.selected")
    @CacheLookup
    private WebElement women3;

    @FindBy(css = "#product_comments_block_extra ul.comments_advices li a.open-comment-form")
    @CacheLookup
    private WebElement writeAReview;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;

    public ItemPage() {
    }

    public ItemPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ItemPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ItemPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickAddToCartButton() {
        addToCart.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickAddToWishlistLink() {
        addToWishlist.click();
        return this;
    }

    /**
     * Click on Be The First To Write Your Review Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickBeTheFirstToWriteLink() {
        beTheFirstToWrite.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCancel1Link() {
        cancel1.click();
        return this;
    }

    /**
     * Click on Cancel Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCancel2Link() {
        cancel2.click();
        return this;
    }

    /**
     * Click on Cart 0 Product Products Empty Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCart0ProductProductsEmptyLink() {
        cart0ProductProductsEmpty.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Display All Pictures Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickDisplayAllPicturesLink() {
        displayAllPictures.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Google Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickGoogleButton() {
        google.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Joe Black Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickJoeBlackLink() {
        joeBlack.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickLink1() {
        _1.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on 4 Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickLink4() {
        _4.click();
        return this;
    }

    /**
     * Click on 5 Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickLink5() {
        _5.click();
        return this;
    }

    /**
     * Click on More Details Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickMoreDetailsLink() {
        moreDetails.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickNextLink() {
        next.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickOurStoresLink() {
        ourStores.click();
        return this;
    }

    /**
     * Click on Pinterest Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickPinterestButton() {
        pinterest.click();
        return this;
    }

    /**
     * Click on Previous Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickPreviousLink() {
        previous.click();
        return this;
    }

    /**
     * Click on Print Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickPrintLink() {
        print.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSend1Button() {
        send1.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSend2Button() {
        send2.click();
        return this;
    }

    /**
     * Click on Send To A Friend Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSendToAFriendLink() {
        sendToAFriend.click();
        return this;
    }

    /**
     * Click on Share Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickShareButton() {
        share.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSpecialsLink() {
        specials.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTermsAndConditionsOfUseLink() {
        termsAndConditionsOfUse.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Tweet Button.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTweetButton() {
        tweet.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickWomen3Link() {
        women3.click();
        return this;
    }

    /**
     * Click on Write A Review Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickWriteAReviewLink() {
        writeAReview.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        setNameOfYourFriendTextField();
        setEmailAddressOfYourFriendTextField();
        setQuantityTextField();
        setSizeDropDownListField();
        setTitleTextField();
        setCommentTextareaField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Comment Textarea field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setCommentTextareaField() {
        return setCommentTextareaField(data.get("COMMENT"));
    }

    /**
     * Set value to Comment Textarea field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setCommentTextareaField(String commentValue) {
        comment.sendKeys(commentValue);
        return this;
    }

    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Email Address Of Your Friend Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setEmailAddressOfYourFriendTextField() {
        return setEmailAddressOfYourFriendTextField(data.get("EMAIL_ADDRESS_OF_YOUR_FRIEND"));
    }

    /**
     * Set value to Email Address Of Your Friend Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setEmailAddressOfYourFriendTextField(String emailAddressOfYourFriendValue) {
        emailAddressOfYourFriend.sendKeys(emailAddressOfYourFriendValue);
        return this;
    }

    /**
     * Set default value to Name Of Your Friend Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setNameOfYourFriendTextField() {
        return setNameOfYourFriendTextField(data.get("NAME_OF_YOUR_FRIEND"));
    }

    /**
     * Set value to Name Of Your Friend Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setNameOfYourFriendTextField(String nameOfYourFriendValue) {
        nameOfYourFriend.sendKeys(nameOfYourFriendValue);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Set default value to Quantity Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setQuantityTextField() {
        return setQuantityTextField(data.get("QUANTITY"));
    }

    /**
     * Set value to Quantity Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setQuantityTextField(String quantityValue) {
        quantity.sendKeys(quantityValue);
        return this;
    }

    /**
     * Set default value to Size Drop Down List field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setSizeDropDownListField() {
        return setSizeDropDownListField(data.get("SIZE"));
    }

    /**
     * Set value to Size Drop Down List field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setSizeDropDownListField(String sizeValue) {
        new Select(size).selectByVisibleText(sizeValue);
        return this;
    }

    /**
     * Set default value to Title Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setTitleTextField() {
        return setTitleTextField(data.get("TITLE"));
    }

    /**
     * Set value to Title Text field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage setTitleTextField(String titleValue) {
        title.sendKeys(titleValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Unset default value from Size Drop Down List field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage unsetSizeDropDownListField() {
        return unsetSizeDropDownListField(data.get("SIZE"));
    }

    /**
     * Unset value from Size Drop Down List field.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage unsetSizeDropDownListField(String sizeValue) {
        new Select(size).deselectByVisibleText(sizeValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ItemPage class instance.
     */
    public ItemPage verifyPageLoaded() {
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
     * @return the ItemPage class instance.
     */
    public ItemPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
