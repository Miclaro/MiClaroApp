package test.postpago.postpagoPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import test.home.homePages.HomePage;
import utils.TestUtils;


public class AdministraTusProductosPosPage extends BasePage {

    TestUtils testUtils = new TestUtils();
    HomePage homePage = new HomePage(driver);


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

    By panelAdminProducts =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView");


    //Detalle de consumos


    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/txtUltimaActulizacion")
    private AndroidElement txtUltimaActualizacion;

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/txtConsumido")
    private AndroidElement lblGBConsumidos;


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



    //Simulador de financiamiento

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


    //Adelanta saldo

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/lbHolAdelaSaldo")
    private AndroidElement txtAdelantaTuSaldo;


    //Portabilidad postpago
    @AndroidFindBy(id="com.clarocolombia.miclaro:id/web_view")
    private AndroidElement webViewPortabilidadPostpago;





    /**
     * Action Methods
     */


    //General

    public String getlblLíneaPostpago(String linea){
        By lblLíneaPostpago =  By.xpath("//android.widget.TextView[@text='" + linea + "']");
        testUtils.waitElement(lblLíneaPostpago);
        String txtLblLíneaPostpago = driver.findElement(lblLíneaPostpago).getText();
        return txtLblLíneaPostpago;
    }



    //Detalle de consumos -->Posición 1

  /**  public String getTxtUltimaActualizacion(){
        testUtils.waitElement(txtUltimaActualizacion);
        String txtUltimaActualizacion = this.txtUltimaActualizacion.getText();
        return txtUltimaActualizacion;
    }**/

    public void checkDetalleConsumos(String linea)  {
        homePage.setLinea(linea);
        testUtils.clickElement(homePage.btnPosicion1Parrilla1);
        testUtils.getElement(lblGBConsumidos);
    }



    //Paga Tu Factura -->Posición 2

    public void checkPagaTuFactura(String linea) {
        homePage.setLinea(linea);
        testUtils.clickElement(homePage.btnPosicion2Parrilla1);
        testUtils.getElement(txtNombreUsuario);
    }



    //Detalle de tu plan -->Posición 3

    public void checkDetalleDePlan(String linea) {
        homePage.setLinea(linea);
        testUtils.clickElement(homePage.btnPosicion3Parrilla1);
        testUtils.getElement(txtPlanPostpago);
    }



    //Recargas y Paquetes -->Posición 4

    public String getTxtLineaPosRecargasPaquetes(){
        testUtils.waitElement(txtLineaPosRecargasPaquetes);
        String lineaPosPaquetesRecargas = txtLineaPosRecargasPaquetes.getText();
        return lineaPosPaquetesRecargas;
    }

    public void checkRecargasYPaquetes(String linea) {
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScrollSecondElement(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion1Parrilla1);
    }



    //Roaming Internacional -->Posición 5

    public void checkRoamingInternacional(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScrollSecondElement(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion2Parrilla1);
        testUtils.getElement(txtEstadoRoaming);
    }




    //Simulador de Financiamiento -->Posición 6

    public void checkSimuladorDeFinanciamiento(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScrollSecondElement(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion3Parrilla1);
        testUtils.getElement(txtTituloSimulador);
        testUtils.getElement(btnIrCatalogo);
    }



    //Mis Equipos Financiados -->Posición 7

    public String getTxtNoEquiposFinanciados(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScrollSecondElement(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion1Parrilla1);
        testUtils.waitElement(txtNoEquiposFinanciados);
        String txtNoEquiposFinanciados = this.txtNoEquiposFinanciados.getText();
        return txtNoEquiposFinanciados;
    }

    public void checkNoEquiposFinanciados(){
        testUtils.clickElement(homePage.btnCerrarMensajeError);
    }




    //Cambia tu número -->Posición 8

    public void checkCambiaTuNumero(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScrollSecondElement(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion2Parrilla1);
        testUtils.getElement(txtCambiaTuNumero);
        testUtils.getElement(btnCambiarNumero);
    }




    //Desasociar Cuenta -->Posición 13

    public String getTxtLineaPosDesasociar(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion4Parrilla1);
        testUtils.waitElement(txtLineaPosDesasociar);
        String txtLineaPosDesasociar = this.txtLineaPosDesasociar.getText();
        return txtLineaPosDesasociar;
    }

    public void checkDesasociarCuentaPos(){
        testUtils.clickElement(btnCancelarDesasociar);
    }




    //Adquiere una Línea Nueva

    public void checkAdquiereLineaPos(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScrollSecondElement(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion3Parrilla1);
        testUtils.getElement(homePage.lblClaroTienda);
        //testUtils.clickElement(homePage.btnMenuClaroTienda);
        //testUtils.getElement(homePage.lblOpcionCelulares);
    }



    //Tienda Claro

    public void checkTiendaClaroPos(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion1Parrilla1);
        testUtils.getElement(homePage.lblClaroTienda);
       // testUtils.clickElement(homePage.btnMenuClaroTienda);
       //testUtils.getElement(homePage.lblOpcionCelulares);
    }


    //Adelanta tu saldo -->Posición 11

    public void checkAdelantaTuSaldo(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion2Parrilla1);
        testUtils.getElement(txtAdelantaTuSaldo);
    }


    //Portabilidad postpago -->Posición 12

    public void checkPortabilidadPostpago(String linea){
        homePage.setLinea(linea);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.horizontalScroll(panelAdminProducts);
        testUtils.clickElement(homePage.btnPosicion3Parrilla1);
        testUtils.getElement(homePage.lblClaroTienda);
        // testUtils.clickElement(homePage.btnMenuClaroTienda);
        // testUtils.getElement(homePage.lblOpcionCelulares);
    }

}
