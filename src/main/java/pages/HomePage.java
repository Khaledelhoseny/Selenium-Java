package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver ;
    public HomePage(WebDriver driver){
        this.driver = driver ;
    }
    private final By formAuthemticationLink = By.linkText("Form Authentication");
    private final By checkBoxLink = By.linkText("Checkboxes") ;
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading") ;
    private final By dropDownLoadingLink = By.linkText("Dropdown") ;
    private final By jsAleartsLink = By.linkText("JavaScript Alerts") ;
    private final By hoverLink = By.linkText("Hovers");
    private final By dragAndDropLink = By.linkText("Drag and Drop");


    public LoginPage clickOnFormAuthemticationLink(){
        driver.findElement(formAuthemticationLink).click();
        return new LoginPage(driver) ;
    }

    public CheckBoxPage clickOnCheckBoxLink (){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver) ;
    }


    public DynamicLoadingPage clickOnDynamicLoadingLink (){
        driver.findElement(dynamicLoadingLink).click();

        return new DynamicLoadingPage(driver) ;
    }

    public DropDownPage clickOnDropDownLink (){
        driver.findElement(dropDownLoadingLink).click();

        return new DropDownPage(driver) ;
    }

    public JsAlertPage clickOnJsAleartsLink(){
        driver.findElement(jsAleartsLink).click();
        return new JsAlertPage(driver) ;
    }

    public HoverPage clickOnHoverLink(){
        WebElement element = driver.findElement(hoverLink) ;
        element.click();
        return new HoverPage(driver);
    }

    public DragAndDropPage clickOnDragAndDropLink(){
        clickOnLink(dragAndDropLink);
        return new DragAndDropPage(driver) ;
    }

    public void clickOnLink( By locator ){
        driver.findElement(locator).click();
    }


}
