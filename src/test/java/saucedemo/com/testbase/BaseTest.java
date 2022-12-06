package saucedemo.com.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import saucedemo.com.propertyreader.PropertyReader;
import saucedemo.com.utility.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closebrowser();
    }


}
