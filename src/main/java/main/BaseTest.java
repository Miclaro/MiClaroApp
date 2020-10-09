package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import test.postpago.postpagoPages.AdministraTusProductosPage;

import java.net.MalformedURLException;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;

    public BasePage basePage;
    protected AdministraTusProductosPage administraTusProductosPage;


    @BeforeTest(alwaysRun = true)
    public void beforeTest() throws MalformedURLException {
        this.basePage = new BasePage(driver);
        this.administraTusProductosPage = new AdministraTusProductosPage(this.basePage.getDriver());
    }


    /** @AfterSuite
    public void quitDriver() throws MalformedURLException {
        this.basePage.getDriver().quit();
    }**/
}
