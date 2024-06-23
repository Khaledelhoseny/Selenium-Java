package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertPage {
    WebDriver driver ;
    public JsAlertPage(WebDriver driver) {
        this.driver= driver ;
    }


    private final By jsAlertButton = By.xpath("//button[ contains ( text()  , 'Alert' ) ]");
    private final By validationMessage = By.id("result");
    private final By jsConfirmButton = By.xpath("//button[ contains ( text()  , 'Confirm' ) ]");


    public void clickOnJsAlertButton (){
        driver.findElement(jsAlertButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText() ;
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public void clickOnJsConfirmButton (){
        driver.findElement(jsAlertButton).click();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

}
