import base.CommonAPI;
import homepage.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends CommonAPI {
    ActiveGear activeGear;

    @BeforeMethod
    public void getactivegear() {
        activeGear = PageFactory.initElements(driver, ActiveGear.class);
    }

    @Test
    public void setActiveGear() {
        activeGear.activegearItems();
    }

    AmazonDevices amazonDevices;

    @BeforeMethod
    public void getamazondevices() {
        amazonDevices = PageFactory.initElements(driver, AmazonDevices.class);
    }

    @Test
    public void setAmazonDevices() {
        amazonDevices.amazondevice();
    }

    AmazonFresh amazonFresh;

    @BeforeMethod
    public void getamazonFresh() {
        amazonFresh = PageFactory.initElements(driver, AmazonFresh.class);
    }

    @Test
    public void setAmazonFresh() {
        amazonFresh.amazonfreshItems();
    }

    CloudDrive cloudDrive;

    @BeforeMethod
    public void getcloudDrive() {
        cloudDrive = PageFactory.initElements(driver, CloudDrive.class);
    }

    @Test
    public void setCloudDrive() {
        cloudDrive.cloudstorage();
    }

    DropdownItems dropdownItems;

    @BeforeMethod
    public void getdropdownItems() {
        dropdownItems = PageFactory.initElements(driver, DropdownItems.class);
    }

    @Test
    public void setDropdownItems() {
        dropdownItems.Dropdownmenu();
    }

    GiftCards giftCards;

    @BeforeMethod
    public void getgiftCards() {
        giftCards = PageFactory.initElements(driver, GiftCards.class);
    }

    @Test
    public void setGiftCards() {
        giftCards.giftcardSearch();
    }

    HamburgerMenu hamburgerMenu;

    @BeforeMethod
    public void gethamburgerMenu() {
        hamburgerMenu = PageFactory.initElements(driver, HamburgerMenu.class);
    }

    @Test
    public void setHamburgerMenu() {
        hamburgerMenu.hamburgerProducts();
    }

    Login login;

    @BeforeMethod
    public void getlogin() {
        login = PageFactory.initElements(driver, Login.class);
    }

    @Test
    public void setLogin() {
        login.loginvalue();
    }

    MouseHover mouseHover;

    @BeforeMethod
    public void getmouseHover() {
        mouseHover = PageFactory.initElements(driver, MouseHover.class);
    }

    @Test
    public void setMouseHover() {
        mouseHover.mousehoverMenu();
    }

    ProductSearch productSearch;

    @BeforeMethod
    public void getproductsearch() {
        productSearch = PageFactory.initElements(driver, ProductSearch.class);
    }

    @Test
    public void setProductSearch() {
        productSearch.search();
    }

    Registry registry;

    @BeforeMethod
    public void getregistry() {
        registry = PageFactory.initElements(driver, Registry.class);
    }

    @Test
    public void setRegistry() {
        registry.register();
    }

    SellProducts sellProducts;

    @BeforeMethod
    public void getsellProducts() {
        sellProducts = PageFactory.initElements(driver, SellProducts.class);
    }

    @Test
    public void setSellProducts() {
        sellProducts.sellItem();
    }

    SpecialDeals specialDeals;

    @BeforeMethod
    public void getspecialDeals() {
        specialDeals = PageFactory.initElements(driver, SpecialDeals.class);
    }

    @Test
    public void setSpecialDeals() {
        specialDeals.specialdeal();
    }

    UpdatedItems updatedItems;

    @BeforeMethod
    public void getupdatedItems() {
        updatedItems = PageFactory.initElements(driver, UpdatedItems.class);
    }

    @Test
    public void setUpdatedItems() {
        updatedItems.updatedValues();
    }
ProductDetails productDetails;
    @BeforeMethod
    public void getproductdetails(){
        productDetails=PageFactory.initElements(driver,ProductDetails.class);
    }
    @Test
    public void setProductDetails(){
        productDetails.productvalue();
    }
}








