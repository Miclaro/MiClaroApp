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


public class AdministraTusProductosPosPage extends BasePage {

    TestUtils testUtils = new TestUtils();

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */

    public AdministraTusProductosPosPage(AndroidDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Mobile Elements
     */

    //General

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/contentSpinnerInicio")
    private AndroidElement lisHome;

    String lineaPostpago;
    By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + lineaPostpago + "']");

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private AndroidElement btnAtras;

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/lbUserHeader")
    private AndroidElement txtHolaUser;

    By panelAdminProducts =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView");

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[1]")
    private AndroidElement btnPosicion1Parrilla1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[2]")
    private  AndroidElement btnPosicion2Parrilla1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[3]")
    private  AndroidElement btnPosicion3Parrilla1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[4]")
    private  AndroidElement btnPosicion4Parrilla1;

    @AndroidFindBy (id = "com.clarocolombia.miclaro:id/btn_aceptar")
    private AndroidElement btnCerrarMensajeError;


    @AndroidFindBy(id="//android.widget.TextView[@text='cuenta']")
    private AndroidElement headerCuentawebView;


    //Detalle de consumos


    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/txtUltimaActulizacion")
    private AndroidElement txtUltimaActualizacion;


    //Paga Tu Factura

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/tv_nombre_usuario")
    private AndroidElement txtNombreUsuario;



    //Detalle de plan

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/tv_plan")
    private AndroidElement txtPlanPostpago;


    //Recargas y paquetes

    @AndroidFindBy (id = "com.clarocolombia.miclaro:id/edtNumeroContent")
    private AndroidElement txtLineaPosRecargasPaquetes;


    //Roaming Internacional

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/txtRecurente")
    private AndroidElement txtEstadoRoaming;



    //Simulador de crédito

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/tvTitle")
    private AndroidElement txtTituloSimulador;

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/btn_go_catalogo")
    private AndroidElement btnIrCatalogo ;


    //Mis equipos financiados


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Actualmente no cuentas con equipos financiados.']")
    private AndroidElement txtNoEquiposFinanciados;


    //Cambia tu número

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Cambia tu Número']")
    private AndroidElement txtCambiaTuNumero;

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/btn_cambio_numero")
    private AndroidElement btnCambiarNumero;


    //Desasociar Cuenta

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/tvCuenta")
    private AndroidElement txtLineaPosDesasociar;

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/btnCancelar")
    private AndroidElement btnCancelarDesasociar;




    /**
     * Action Methods
     */


    //General

    public void clickLineaPostpago(String linea){
        By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + linea + "']");
        testUtils.waitElement(lblLíneaPostpago);
        driver.findElement(lblLíneaPostpago).click();
    }

    public String getlblLíneaPostpago(String linea){
        By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + linea + "']");
        testUtils.waitElement(txtUltimaActualizacion);
        testUtils.waitElement(lblLíneaPostpago);
        String txtLblLíneaPostpago = driver.findElement(lblLíneaPostpago).getText();
        return txtLblLíneaPostpago;
    }



    //Detalle de consumos

    public String getTxtUltimaActualizacion(){
        testUtils.waitElement(txtUltimaActualizacion);
        String txtUltimaActualizacion = this.txtUltimaActualizacion.getText();
        return txtUltimaActualizacion;
    }

    public void checkDetalleConsumos(String linea)  {
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.clickElement(btnPosicion1Parrilla1);
    }



    //Paga Tu Factura

    public void checkPagaTuFactura(String linea) {
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.clickElement(btnPosicion2Parrilla1);
        testUtils.getElement(txtNombreUsuario);
    }



    //Detalle de tu plan

    public void checkDetalleDePlan(String linea) {
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.clickElement(btnPosicion3Parrilla1);
        testUtils.getElement(txtPlanPostpago);
    }



    //Recargas y Paquetes

    public String getTxtLineaPosRecargasPaquetes(){
        testUtils.waitElement(txtLineaPosRecargasPaquetes);
        String lineaPosPaquetesRecargas = txtLineaPosRecargasPaquetes.getText();
        return lineaPosPaquetesRecargas;
    }

    public void checkRecargasYPaquetes(String linea) {
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion1Parrilla1);
    }



    //Roaming Internacional

    public void checkRoamingInternacional(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion2Parrilla1);
        testUtils.getElement(txtEstadoRoaming);
    }




    //Simulador de Financiamiento

    public void checkSimuladorDeFinanciamiento(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion3Parrilla1);
        testUtils.getElement(txtTituloSimulador);
        testUtils.getElement(btnIrCatalogo);
    }



    //Mis Equipos Financiados

    public String getTxtNoEquiposFinanciados(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion1Parrilla1);
        testUtils.waitElement(txtNoEquiposFinanciados);
        String txtNoEquiposFinanciados = this.txtNoEquiposFinanciados.getText();
        return txtNoEquiposFinanciados;
    }

    public void checkNoEquiposFinanciados(){
        testUtils.clickElement(btnCerrarMensajeError);
    }




    //Cambia tu número

    public void checkCambiaTuNumero(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion2Parrilla1);
        testUtils.getElement(txtCambiaTuNumero);
        testUtils.getElement(btnCambiarNumero);
    }




    //Desasociar Cuenta

    public String getTxtLineaPosDesasociar(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion3Parrilla1);
        testUtils.waitElement(txtLineaPosDesasociar);
        String txtLineaPosDesasociar = this.txtLineaPosDesasociar.getText();
        return txtLineaPosDesasociar;
    }

    public void checkDesasociarCuentaPos(){
        testUtils.clickElement(btnCancelarDesasociar);
    }




    //Adquiere una Línea Nueva

    public void checkAdquiereLineaPos(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion3Parrilla1);
        testUtils.getElement(headerCuentawebView);
    }



    //Tienda Claro

    public void checkTiendaClaroPos(String linea){
        testUtils.clickElement(lisHome);
        clickLineaPostpago(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(btnPosicion4Parrilla1);
        testUtils.getElement(headerCuentawebView);
    }

}
