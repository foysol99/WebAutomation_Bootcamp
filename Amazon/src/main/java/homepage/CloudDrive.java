package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CloudDrive extends CommonAPI {

    public void cloudstorage(){
        clickOnElementByXpath("//a[contains(text(),'Amazon Drive')]");
        sleepFor(3);
    }
}
