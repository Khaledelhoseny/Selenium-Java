package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDownList() throws InterruptedException {
         DropDownPage dropDownPage =  homePage.clickOnDropDownLink()  ;
         Thread.sleep(2000);
         dropDownPage.selectFromDropDownList(1);
    }
}
