package test.postpago.postpagoPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

import java.net.MalformedURLException;

public class DetalleConsumosPage extends BasePage {

    TestUtils testUtils = new TestUtils();

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */
    public DetalleConsumosPage (AndroidDriver<MobileElement> driver) throws MalformedURLException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Web Elements
     */
    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/btn_cancelar")
    private AndroidElement btnCancelarActualizar;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/contentSpinnerInicio")
    private AndroidElement lisHome;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3103021199']")
    private AndroidElement lblLíneaPostpago;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[1]")
    private AndroidElement btnDetalleConsumos;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/txtUltimaActulizacion")
    private AndroidElement lblUltimaActualizacion;



    /**
     * Actions Methods
     */

    public void clickBtnCancelarActualizar(){
        testUtils.waitElement(btnCancelarActualizar);
        btnCancelarActualizar.click();
    }

    public void setLisHome() {
        testUtils.waitElement(lisHome);
        lisHome.click();
    }

    public void setlblLíneaPostpago() {
        testUtils.waitElement(lblLíneaPostpago);
        lblLíneaPostpago.click();
    }

    public void clickBtnDetalleConsumos() {
        testUtils.waitElement(btnDetalleConsumos);
        btnDetalleConsumos.click();
    }

    public String getLblUltimaActualizacion(){
        testUtils.waitElement(lblUltimaActualizacion);
        String txtUltimaActualizacion = lblUltimaActualizacion.getText();
        return txtUltimaActualizacion;
    }



    /**
     * Main Method
     */

    public void checkDetalleConsumos() {
        this.clickBtnCancelarActualizar();
        this.setLisHome();
        this.setlblLíneaPostpago();
        this.clickBtnDetalleConsumos();
        this.getLblUltimaActualizacion();
    }
}
