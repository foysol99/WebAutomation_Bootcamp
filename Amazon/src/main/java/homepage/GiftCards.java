package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GiftCards extends CommonAPI {

    public void giftcardSearch(){
        clickOnElementByXpath("//a[contains(text(),'Gift Cards')]");
        sleepFor(3);
    }
}
