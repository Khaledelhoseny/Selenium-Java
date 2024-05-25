package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOnePage {
    WebDriver driver ;
    WebDriverWait wait ;
    public ExampleOnePage(WebDriver driver) {
        this.driver = driver ;
    }

    private final By startButton = By.cssSelector("#start > button") ;
    private final By helloWorldMessage = By.cssSelector("#finish > h4") ;
    public void clickOnStartButton(){
        driver.findElement(startButton).click();

    }

    public String getHelloWorldMessage(){

        wait = new WebDriverWait(driver , Duration.ofSeconds(20)) ;
        wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldMessage)) ;
        return  driver.findElement(helloWorldMessage).getText() ;

    }






}
