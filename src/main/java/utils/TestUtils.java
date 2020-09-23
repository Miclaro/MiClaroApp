package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import main.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;

public class TestUtils {

    //public AndroidDriver<MobileElement> driver;
    protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

    public static final long WAIT = 10;

    public HashMap<String, String> parseStringXML(InputStream file) throws Exception{
        HashMap<String, String> stringMap = new HashMap<String, String>();
        //Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Build Document
        Document document = builder.parse(file);

        //Normalize the XML Structure; It's just too important !!
        document.getDocumentElement().normalize();

        //Here comes the root node
        Element root = document.getDocumentElement();

        //Get all elements
        NodeList nList = document.getElementsByTagName("string");

        for (int temp = 0; temp < nList.getLength(); temp++)
        {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element eElement = (Element) node;
                // Store each element key value in map
                stringMap.put(eElement.getAttribute("name"), eElement.getTextContent());
            }
        }
        return stringMap;
    }

    public String dateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public Logger log() {
        return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }


    public AppiumDriver getDriver() {
        return driver.get();
    }

    public boolean waitElement(WebElement element){
        try{

            WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);

            ExpectedCondition<WebElement> cond1 = ExpectedConditions.elementToBeClickable(element);
            // ExpectedCondition<WebElement> cond2 = ExpectedConditions.visibilityOf(element);
            // ExpectedCondition<Boolean> cond = ExpectedConditions.and(cond1, cond2);

            wait.until(cond1);
            return true;
        }catch(Exception e){
            return false;
        }
    }


    public void waitForVisibility(MobileElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
/**
    public void waitForVisibility(WebElement e){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(e));
    } **/

}
