package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {
    WebDriver driver ;
    public CheckBoxPage(WebDriver driver) {
        this.driver = driver ;
    }
    private final By checkBoxOne = By.xpath("(//input[@type='checkbox'])[1]") ;
    private final By chekcBoxTwo = By.xpath(" (//input[@type='checkbox'])[2]") ;


    //ACTION

    public void clickOnCheckBoxOne (){
        driver.findElement(checkBoxOne).click();

    }
    public void clickOnCheckBoxTow (){
        driver.findElement(chekcBoxTwo).click();

    }

    public boolean checkBoxOneIsSelected (){
        return driver.findElement(checkBoxOne).isSelected();
    }

    public boolean checkBoxTwoIsSelected (){
        return driver.findElement(chekcBoxTwo).isSelected();
    }
}
