package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    WebDriver driver ;
    Actions actions ;
   public DragAndDropPage(WebDriver driver){
       this.driver = driver ;
   }

   //Locators
    private final By columnA = By.id("column-a") ;
    private final By columnB = By.id("column-b") ;


    public void dragAndDrop(){
        actions = new Actions(driver) ;
        actions.clickAndHold(driver.findElement(columnA)).moveToElement(driver.findElement(columnB)).release().build().perform();
    }


}
