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

public class MyStoreWomwn extends StartDriver {
    private Map<String, String> data;
//    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement aboutUs1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(7) a")
    @CacheLookup
    private WebElement aboutUs2;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=1&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart1;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=2&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart2;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart3;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=4&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart4;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=5&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart5;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=6&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart6;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=7&token=e221c55946ef58b6d5ca3f2a935610bc']")
    @CacheLookup
    private WebElement addToCart7;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare2;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare3;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare4;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare5;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(6) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare6;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(7) div.product-container div:nth-of-type(3) div:nth-of-type(2) a.add_to_compare")
    @CacheLookup
    private WebElement addToCompare7;

    @FindBy(css = "a.addToWishlist.wishlistProd_1")
    @CacheLookup
    private WebElement addToWishlist1;

    @FindBy(css = "a.addToWishlist.wishlistProd_2")
    @CacheLookup
    private WebElement addToWishlist2;

    @FindBy(css = "a.addToWishlist.wishlistProd_3")
    @CacheLookup
    private WebElement addToWishlist3;

    @FindBy(css = "a.addToWishlist.wishlistProd_4")
    @CacheLookup
    private WebElement addToWishlist4;

    @FindBy(css = "a.addToWishlist.wishlistProd_5")
    @CacheLookup
    private WebElement addToWishlist5;

    @FindBy(css = "a.addToWishlist.wishlistProd_6")
    @CacheLookup
    private WebElement addToWishlist6;

    @FindBy(css = "a.addToWishlist.wishlistProd_7")
    @CacheLookup
    private WebElement addToWishlist7;

    @FindBy(css = "a[title='All specials']")
    @CacheLookup
    private WebElement allSpecials;

    @FindBy(id = "layered_id_attribute_group_7")
    @CacheLookup
    private WebElement beige11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-beige']")
    @CacheLookup
    private WebElement beige12;

    @FindBy(css = "a[title='Best sellers']")
    @CacheLookup
    private WebElement bestSellers;

    @FindBy(id = "layered_id_attribute_group_11")
    @CacheLookup
    private WebElement black21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-black']")
    @CacheLookup
    private WebElement black22;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement blouse;

    @FindBy(css = "a[title='Blouses']")
    @CacheLookup
    private WebElement blouses1;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement blouses2;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement blouses3;

    @FindBy(id = "layered_id_attribute_group_14")
    @CacheLookup
    private WebElement blue21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-blue']")
    @CacheLookup
    private WebElement blue22;

    @FindBy(css = "a[title='View my shopping cart']")
    @CacheLookup
    private WebElement cart0ProductProductsEmpty;

    @FindBy(id = "layered_id_feature_11")
    @CacheLookup
    private WebElement casual31;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-casual']")
    @CacheLookup
    private WebElement casual32;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses2;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses3;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement casualDresses4;

    @FindBy(id = "button_order_cart")
    @CacheLookup
    private WebElement checkOut;

    @FindBy(id = "layered_id_feature_18")
    @CacheLookup
    private WebElement colorfulDress11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#properties-colorful_dress']")
    @CacheLookup
    private WebElement colorfulDress12;

    @FindBy(css = "#center_column div:nth-of-type(3) div:nth-of-type(2) form.compare-form button.btn.btn-default.button.button-medium.bt_compare.bt_compare")
    @CacheLookup
    private WebElement compare01;

    @FindBy(css = "button.btn.btn-default.button.button-medium.bt_compare.bt_compare_bottom")
    @CacheLookup
    private WebElement compare02;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs1;

    @FindBy(css = "a[title='Contact us']")
    @CacheLookup
    private WebElement contactUs2;

    @FindBy(id = "layered_id_feature_5")
    @CacheLookup
    private WebElement cotton31;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#compositions-cotton']")
    @CacheLookup
    private WebElement cotton32;

    @FindBy(css = "a[title='Delivery']")
    @CacheLookup
    private WebElement delivery;

