package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonDevices extends CommonAPI {

public void amazondevice(){
        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
        sleepFor(2);
        clickOnElementByXpath("//option[contains(text(),'Amazon Devices')]");

        }
        }
