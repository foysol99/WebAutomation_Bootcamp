package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SellProducts extends CommonAPI {

    public void sellItem(){
        clickOnElementByXpath("//li[@class='nav_first']//a[@class='nav_a'][contains(text(),'Sell on Amazon')]");
        sleepFor(3);


    }
}
