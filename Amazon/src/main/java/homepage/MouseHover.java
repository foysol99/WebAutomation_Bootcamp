package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends CommonAPI {

    public void mousehoverMenu(){
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
        sleepFor(3);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        sleepFor(2);
        clickOnElementByXpath("//div[@id='nav-al-wishlist']//a[2]");




    }
}
