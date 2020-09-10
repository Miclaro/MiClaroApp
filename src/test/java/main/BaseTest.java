package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import postpago.postpagoPages.DetalleConsumosPage;

import java.net.MalformedURLException;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;

    public BasePage basePage;
    protected DetalleConsumosPage detalleConsumosPage;

    @BeforeMethod(alwaysRun = true)
    public void beforeSuite() throws MalformedURLException {
        this.basePage = new BasePage(driver);
        this.detalleConsumosPage = new DetalleConsumosPage(this.basePage.getDriver());

    }

    @AfterMethod
    public void quitDriver() throws MalformedURLException {
        this.basePage.getDriver().quit();
    }
}
