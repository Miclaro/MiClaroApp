package test.postpago.postpagoPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

public class DetalleConsumosPage extends BasePage {

     public static TestUtils testUtils = new TestUtils();;
    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */
    public DetalleConsumosPage (AndroidDriver<MobileElement> driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Web Elements
     */

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/tvPostPago")
    private AndroidElement btnPostpagoHome;



    /**
     * Actions Methods
     */


    public void setBtnpostpagohome() {
        testUtils.waitElement(btnPostpagoHome);
        btnPostpagoHome.click();
    }
}
