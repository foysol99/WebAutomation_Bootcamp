package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SpecialDeals extends CommonAPI {

    public void specialdeal(){
        driver.findElement(By.xpath("//a[contains(text(),'12 Days of Deals')]")).click();
        sleepFor(3);


    }
}
