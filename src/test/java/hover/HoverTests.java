package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTests extends BaseTests {
    @Test
    public void testGetUSerData(){
      HoverPage hoverPage = homePage.clickOnHoverLink() ;
      hoverPage.hoverOverFigure(1);
      String actualResult =  hoverPage.getUsername();
      String expectedResult = "name: user1" ;
      Assert.assertEquals(actualResult ,expectedResult );

    }

}
