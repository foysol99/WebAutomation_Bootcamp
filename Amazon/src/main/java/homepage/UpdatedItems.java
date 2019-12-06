package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UpdatedItems extends CommonAPI {

    public void updatedValues(){
        clickOnElementByXpath("//a[contains(text(),'New Releases')]");
clickOnElementByXpath("//a[contains(text(),'Appliances')]");

    }
}
