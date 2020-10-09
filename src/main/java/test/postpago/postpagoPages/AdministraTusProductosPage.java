package test.postpago.postpagoPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;

import java.net.MalformedURLException;

public class AdministraTusProductosPage extends BasePage {

    TestUtils testUtils = new TestUtils();

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */
    public AdministraTusProductosPage(AndroidDriver<MobileElement> driver) throws MalformedURLException {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Mobile Elements
     */

    //General

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/btn_cancelar")
    private AndroidElement btnCancelarActualizar;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/contentSpinnerInicio")
    private AndroidElement lisHome;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3103021199']")
    private AndroidElement lblLíneaPostpago;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private AndroidElement btnAtras;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/lbUserHeader")
    private AndroidElement lblHolaUser;

    By panelAdminProducts =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView");



    //Detalle de consumos

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[1]")
    private AndroidElement btnDetalleConsumos;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/txtUltimaActulizacion")
    private AndroidElement lblUltimaActualizacion;


    //Paga Tu Factura

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[2]")
    private AndroidElement btnPagaTuFactura;


    //Detalle de plan

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[3]")
    private AndroidElement btDetalleDePlan;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/tv_plan")
    private AndroidElement lblPlanPostpago;


    //Recargas y paquetes

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[3]")
    private AndroidElement btnRecargasYPaquetes;




    /**
     * Actions Methods
     */

    //General

    public void clickBtnCancelarActualizar(){
        testUtils.waitElement(btnCancelarActualizar);
        btnCancelarActualizar.click();
    }

    public void setLisHome() {
        testUtils.waitElement(lisHome);
        lisHome.click();
    }

    public void clicklblLíneaPostpago() {
        testUtils.waitElement(lblLíneaPostpago);
        lblLíneaPostpago.click();
    }

    public String getlblLíneaPostpago(){
        testUtils.waitElement(lblUltimaActualizacion);
        String txtLblLíneaPostpago = lblLíneaPostpago.getText();
        return txtLblLíneaPostpago;
    }

    public void clickBtnAtras(){
        testUtils.waitElement(btnAtras);
        btnAtras.click();
    }


    //Detalle de Consumos

    public void clickBtnDetalleConsumos() {
        testUtils.waitElement(btnDetalleConsumos);
        btnDetalleConsumos.click();
    }

    public String getLblUltimaActualizacion(){
        testUtils.waitElement(lblUltimaActualizacion);
        String txtUltimaActualizacion = lblUltimaActualizacion.getText();
        return txtUltimaActualizacion;
    }


    //Paga Tu Factura

    public void clicBtnPagaTuFactura(){
        testUtils.waitElement(btnPagaTuFactura);
        btnPagaTuFactura.click();
    }


    //Detalle de plan
    public void clickBtDetalleDePlan(){
        testUtils.waitElement(btDetalleDePlan);
        btDetalleDePlan.click();
    }

    public void getLblPlanPostpago(){
        testUtils.waitElement(lblPlanPostpago);
        lblPlanPostpago.getText();
    }


    //Recargas y Paquetes

    public void clickBtnRecargasYPaquetes() throws Exception {
        testUtils.waitElement(btDetalleDePlan);
        horizontalScroll(panelAdminProducts);
        btnDetalleConsumos.click();
    }




    /**
     * Main Method
     */

    public void checkDetalleConsumos() {
        this.clickBtnCancelarActualizar();
        this.setLisHome();
        this.clicklblLíneaPostpago();
        this.clickBtnDetalleConsumos();
        this.getLblUltimaActualizacion();
    }

    public void checkPagaTuFactura(){
        this.clicBtnPagaTuFactura();
        this.getlblLíneaPostpago();
    }

    public void checkDetalleDePlan(){
        this.clickBtDetalleDePlan();
        this.getlblLíneaPostpago();
        this.getLblPlanPostpago();
    }

    public void checkRecargasYPaquetes() throws Exception {
        this.clickBtnRecargasYPaquetes();
    }
}
