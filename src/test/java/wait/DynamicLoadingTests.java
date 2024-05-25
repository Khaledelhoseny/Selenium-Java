package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.ExampleOnePage;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void exampleOneTest()  {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink() ;
        ExampleOnePage exampleOnePage = dynamicLoadingPage.clickOneExampleOneLink() ;

        exampleOnePage.clickOnStartButton();

        String expectedResult = "Hello World!" ;
//        Thread.sleep(5000);
        String actualResult =  exampleOnePage.getHelloWorldMessage()  ;
        Assert.assertEquals(actualResult ,expectedResult );


    }
}
