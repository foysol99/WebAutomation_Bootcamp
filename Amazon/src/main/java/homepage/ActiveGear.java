package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActiveGear extends CommonAPI {

    public void activegearItems(){
        sleepFor(2);
        clickOnElementByXpath("//a[@class='a-link-normal quadrant-overlay']");
        sleepFor(3);

    }
}
