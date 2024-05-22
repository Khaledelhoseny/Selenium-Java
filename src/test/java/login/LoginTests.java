package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test(priority = 1)
    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickOnFormAuthemticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult = secureAreaPage.getValidationMessage() ;
        String expectedResult = "You logged into a secure area!" ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test (priority = 2)
    public void testInvalidUserName(){

        LoginPage loginPage = homePage.clickOnFormAuthemticationLink();
        loginPage.insertUsername("tomsmasdasdith");
        loginPage.insertPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String actualResult = loginPage.getValidationMessage() ;
        String expectedResult = "Your username is invalid!" ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test (priority = 3)
    public void testInvalidPassword(){

        LoginPage loginPage = homePage.clickOnFormAuthemticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPasdadassword!");
        loginPage.clickOnLoginButton();
        String actualResult = loginPage.getValidationMessage() ;
        String expectedResult = "Your password is invalid!" ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
