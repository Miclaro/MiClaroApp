package main;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BasePage {

    public static AndroidDriver<MobileElement> driver;
    protected static ThreadLocal<String> dateTime = new ThreadLocal<>();

    /**
     * Constructor
     *
     * @param pageDriver: AndroidDriver
     */
    public BasePage(AndroidDriver<MobileElement> pageDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(pageDriver), this);
        driver = pageDriver;
    }

    public static String getDateTime() {
        return dateTime.get();
    }


    public AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Custom Phone_1");
        caps.setCapability("deviceManufacturer", "Genymotion");
        caps.setCapability(MobileCapabilityType. AUTOMATION_NAME, "UiAutomator2");
        //caps.setCapability("udid", "192.168.36.109:5555");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.clarocolombia.miclaro");
        caps.setCapability("appActivity", "com.clarocolombia.miclaro.activities.Splash");
        caps.setCapability("noReset", "true");
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }



    public static void horizontalScroll(By panel){
        //com.clarocolombia.miclaro.debug:id/rvAdminProducts
       List<MobileElement> e = driver.findElements(panel);

       MobileElement firstElement = e.get(0);
       MobileElement thirddElement = e.get(3);

       int yCoordinate = firstElement.getLocation().y + (firstElement.getSize().height/4);
       int xCoordinate = firstElement.getLocation().x;
       int xcoordinateThirdElement = thirddElement.getLocation().x;


        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(xcoordinateThirdElement, yCoordinate))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(xCoordinate, yCoordinate))
                .release()
                .perform();

    }


    public static void allowAlert()  {
       List<MobileElement> alert;
       boolean alertIsPresent = true;

        while (alertIsPresent == true) {

           driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
           alert = driver.findElements(By.id("com.clarocolombia.miclaro:id/btn_aceptar"));


            if (alert.size()!=0){
                //driver.findElement(By.id("com.clarocolombia.miclaro.debug:id/btn_aceptar")).click();
                alert.get(0).click();
                alertIsPresent = true;

            } else {
                alertIsPresent = false;
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        }
        }


        public static void refreshApp(){
            driver.findElement(By.id("com.clarocolombia.miclaro:id/navigationInicioMenu")).click();
        }


}


