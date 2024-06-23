package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    WebDriver driver ;
    public FramesPage(WebDriver driver){
        this.driver = driver ;
    }

    private final String frameId = "singleframe" ;
    private final By frameInput = By.xpath("(//input[@type = 'text'])") ;
    private final By   iframeWithinAnIframe = By.linkText("Iframe with in an Iframe") ;

    private void switchToFrame(){
        driver.switchTo().frame(frameId) ;
    }

    private void switchToParent(){
        driver.switchTo().parentFrame() ;
    }


    public void insertText( String text ){
        switchToFrame();
        driver.findElement(frameInput).sendKeys(text);
        switchToParent();
    }

    public void clickOnIframeWithinAnIframe(){
        driver.findElement(iframeWithinAnIframe).click();
    }




}
