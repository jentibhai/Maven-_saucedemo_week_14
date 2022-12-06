package saucedemo.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import saucedemo.com.utility.Utility;

import java.util.List;

public class LoginPage extends Utility {


    By username = By.name("user-name");

    By password = By.name("password");

    By loginbutton = By.xpath("//input[@id='login-button']");

    By errorProductNumber = By.className("inventory_item");

    By errormessage3 = By.xpath("//span[@class='title']");

    By verifyMessage=By.xpath("//span[@class='title']");

    public void enterUserName(String username2) {
        sendTextToElement(username, username2);
    }

    public void enterPassword(String password2) {
        sendTextToElement(password, password2);
    }

    public void clickOnloginButton() {
        clickOnElement(loginbutton);
    }


    public String verifyErrorMessage3() {
        return getTextFromElement(errormessage3);
    }
    public String verifyText(){
        return getTextFromElement(verifyMessage);
    }

    public int getProductsError() {
        List<WebElement> list = driver.findElements(errorProductNumber);
        int actualNumber = list.size();
        return actualNumber;
    }
}




