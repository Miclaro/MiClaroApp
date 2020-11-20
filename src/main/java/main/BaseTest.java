package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;
    public BasePage basePage;



    @BeforeClass(alwaysRun = true)
    public void beforeSuite() throws MalformedURLException {
        this.basePage = new BasePage(driver);
    }



    @AfterMethod(alwaysRun = true)
    public void allowAlert() {
        basePage.allowAlert();
        basePage.driver.navigate().back();
        basePage.refreshApp();



    }
}
