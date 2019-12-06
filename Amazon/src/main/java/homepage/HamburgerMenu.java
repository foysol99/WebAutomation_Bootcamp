package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HamburgerMenu extends CommonAPI {

    public void hamburgerProducts(){
        clickOnElementByXpath("//i[@class='hm-icon nav-sprite']");
        sleepFor(2);
        clickOnElementByXpath("//ul[contains(@class,'hmenu-visible')]//li[5]//a[1]");
        sleepFor(2);
        clickOnElementByXpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[5]//a[1]//div[1]");
        sleepFor(3);
    }
}
