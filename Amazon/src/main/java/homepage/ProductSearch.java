package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductSearch extends CommonAPI {

    public void search(){
       typeOnElementByXpath("//input[@id='twotabsearchtextbox']","holiday gift wraps");
       clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']");
        sleepFor(2);
        clickOnElementByXpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=1']//img[@class='s-image']");



    }
}
