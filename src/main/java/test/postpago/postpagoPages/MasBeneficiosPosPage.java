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


public class MasBeneficiosPosPage extends BasePage {

    TestUtils testUtils = new TestUtils();
    HomePage homePage = new HomePage(driver);

    /**
     * Constructor
     * @param driver : AndroidDriver
     *
     */

    public MasBeneficiosPosPage(AndroidDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    /**
     * Mobile Elements
     */

    //ClaroClub

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/web_view")
    private AndroidElement webViewClaroClub;



    //Familia y Amigos

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/btnHomEleFamAmi")
    private AndroidElement btnFamiliaYAmigos;

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/btnHomEleTodDest")
    private AndroidElement btnElegidosTodoDestino;



    //Recomendados

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contenido exclusivo Claro']")
    private AndroidElement txtRecomendados;



    //Datos Compartidos

    @AndroidFindBy(id="com.clarocolombia.miclaro:id/btn_aceptar")
    private AndroidElement btnCerrarDatosCompartidos;




    /**
     * Action Methods
     */

    //General

    public void goToMasBeneficiosPanel(String linea){
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.getElement(homePage.btnPosicion1Parrilla1);
        testUtils.verticalScroll();
        //testUtils.verticalScroll();
    }


    //ClaroClub

    public void checkClaroClub(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.clickElement(homePage.btnPosicion1Parrilla3);
        testUtils.getElement(webViewClaroClub);

    }

    //Familia y Amigos


    public void checkFamiliaAmigos(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.clickElement(homePage.btnPosicion2Parrilla3);
        testUtils.getElement(btnFamiliaYAmigos);
        testUtils.getElement(btnElegidosTodoDestino);

    }


    //Recomendados


    public void checkRecomendados(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.clickElement(homePage.btnPosicion3Parrilla3);
        testUtils.getElement(txtRecomendados);

    }


    //Datos Compartidos


    public void checkDatosCompartidos(String linea){
        goToMasBeneficiosPanel(linea);
        testUtils.horizontalScroll(homePage.panelMasBeneficios);
        testUtils.clickElement(homePage.btnPosicion4Parrilla3);
        testUtils.clickElement(btnCerrarDatosCompartidos);
    }





}
