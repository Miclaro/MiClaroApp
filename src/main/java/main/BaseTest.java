package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import test.postpago.postpagoPages.DetalleConsumosPage;

import java.net.MalformedURLException;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;

    public BasePage basePage;
    protected DetalleConsumosPage detalleConsumosPage;


    @BeforeTest(alwaysRun = true)
    public void beforeTest() throws MalformedURLException {
        this.basePage = new BasePage(driver);
        this.detalleConsumosPage = new DetalleConsumosPage(this.basePage.getDriver());
    }


    @AfterTest
    public void quitDriver() throws MalformedURLException {
        this.basePage.getDriver().quit();
    }
}
