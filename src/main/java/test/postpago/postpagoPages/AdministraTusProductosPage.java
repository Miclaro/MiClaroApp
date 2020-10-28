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

    String lineaPostpago;
    By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + lineaPostpago + "']");

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private AndroidElement btnAtras;

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/lbUserHeader")
    private AndroidElement lblHolaUser;

    By panelAdminProducts =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView");

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[1]")
    private AndroidElement btnPosicion1Parrilla1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[2]")
    private  AndroidElement btnPosicion2Parrilla1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[3]")
    private  AndroidElement btnPosicion3Parrilla1;

    @AndroidFindBy (id = "com.clarocolombia.miclaro.debug:id/btn_aceptar")
    private AndroidElement btnCerrarMensajeError;


    //Detalle de consumos


    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/txtUltimaActulizacion")
    private AndroidElement lblUltimaActualizacion;


    //Paga Tu Factura

    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/tv_nombre_usuario")
    private AndroidElement lblNombreUsuario;



    //Detalle de plan


    @AndroidFindBy(id = "com.clarocolombia.miclaro.debug:id/tv_plan")
    private AndroidElement lblPlanPostpago;


    //Recargas y paquetes

    @AndroidFindBy (id = "com.clarocolombia.miclaro.debug:id/edtNumero")
    private AndroidElement txtLineaPosRecargasPaquetes;

    @AndroidFindBy (id = "com.clarocolombia.miclaro.debug:id/imgBack")
    private AndroidElement btnAtrasRecargasPaquetes;







    /**
     * Actions Methods
     */

    //General

    public void clickLineaPostpago(String linea){
        By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + linea + "']");
        testUtils.waitElement(lblLíneaPostpago);
        driver.findElement(lblLíneaPostpago).click();
    }

    public String getlblLíneaPostpago(String linea){
        By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + linea + "']");
        testUtils.waitElement(lblUltimaActualizacion);
        testUtils.waitElement(lblLíneaPostpago);
        String txtLblLíneaPostpago = driver.findElement(lblLíneaPostpago).getText();
        return txtLblLíneaPostpago;
    }

    public void clickBtnAtras(){
        testUtils.waitElement(btnAtras);
        btnAtras.click();
    }


    //Detalle de Consumos

    public String getLblUltimaActualizacion(){
        testUtils.waitElement(lblUltimaActualizacion);
        String txtUltimaActualizacion = lblUltimaActualizacion.getText();
        return txtUltimaActualizacion;
    }


    //Recargas y Paquetes

    public String getTxtLineaPosRecargasPaquetes(){
        testUtils.waitElement(txtLineaPosRecargasPaquetes);
        String lineaPosPaquetesRecargas = txtLineaPosRecargasPaquetes.getText();
        return lineaPosPaquetesRecargas;
    }

    public void clickBtnAtrasRecargasPaquetes() throws InterruptedException {
        testUtils.clickElement(btnAtrasRecargasPaquetes);

    }



    /**
     * Main Method
     */

    public void checkDetalleConsumos(String linea)  {
        testUtils.clickElement(btnCancelarActualizar);
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.clickElement(btnPosicion1Parrilla1);
    }

    public void checkPagaTuFactura() {
        testUtils.clickElement(btnPosicion2Parrilla1);
        testUtils.getElement(lblNombreUsuario);
    }

    public void checkDetalleDePlan() {
        testUtils.clickElement(btnPosicion3Parrilla1);
        testUtils.getElement(lblPlanPostpago);
    }

    public void checkRecargasYPaquetes() {
        testUtils.horizontalScrollClickElement(btnPosicion1Parrilla1, panelAdminProducts);
        getTxtLineaPosRecargasPaquetes();
    }

}
