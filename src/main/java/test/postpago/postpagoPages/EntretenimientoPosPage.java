package test.postpago.postpagoPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.BasePage;
import org.openqa.selenium.support.PageFactory;
import test.home.homePages.HomePage;
import utils.TestUtils;


public class EntretenimientoPosPage extends BasePage {

    TestUtils testUtils = new TestUtils();
    HomePage homePage = new HomePage(driver);

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */

    public EntretenimientoPosPage(AndroidDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Mobile Elements
     */

    //Claro Gaming

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='VENTA VIDEOJUEGOS']")
    private AndroidElement txtVentaVideojuegos;



    //Red en vivo

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/web_view")
    private AndroidElement webViewRedEnVivo;


    //Claro Video

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Claro video']")
    private AndroidElement txtClaroVideoGooglePlay;



    //Claro Música

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Claro música']")
    private AndroidElement txtClaroMusicaGooglePlay;


    //Tonos de espera

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tonos de Espera']")
    private AndroidElement txtTonosEsperaGooglePlay;


    //PruébaT

    @AndroidFindBy(xpath = "//android.view.View[@index=0]")
    private AndroidElement webViewPruebaT;


    //Revista 15 minutos

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/lbTitleRv15Min")
    private AndroidElement txtRevista15Minutos;

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/btnAceptRev15Min")
    private AndroidElement btnActivarRevista15Minutos;




    /**
     * Action Methods
     */

    //General

    public void goToMasBeneficiosPanel(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.getElement(homePage.btnPosicion1Parrilla1);
        testUtils.verticalScroll();
        testUtils.verticalScroll();
    }


    //Claro Gaming

    public void checkClaroGaming(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.clickElement(homePage.btnPosicion1Parrilla4);
        testUtils.getElement(txtVentaVideojuegos);

    }


    //Red en vivo

    public void checkRedEnVivo(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.clickElement(homePage.btnPosicion2Parrilla4);
        testUtils.getElement(webViewRedEnVivo);

    }


    //Claro Video

    public void checkClaroVideo(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.clickElement(homePage.btnPosicion3Parrilla4);
        testUtils.getElement(txtClaroVideoGooglePlay);

    }


    //Claro Música

    public void checkClaroMusica(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion1Parrilla4);
        testUtils.getElement(txtClaroMusicaGooglePlay);

    }


    //Tonos de espera

    public void checkTonosDeEspera(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion2Parrilla4);
        testUtils.getElement(txtTonosEsperaGooglePlay);
    }


    //PruébaT

    public void checkPruebaT(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion3Parrilla4);
        testUtils.getElement(webViewPruebaT);
    }



    //Revista 15 minutos

    public void checkRevista15Minutos(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion4Parrilla4);
        testUtils.getElement(txtRevista15Minutos);
        testUtils.getElement(btnActivarRevista15Minutos);
    }


}
