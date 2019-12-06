package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends CommonAPI {

    public void loginvalue() {
        clickOnElementByXpath("//span[contains(text(),'Hello, Sign in')]");
        typeOnElementByXpath("//input[@id='ap_email']","bhuiyanfoysol@gmail.com");
        clickOnElementByXpath("//input[@id='continue']");
        sleepFor(3);
        typeOnElementByXpath("//input[@id='ap_password']", "12345678");
        clickOnElementByXpath("//input[@id='signInSubmit']");
        sleepFor(3);
    }

}
