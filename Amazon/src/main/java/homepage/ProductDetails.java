package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductDetails extends CommonAPI {

    public void productvalue(){

            typeOnElementByXpath("//input[@id='twotabsearchtextbox']","gender reveal ");
            clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']");
            sleepFor(2);
            clickOnElementByXpath("//span[contains(text(),'Ikava Gender Reveal Party supplies kit Boy or Girl')]");
        System.out.println(driver.findElement(By.xpath("//div[@id='centerCol']")).getText());
    }

}
