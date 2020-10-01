package main;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class BasePage {

    public AndroidDriver<MobileElement> driver;
    protected static ThreadLocal <String> dateTime = new ThreadLocal<String>();

    /**
     * Constructor
     * @param pageDriver: AndroidDriver
     */
    public BasePage (AndroidDriver<MobileElement> pageDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(pageDriver), this);
        this.driver = pageDriver;
    }

    public String getDateTime() {
        return dateTime.get();
    }


    public AndroidDriver<MobileElement> getDriver()  throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Custom Phone_1");
        caps.setCapability("deviceManufacturer", "Genymotion");
        caps.setCapability("automationName", "UiAutomator2");
        //caps.setCapability("udid", "192.168.36.109:5555");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.clarocolombia.miclaro.debug");
        caps.setCapability("appActivity", "com.clarocolombia.miclaro.activities.Splash");
        caps.setCapability("noReset", "true");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
