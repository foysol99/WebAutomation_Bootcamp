package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Registry extends CommonAPI {

    public void register(){
        clickOnElementByXpath("//a[contains(text(),'Registry')]");
        clickOnElementByXpath("//div[contains(@class,'acsUxWidget')]//div[2]//div[1]//div[1]//div[1]//a[1]//img[1]");
        typeOnElementByXpath("//input[@name='nameOrEmail']", "Queens");
        clickOnElementByXpath("//div[@class='wedding-arrow__head']");
        sleepFor(3);



    }
}
