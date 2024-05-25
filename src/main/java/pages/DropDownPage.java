package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver ;
    Select select ;
    public DropDownPage(WebDriver driver) {
            this.driver = driver ;
    }

    private final By dropDownList = By.xpath("//select[@id='dropdown']") ;
    public void selectFromDropDownList(int index){
        select = new Select(driver.findElement(dropDownList)) ;
        select.selectByIndex(index);
    }


}