    @FindBy(css = "#stores_block_left div.block_content.blockstore div a.btn.btn-default.button.button-small")
    @CacheLookup
    private WebElement discoverOurStores;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) a.sf-with-ul")
    @CacheLookup
    private WebElement dresses2;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses3;

    @FindBy(css = "#subcategories ul.clearfix li:nth-of-type(2) h5 a.subcategory-name")
    @CacheLookup
    private WebElement dresses4;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement dresses5;

    @FindBy(id = "layered_category_8")
    @CacheLookup
    private WebElement dresses51;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-dresses']")
    @CacheLookup
    private WebElement dresses52;

    @FindBy(id = "layered_id_feature_16")
    @CacheLookup
    private WebElement dressy11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-dressy']")
    @CacheLookup
    private WebElement dressy12;

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

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses3;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement eveningDresses4;

    @FindBy(css = "a[href='https://www.facebook.com/groups/525066904174158/']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement fadedShortSleeveTshirts;

    @FindBy(id = "layered_manufacturer_1")
    @CacheLookup
    private WebElement fashionManufacturer71;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#manufacturer-fashion_manufacturer']")
    @CacheLookup
    private WebElement fashionManufacturer72;

    @FindBy(id = "layered_id_feature_13")
    @CacheLookup
    private WebElement girly31;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#styles-girly']")
    @CacheLookup
    private WebElement girly32;

    @FindBy(css = "a[href='https://plus.google.com/111979135243110831526/posts']")
    @CacheLookup
    private WebElement googlePlus;

    @FindBy(id = "layered_id_attribute_group_15")
    @CacheLookup
    private WebElement green11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-green']")
    @CacheLookup
    private WebElement green12;

    @FindBy(css = "a[title='Grid']")
    @CacheLookup
    private WebElement grid;

    @FindBy(id = "layered_quantity_1")
    @CacheLookup
    private WebElement inStock71;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#availability-in_stock']")
    @CacheLookup
    private WebElement inStock72;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_cms_category=1&controller=cms']")
    @CacheLookup
    private WebElement information;

    @FindBy(css = "a.account")
    @CacheLookup
    private WebElement joeBlack;

    @FindBy(id = "layered_id_attribute_group_3")
    @CacheLookup
    private WebElement l71;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#size-l']")
    @CacheLookup
    private WebElement l72;

    @FindBy(css = "a[title='Legal Notice']")
    @CacheLookup
    private WebElement legalNotice;

    @FindBy(css = "a[title='List']")
    @CacheLookup
    private WebElement list;

    @FindBy(id = "layered_id_attribute_group_2")
    @CacheLookup
    private WebElement m71;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#size-m']")
    @CacheLookup
    private WebElement m72;

    @FindBy(id = "layered_id_feature_21")
    @CacheLookup
    private WebElement maxiDress11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#properties-maxi_dress']")
    @CacheLookup
    private WebElement maxiDress12;

    @FindBy(id = "layered_id_feature_20")
    @CacheLookup
    private WebElement midiDress11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#properties-midi_dress']")
    @CacheLookup
    private WebElement midiDress12;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more2;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more3;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more4;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more5;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(6) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more6;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(7) div.product-container div:nth-of-type(2) div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement more7;

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

    @FindBy(id = "layered_condition_new")
    @CacheLookup
    private WebElement new71;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#condition-new']")
    @CacheLookup
    private WebElement new72;

    @FindBy(css = "a[title='New products']")
    @CacheLookup
    private WebElement newProducts;

    @FindBy(name = "submitNewsletter")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "layered_id_attribute_group_13")
    @CacheLookup
    private WebElement orange31;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-orange']")
    @CacheLookup
    private WebElement orange32;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement ourStores1;

    @FindBy(css = "#stores_block_left p.title_block a")
    @CacheLookup
    private WebElement ourStores2;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(4) a")
    @CacheLookup
    private WebElement ourStores3;

    private final String pageLoadedText = "Terms and conditions of use";

    private final String pageUrl = "/index.php?id_category=3&controller=category";

    @FindBy(id = "layered_id_attribute_group_24")
    @CacheLookup
    private WebElement pink11;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-pink']")
    @CacheLookup
    private WebElement pink12;

    @FindBy(id = "layered_id_feature_1")
    @CacheLookup
    private WebElement polyester21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#compositions-polyester']")
    @CacheLookup
    private WebElement polyester22;

    @FindBy(css = "#special_block_right div.block_content.products-block ul li.clearfix div.product-content h5 a.product-name")
    @CacheLookup
    private WebElement printedChiffonDress1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(7) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedChiffonDress2;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedDress1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedDress2;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedSummerDress1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(6) div.product-container div:nth-of-type(2) h5 a.product-name")
    @CacheLookup
    private WebElement printedSummerDress2;

    @FindBy(css = "a.btn.btn-default.button.button-medium")
    @CacheLookup
    private WebElement proceedToCheckout;

    @FindBy(id = "search_query_top")
    @CacheLookup
    private WebElement productSuccessfullyAddedToYourShopping;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(1) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView1;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(2) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView2;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(3) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView3;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(4) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView4;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(5) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView5;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(6) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView6;

    @FindBy(css = "#center_column ul.product_list.grid.row li:nth-of-type(7) div.product-container div:nth-of-type(1) div.product-image-container a:nth-of-type(2)")
    @CacheLookup
    private WebElement quickView7;

    @FindBy(id = "layered_id_attribute_group_1")
    @CacheLookup
    private WebElement s71;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#size-s']")
    @CacheLookup
    private WebElement s72;

    @FindBy(name = "submit_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[title='Secure payment']")
    @CacheLookup
    private WebElement securePayment;

    @FindBy(id = "layered_id_feature_19")
    @CacheLookup
    private WebElement shortDress21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#properties-short_dress']")
    @CacheLookup
    private WebElement shortDress22;

    @FindBy(id = "layered_id_feature_17")
    @CacheLookup
    private WebElement shortSleeve21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#properties-short_sleeve']")
    @CacheLookup
    private WebElement shortSleeve22;

    @FindBy(css = "a.logout")
    @CacheLookup
    private WebElement signOut1;

    @FindBy(css = "a[title='Sign out']")
    @CacheLookup
    private WebElement signOut2;

    @FindBy(css = "a[title='Sitemap']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(id = "selectProductSort")
    @CacheLookup
    private WebElement sortBy;

    @FindBy(css = "#special_block_right p.title_block a")
    @CacheLookup
    private WebElement specials1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(1) a")
    @CacheLookup
    private WebElement specials2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(2) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses2;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses3;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement summerDresses4;

    @FindBy(css = "a[href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    @CacheLookup
    private WebElement supportseleniumframeworkCom;

    @FindBy(css = "#informations_block_left_1 div.block_content.list-block ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse1;

    @FindBy(css = "#block_various_links_footer ul.toggle-footer li:nth-of-type(6) a")
    @CacheLookup
    private WebElement termsAndConditionsOfUse2;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) a.sf-with-ul")
    @CacheLookup
    private WebElement tops1;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops2;

    @FindBy(id = "layered_category_4")
    @CacheLookup
    private WebElement tops21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-tops']")
    @CacheLookup
    private WebElement tops22;

    @FindBy(css = "#subcategories ul.clearfix li:nth-of-type(1) h5 a.subcategory-name")
    @CacheLookup
    private WebElement tops3;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tops4;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts1;

    @FindBy(css = "#block_top_menu ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tshirts2;

    @FindBy(css = "#categories_block_left div.block_content ul.tree.dynamized li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts3;

    @FindBy(css = "#footer div.row section:nth-of-type(2) div.category_footer.toggle-footer div.list ul.tree.dynamized li.last ul li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement tshirts4;

    @FindBy(css = "a[href='https://twitter.com/seleniumfrmwrk']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(id = "layered_id_feature_3")
    @CacheLookup
    private WebElement viscose21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#compositions-viscose']")
    @CacheLookup
    private WebElement viscose22;

    @FindBy(id = "layered_id_attribute_group_8")
    @CacheLookup
    private WebElement white21;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-white']")
    @CacheLookup
    private WebElement white22;

    @FindBy(css = "a[title='Women']")
    @CacheLookup
    private WebElement women1;

    @FindBy(css = "a.selected")
    @CacheLookup
    private WebElement women2;

    @FindBy(id = "layered_id_attribute_group_16")
    @CacheLookup
    private WebElement yellow31;

    @FindBy(css = "a[href='http://automationpractice.com/index.php?id_category=3&controller=category#color-yellow']")
    @CacheLookup
    private WebElement yellow32;

    @FindBy(css = "a[href='https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA']")
    @CacheLookup
    private WebElement youtube;

    @FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts']/ancestor::li")
    @CacheLookup
    public WebElement item;

    public MyStoreWomwn() {
    }

    public MyStoreWomwn(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public MyStoreWomwn(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public MyStoreWomwn(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAboutUs1Link() {
        aboutUs1.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAboutUs2Link() {
        aboutUs2.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart1Link() {
        addToCart1.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart2Link() {
        addToCart2.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart3Link() {
        addToCart3.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart4Link() {
        addToCart4.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart5Link() {
        addToCart5.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart6Link() {
        addToCart6.click();
        return this;
    }

    /**
     * Click on Add To Cart Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCart7Link() {
        addToCart7.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare1Link() {
        addToCompare1.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare2Link() {
        addToCompare2.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare3Link() {
        addToCompare3.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare4Link() {
        addToCompare4.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare5Link() {
        addToCompare5.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare6Link() {
        addToCompare6.click();
        return this;
    }

    /**
     * Click on Add To Compare Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToCompare7Link() {
        addToCompare7.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist1Link() {
        addToWishlist1.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist2Link() {
        addToWishlist2.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist3Link() {
        addToWishlist3.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist4Link() {
        addToWishlist4.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist5Link() {
        addToWishlist5.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist6Link() {
        addToWishlist6.click();
        return this;
    }

    /**
     * Click on Add To Wishlist Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAddToWishlist7Link() {
        addToWishlist7.click();
        return this;
    }

    /**
     * Click on All Specials Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickAllSpecialsLink() {
        allSpecials.click();
        return this;
    }

    /**
     * Click on Beige 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBeige11Link() {
        beige11.click();
        return this;
    }

    /**
     * Click on Beige 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBeige12Link() {
        beige12.click();
        return this;
    }

    /**
     * Click on Best Sellers Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBestSellersLink() {
        bestSellers.click();
        return this;
    }

    /**
     * Click on Black 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlack21Link() {
        black21.click();
        return this;
    }

    /**
     * Click on Black 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlack22Link() {
        black22.click();
        return this;
    }

    /**
     * Click on Blouse Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlouseLink() {
        blouse.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlouses1Link() {
        blouses1.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlouses2Link() {
        blouses2.click();
        return this;
    }

    /**
     * Click on Blouses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlouses3Link() {
        blouses3.click();
        return this;
    }

    /**
     * Click on Blue 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlue21Link() {
        blue21.click();
        return this;
    }

    /**
     * Click on Blue 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickBlue22Link() {
        blue22.click();
        return this;
    }

    /**
     * Click on Cart 0 Product Products Empty Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCart0ProductProductsEmptyLink() {
        cart0ProductProductsEmpty.click();
        return this;
    }

    /**
     * Click on Casual 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCasual31Link() {
        if (!casual31.isSelected()) {
            casual31.click();
        }
        return this;
    }

    /**
     * Click on Casual 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCasual32Link() {
        casual32.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCasualDresses1Link() {
        casualDresses1.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCasualDresses2Link() {
        casualDresses2.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCasualDresses3Link() {
        casualDresses3.click();
        return this;
    }

    /**
     * Click on Casual Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCasualDresses4Link() {
        casualDresses4.click();
        return this;
    }

    /**
     * Click on Check Out Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCheckOutLink() {
        checkOut.click();
        return this;
    }

    /**
     * Click on Colorful Dress 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickColorfulDress11Link() {
        if (!colorfulDress11.isSelected()) {
            colorfulDress11.click();
        }
        return this;
    }

    /**
     * Click on Colorful Dress 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickColorfulDress12Link() {
        colorfulDress12.click();
        return this;
    }

    /**
     * Click on Compare 0 Button.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCompare01Button() {
        compare01.click();
        return this;
    }

    /**
     * Click on Compare 0 Button.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCompare02Button() {
        compare02.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickContactUs1Link() {
        contactUs1.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickContactUs2Link() {
        contactUs2.click();
        return this;
    }

    /**
     * Click on Cotton 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCotton31Link() {
        if (!cotton31.isSelected()) {
            cotton31.click();
        }
        return this;
    }

    /**
     * Click on Cotton 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickCotton32Link() {
        cotton32.click();
        return this;
    }

    /**
     * Click on Delivery Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDeliveryLink() {
        delivery.click();
        return this;
    }

    /**
     * Click on Discover Our Stores Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDiscoverOurStoresLink() {
        discoverOurStores.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses1Link() {
        dresses1.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses2Link() {
        dresses2.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses3Link() {
        dresses3.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses4Link() {
        dresses4.click();
        return this;
    }

    /**
     * Click on Dresses 5 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses51Link() {
        if (!dresses51.isSelected()) {
            dresses51.click();
        }
        return this;
    }

    /**
     * Click on Dresses 5 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses52Link() {
        dresses52.click();
        return this;
    }

    /**
     * Click on Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDresses5Link() {
        dresses5.click();
        return this;
    }

    /**
     * Click on Dressy 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDressy11Link() {
        if (!dressy11.isSelected()) {
            dressy11.click();
        }
        return this;
    }

    /**
     * Click on Dressy 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickDressy12Link() {
        dressy12.click();
        return this;
    }

    /**
     * Click on Ecommerce Software By Prestashop Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickEcommerceSoftwareByPrestashopLink() {
        ecommerceSoftwareByPrestashop.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickEveningDresses1Link() {
        eveningDresses1.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickEveningDresses2Link() {
        eveningDresses2.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickEveningDresses3Link() {
        eveningDresses3.click();
        return this;
    }

    /**
     * Click on Evening Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickEveningDresses4Link() {
        eveningDresses4.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Faded Short Sleeve Tshirts Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickFadedShortSleeveTshirtsLink() {
        fadedShortSleeveTshirts.click();
        return this;
    }

    /**
     * Click on Fashion Manufacturer 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickFashionManufacturer71Link() {
        if (!fashionManufacturer71.isSelected()) {
            fashionManufacturer71.click();
        }
        return this;
    }

    /**
     * Click on Fashion Manufacturer 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickFashionManufacturer72Link() {
        fashionManufacturer72.click();
        return this;
    }

    /**
     * Click on Girly 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickGirly31Link() {
        if (!girly31.isSelected()) {
            girly31.click();
        }
        return this;
    }

    /**
     * Click on Girly 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickGirly32Link() {
        girly32.click();
        return this;
    }

    /**
     * Click on Google Plus Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickGooglePlusLink() {
        googlePlus.click();
        return this;
    }

    /**
     * Click on Green 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickGreen11Link() {
        green11.click();
        return this;
    }

    /**
     * Click on Green 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickGreen12Link() {
        green12.click();
        return this;
    }

    /**
     * Click on Grid Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickGridLink() {
        grid.click();
        return this;
    }

    /**
     * Click on In Stock 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickInStock71Link() {
        if (!inStock71.isSelected()) {
            inStock71.click();
        }
        return this;
    }

    /**
     * Click on In Stock 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickInStock72Link() {
        inStock72.click();
        return this;
    }

    /**
     * Click on Information Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickInformationLink() {
        information.click();
        return this;
    }

    /**
     * Click on Joe Black Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickJoeBlackLink() {
        joeBlack.click();
        return this;
    }

    /**
     * Click on L 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickL71Link() {
        if (!l71.isSelected()) {
            l71.click();
        }
        return this;
    }

    /**
     * Click on L 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickL72Link() {
        l72.click();
        return this;
    }

    /**
     * Click on Legal Notice Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickLegalNoticeLink() {
        legalNotice.click();
        return this;
    }

    /**
     * Click on List Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickListLink() {
        list.click();
        return this;
    }

    /**
     * Click on M 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickM71Link() {
        if (!m71.isSelected()) {
            m71.click();
        }
        return this;
    }

    /**
     * Click on M 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickM72Link() {
        m72.click();
        return this;
    }

    /**
     * Click on Maxi Dress 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMaxiDress11Link() {
        if (!maxiDress11.isSelected()) {
            maxiDress11.click();
        }
        return this;
    }

    /**
     * Click on Maxi Dress 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMaxiDress12Link() {
        maxiDress12.click();
        return this;
    }

    /**
     * Click on Midi Dress 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMidiDress11Link() {
        if (!midiDress11.isSelected()) {
            midiDress11.click();
        }
        return this;
    }

    /**
     * Click on Midi Dress 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMidiDress12Link() {
        midiDress12.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore1Link() {
        more1.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore2Link() {
        more2.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore3Link() {
        more3.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore4Link() {
        more4.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore5Link() {
        more5.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore6Link() {
        more6.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMore7Link() {
        more7.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMyAccountLink() {
        myAccount.click();
        return this;
    }

    /**
     * Click on My Addresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMyAddressesLink() {
        myAddresses.click();
        return this;
    }

    /**
     * Click on My Credit Slips Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMyCreditSlipsLink() {
        myCreditSlips.click();
        return this;
    }

    /**
     * Click on My Orders Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMyOrdersLink() {
        myOrders.click();
        return this;
    }

    /**
     * Click on My Personal Info Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickMyPersonalInfoLink() {
        myPersonalInfo.click();
        return this;
    }

    /**
     * Click on New 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickNew71Link() {
        if (!new71.isSelected()) {
            new71.click();
        }
        return this;
    }

    /**
     * Click on New 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickNew72Link() {
        new72.click();
        return this;
    }

    /**
     * Click on New Products Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickNewProductsLink() {
        newProducts.click();
        return this;
    }

    /**
     * Click on Ok Button.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickOkButton() {
        ok.click();
        return this;
    }

    /**
     * Click on Orange 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickOrange31Link() {
        orange31.click();
        return this;
    }

    /**
     * Click on Orange 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickOrange32Link() {
        orange32.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickOurStores1Link() {
        ourStores1.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickOurStores2Link() {
        ourStores2.click();
        return this;
    }

    /**
     * Click on Our Stores Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickOurStores3Link() {
        ourStores3.click();
        return this;
    }

    /**
     * Click on Pink 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPink11Link() {
        pink11.click();
        return this;
    }

    /**
     * Click on Pink 1 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPink12Link() {
        pink12.click();
        return this;
    }

    /**
     * Click on Polyester 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPolyester21Link() {
        if (!polyester21.isSelected()) {
            polyester21.click();
        }
        return this;
    }

    /**
     * Click on Polyester 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPolyester22Link() {
        polyester22.click();
        return this;
    }

    /**
     * Click on Printed Chiffon Dress Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPrintedChiffonDress1Link() {
        printedChiffonDress1.click();
        return this;
    }

    /**
     * Click on Printed Chiffon Dress Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPrintedChiffonDress2Link() {
        printedChiffonDress2.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPrintedDress1Link() {
        printedDress1.click();
        return this;
    }

    /**
     * Click on Printed Dress Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPrintedDress2Link() {
        printedDress2.click();
        return this;
    }

    /**
     * Click on Printed Summer Dress Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPrintedSummerDress1Link() {
        printedSummerDress1.click();
        return this;
    }

    /**
     * Click on Printed Summer Dress Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickPrintedSummerDress2Link() {
        printedSummerDress2.click();
        return this;
    }

    /**
     * Click on Proceed To Checkout Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickProceedToCheckoutLink() {
        proceedToCheckout.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView1Link() {
        quickView1.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView2Link() {
        quickView2.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView3Link() {
        quickView3.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView4Link() {
        quickView4.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView5Link() {
        quickView5.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView6Link() {
        quickView6.click();
        return this;
    }

    /**
     * Click on Quick View Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickQuickView7Link() {
        quickView7.click();
        return this;
    }

    /**
     * Click on S 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickS71Link() {
        if (!s71.isSelected()) {
            s71.click();
        }
        return this;
    }

    /**
     * Click on S 7 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickS72Link() {
        s72.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Secure Payment Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSecurePaymentLink() {
        securePayment.click();
        return this;
    }

    /**
     * Click on Short Dress 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickShortDress21Link() {
        if (!shortDress21.isSelected()) {
            shortDress21.click();
        }
        return this;
    }

    /**
     * Click on Short Dress 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickShortDress22Link() {
        shortDress22.click();
        return this;
    }

    /**
     * Click on Short Sleeve 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickShortSleeve21Link() {
        if (!shortSleeve21.isSelected()) {
            shortSleeve21.click();
        }
        return this;
    }

    /**
     * Click on Short Sleeve 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickShortSleeve22Link() {
        shortSleeve22.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSignOut1Link() {
        signOut1.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSignOut2Link() {
        signOut2.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSpecials1Link() {
        specials1.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSpecials2Link() {
        specials2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSummerDresses1Link() {
        summerDresses1.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSummerDresses2Link() {
        summerDresses2.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSummerDresses3Link() {
        summerDresses3.click();
        return this;
    }

    /**
     * Click on Summer Dresses Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSummerDresses4Link() {
        summerDresses4.click();
        return this;
    }

    /**
     * Click on Supportseleniumframework.com Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickSupportseleniumframeworkComLink() {
        supportseleniumframeworkCom.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTermsAndConditionsOfUse1Link() {
        termsAndConditionsOfUse1.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Of Use Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTermsAndConditionsOfUse2Link() {
        termsAndConditionsOfUse2.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTops1Link() {
        tops1.click();
        return this;
    }

    /**
     * Click on Tops 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTops21Link() {
        if (!tops21.isSelected()) {
            tops21.click();
        }
        return this;
    }

    /**
     * Click on Tops 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTops22Link() {
        tops22.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTops2Link() {
        tops2.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTops3Link() {
        tops3.click();
        return this;
    }

    /**
     * Click on Tops Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTops4Link() {
        tops4.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTshirts1Link() {
        tshirts1.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTshirts2Link() {
        tshirts2.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTshirts3Link() {
        tshirts3.click();
        return this;
    }

    /**
     * Click on Tshirts Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTshirts4Link() {
        tshirts4.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on Viscose 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickViscose21Link() {
        if (!viscose21.isSelected()) {
            viscose21.click();
        }
        return this;
    }

    /**
     * Click on Viscose 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickViscose22Link() {
        viscose22.click();
        return this;
    }

    /**
     * Click on White 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickWhite21Link() {
        white21.click();
        return this;
    }

    /**
     * Click on White 2 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickWhite22Link() {
        white22.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickWomen1Link() {
        women1.click();
        return this;
    }

    /**
     * Click on Women Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickWomen2Link() {
        women2.click();
        return this;
    }

    /**
     * Click on Yellow 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickYellow31Link() {
        yellow31.click();
        return this;
    }

    /**
     * Click on Yellow 3 Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickYellow32Link() {
        yellow32.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn fill() {
        setProductSuccessfullyAddedToYourShoppingTextField();
        clickTops21Link();
        clickDresses51Link();
        clickS71Link();
        clickM71Link();
        clickL71Link();
        clickCotton31Link();
        clickPolyester21Link();
        clickViscose21Link();
        clickCasual31Link();
        clickDressy11Link();
        clickGirly31Link();
        clickColorfulDress11Link();
        clickMaxiDress11Link();
        clickMidiDress11Link();
        clickShortDress21Link();
        clickShortSleeve21Link();
        clickInStock71Link();
        clickFashionManufacturer71Link();
        clickNew71Link();
        setSortByDropDownListField();
        setEcommerceSoftwareByPrestashopTextField2014();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn setEcommerceSoftwareByPrestashopTextField2014() {
        return setEcommerceSoftwareByPrestashopTextField2014(data.get("ECOMMERCE_SOFTWARE_BY_PRESTASHOP_2014"));
    }

    /**
     * Set value to 2014 Ecommerce Software By Prestashop Text field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn setEcommerceSoftwareByPrestashopTextField2014(String ecommerceSoftwareByPrestashopValue2014) {
        ecommerceSoftwareByPrestashop2014.sendKeys(ecommerceSoftwareByPrestashopValue2014);
        return this;
    }

    /**
     * Set default value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn setProductSuccessfullyAddedToYourShoppingTextField() {
        return setProductSuccessfullyAddedToYourShoppingTextField(data.get("PRODUCT_SUCCESSFULLY_ADDED_TO_YOUR_SHOPPING"));
    }

    /**
     * Set value to Product Successfully Added To Your Shopping Cart Text field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn setProductSuccessfullyAddedToYourShoppingTextField(String productSuccessfullyAddedToYourShoppingValue) {
        productSuccessfullyAddedToYourShopping.sendKeys(productSuccessfullyAddedToYourShoppingValue);
        return this;
    }

    /**
     * Set default value to Sort By Drop Down List field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn setSortByDropDownListField() {
        return setSortByDropDownListField(data.get("SORT_BY"));
    }

    /**
     * Set value to Sort By Drop Down List field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn setSortByDropDownListField(String sortByValue) {
        new Select(sortBy).selectByVisibleText(sortByValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn submit() {
        clickSearchButton();
        return this;
    }


    /**
     * Unset Dresses 5 Checkbox field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn unsetDresses5CheckboxField() {
        if (dresses5.isSelected()) {
            dresses5.click();
        }
        return this;
    }


    /**
     * Unset default value from Sort By Drop Down List field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn unsetSortByDropDownListField() {
        return unsetSortByDropDownListField(data.get("SORT_BY"));
    }

    /**
     * Unset value from Sort By Drop Down List field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn unsetSortByDropDownListField(String sortByValue) {
        new Select(sortBy).deselectByVisibleText(sortByValue);
        return this;
    }

    /**
     * Unset Tops 2 Checkbox field.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn unsetTops2CheckboxField() {
        if (tops2.isSelected()) {
            tops2.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn verifyPageLoaded() {
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
     * @return the MyStoreWomwn class instance.
     */
    public MyStoreWomwn verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
