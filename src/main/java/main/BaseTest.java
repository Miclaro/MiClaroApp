package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import test.postpago.postpagoPages.AdministraTusProductosPage;

import java.net.MalformedURLException;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;

    public BasePage basePage;
    protected AdministraTusProductosPage administraTusProductosPage;


    @BeforeSuite(alwaysRun = true)
    public void beforeTest() throws MalformedURLException {
        basePage = new BasePage(driver);
        administraTusProductosPage = new AdministraTusProductosPage(basePage.getDriver());
    }


    @AfterMethod(alwaysRun = true)
    public void allowAlert() {
        basePage.allowAlert();
        basePage.driver.navigate().back();

    }
}
