package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver ;
    Actions actions ;
    public HoverPage(WebDriver driver){
                this.driver=driver ;
    }
    private final By figure = By.cssSelector(".figure") ;
    private final By figureCaption = By.cssSelector(".figcaption") ;
    private final By username = By.tagName("h5") ;
    WebElement element ;
    public void hoverOverFigure(int index){
        element  = driver.findElements(figure).get(index-1) ;
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        
    }
    public String getUsername(){
        WebElement caption = element.findElement(figureCaption) ;
        return caption.findElement(username).getText() ;
    }



}
