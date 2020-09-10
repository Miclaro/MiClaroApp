package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public AndroidDriver<MobileElement> driver;

    public boolean waitElement(WebElement element){
        try{

            WebDriverWait wait = new WebDriverWait(driver, 600);

            ExpectedCondition<WebElement> cond1 = ExpectedConditions.elementToBeClickable(element);
            ExpectedCondition<WebElement> cond2 = ExpectedConditions.visibilityOf(element);
            ExpectedCondition<Boolean> cond = ExpectedConditions.and(cond1, cond2);

            wait.until(cond);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
