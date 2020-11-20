package test.postpago.postpagoPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtils;
import test.home.homePages.HomePage;


public class AtencionAlClienteYSoportePosPage extends BasePage {

    TestUtils testUtils = new TestUtils();
    HomePage homePage = new HomePage(driver);

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */

    public AtencionAlClienteYSoportePosPage(AndroidDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Mobile Elements
     */

    //ClaroBot


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='! ¡Te doy la bienvenida!']")
    private AndroidElement txtChatBotBienvenida;


    //Agendar turnos

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/web_view")
    private AndroidElement webViewAgendarTurnos;



    //Gestiona tu equipo

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/txtTitulo")
    private AndroidElement txtGestionaTuEquipo;


    //Adquirir productos

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='¿Quieres iniciar un chat con un agente?']")
    private AndroidElement txtAdquirirProductos;


    //Resuelve fallas de tus servicios

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/btnAutodiagnosticar")
    private AndroidElement btnDiagnosticarServicio;



    //Centros de atención y ventas

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View")
    private AndroidElement webViewCentrosAtencionVentas;



    //Consulta estado de PQR


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Actualmente no cuentas con equipos financiados.']")
    private AndroidElement txtNoEquiposFinanciados;


    //Consulta tus servicios técnicos

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Estado de tu orden de servicio']")
    private AndroidElement txtTituloEstadoOrdenServicio;

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/btnConsultaNumero")
    private AndroidElement btnVer;



    //Claro Check

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/tvTitle")
    private AndroidElement txtTituloClaroCheck;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Modo Avión']")
    private AndroidElement txtModoAvion;


    //Centro de ayuda

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Gestiona tus trámites']")
    private AndroidElement txtGestionaTusTramites;





    /**
     * Action Methods
     */


    //ClaroBot

    public void checkClaroBot(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.clickElement(homePage.btnPosicion1Parrilla2);
        testUtils.getElement(txtChatBotBienvenida);
    }



    //Agendar turnos

    public void checkAgendarTurnos(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.clickElement(homePage.btnPosicion2Parrilla2);
        testUtils.getElement(webViewAgendarTurnos);
    }


    //Gestiona tu equipo


    public void checkGestionaTuEquipo(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.clickElement(homePage.btnPosicion3Parrilla2);
        testUtils.getElement(txtGestionaTuEquipo);
    }

    //Adquirir productos

    public void checkAdquirirProductos(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion1Parrilla2);
        testUtils.getElement(txtAdquirirProductos);
    }


    //Resuelve fallas de tus servicios

    public void checkResuelveFallasServicios(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion2Parrilla2);
        testUtils.getElement(btnDiagnosticarServicio);
    }



    //Centros de atención y ventas

    public void checkCentrosAtencionVentas(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion3Parrilla2);
        testUtils.getElement(webViewCentrosAtencionVentas);
    }


    //Consulta estado de PQR

    public void checkConsultaEstadoPQR(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion1Parrilla2);
        testUtils.getElement(txtNoEquiposFinanciados);
    }


    //Consulta tus servicios técnicos

    public void checkConsultaTusServiciosTecnicos(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion2Parrilla2);
        testUtils.getElement(txtTituloEstadoOrdenServicio);
        testUtils.getElement(btnVer);
    }

    //Claro Check

    public void checkClaroCheck(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion3Parrilla2);
        testUtils.getElement(txtTituloClaroCheck);
        testUtils.getElement(txtModoAvion);
    }

    //Centro de ayuda

    public void checkCentroAyuda(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.horizontalScroll(homePage.panelAtencionAlClienteYSoporte);
        testUtils.clickElement(homePage.btnPosicion4Parrilla2);
        testUtils.getElement(txtGestionaTusTramites);
    }




}
