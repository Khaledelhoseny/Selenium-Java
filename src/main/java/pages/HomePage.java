package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver ;
    public HomePage(WebDriver driver){
        this.driver = driver ;
    }

    private final By formAuthemticationLink = By.linkText("Form Authentication");
    private final By checkBoxLink = By.linkText("Checkboxes") ;

    public LoginPage clickOnFormAuthemticationLink(){
        driver.findElement(formAuthemticationLink).click();
        return new LoginPage(driver) ;
    }

    public CheckBoxPage clickOnCheckBoxLink (){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver) ;
    }


}
