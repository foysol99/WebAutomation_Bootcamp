package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonFresh extends CommonAPI {

    public void amazonfreshItems(){
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Fresh')]")).click();
        clickOnElementByXpath("//a[@id='a-autoid-2-announce']");
        sleepFor(3);


    }
}
