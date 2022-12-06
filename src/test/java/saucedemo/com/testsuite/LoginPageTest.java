package saucedemo.com.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.com.pages.HomePage;
import saucedemo.com.pages.LoginPage;
import saucedemo.com.testbase.BaseTest;

public class LoginPageTest extends BaseTest {


   LoginPage loginPage=new LoginPage();

@Test
   public void userSholdLoginSuccessfullyWithValidCredentials(){
           loginPage.clickOnloginButton();
           loginPage.enterUserName("standard_user");
           loginPage.enterPassword("secret_sauce");
           loginPage.clickOnloginButton();
           String expectedText ="PRODUCTS";
           String actualText = loginPage.verifyErrorMessage3();
           Assert.assertEquals(actualText,expectedText,"PRODUCT");

}

@Test
   public void verifyThatSixProductsAreDisplayedOnPage(){
    loginPage.enterUserName("standard_user");
    loginPage.enterPassword("secret_sauce");
    loginPage.clickOnloginButton();
    int expectedProductNumber = 6;
    Assert.assertEquals(loginPage.getProductsError(),expectedProductNumber,"Invalid data matched");
}

}


