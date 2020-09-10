package main;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.WaitUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BasePage {

    WaitUtils myWaitUtils;
    public AndroidDriver<MobileElement> driver;

    /**
     * Constructor
     * @param driver: AndroidDriver
     */
    public BasePage (AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        myWaitUtils = new WaitUtils();
    }


    public AndroidDriver<MobileElement> getDriver()  throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Custom Phone_1");
        caps.setCapability("deviceManufacturer", "Genymotion");
        //caps.setCapability("automationName", "UiAutomator2");
        //caps.setCapability("udid", "192.168.36.109:5555");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.clarocolombia.miclaro");
        caps.setCapability("appActivity", "com.clarocolombia.miclaro.activities.Splash");
        caps.setCapability("noReset", "true");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        return driver;
    }
}
