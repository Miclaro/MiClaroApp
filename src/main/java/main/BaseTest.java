package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import test.postpago.postpagoPages.AdministraTusProductosPosPage;

import java.net.MalformedURLException;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;

    public BasePage basePage;
    protected AdministraTusProductosPosPage administraTusProductosPage;


    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws MalformedURLException {
        basePage = new BasePage(driver);
        administraTusProductosPage = new AdministraTusProductosPosPage(basePage.getDriver());
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(){
        basePage.refreshApp();
    }


    @AfterMethod(alwaysRun = true)
    public void allowAlert() {
        basePage.allowAlert();
        basePage.driver.navigate().back();



    }
}
