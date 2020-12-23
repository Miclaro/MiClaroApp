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

import java.util.List;
import java.util.concurrent.TimeUnit;


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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View")
    private AndroidElement boxPlayer;


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

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Leer más']/android.widget.TextView")
    private AndroidElement lblLeerMas;


    //Revista 15 minutos

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/lbTitleRv15Min")
    private AndroidElement txtRevista15Minutos;

    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/btnAceptRev15Min")
    private AndroidElement btnActivarRevista15Minutos;


    //Recomendados

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contenido exclusivo Claro']")
    private AndroidElement txtRecomendados;


    //Free Apps

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private  AndroidElement btnAllowfreeApps;


    @AndroidFindBy(id = "com.clarocolombia.miclaro:id/tv_know_more_message_2")
    private AndroidElement lblFreeApps;


    /**
     * Action Methods
     */

    //General

    public void goToEntretenimientoPanel(String linea){
        testUtils.getElement(homePage.btnPosicion1Parrilla1);
        testUtils.clickElement(homePage.lisHome);
        homePage.clickLineaPostpago(linea);
        testUtils.getElement(homePage.btnPosicion1Parrilla1);
        testUtils.verticalScroll();
        testUtils.verticalScroll();

    }


    //Claro Gaming

    public void checkClaroGaming(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.horizontalScrollSecondElement(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion1Parrilla4);
        testUtils.getElement(txtVentaVideojuegos);

    }


    //Red en vivo

    public void checkRedEnVivo(String linea) throws InterruptedException {
        goToEntretenimientoPanel(linea);
        testUtils.clickElement(homePage.btnPosicion1Parrilla4);
        testUtils.getElement(boxPlayer);

    }


    //Claro Video

    public void checkClaroVideo(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.horizontalScrollSecondElement(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion2Parrilla4);
        testUtils.getElement(txtClaroVideoGooglePlay);

    }


    //Claro Música

    public void checkClaroMusica(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.clickElement(homePage.btnPosicion2Parrilla4);
        testUtils.getElement(txtClaroMusicaGooglePlay);

    }


    //Tonos de espera

    public void checkTonosDeEspera(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.horizontalScrollSecondElement(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion3Parrilla4);
        testUtils.getElement(txtTonosEsperaGooglePlay);
    }


    //PruébaT

    public void checkPruebaT(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion3Parrilla4);
        testUtils.getElement(lblLeerMas);
    }



    //Revista 15 minutos

    public void checkRevista15Minutos(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion4Parrilla4);
        testUtils.getElement(txtRevista15Minutos);
        testUtils.getElement(btnActivarRevista15Minutos);
    }



    //Recomendados


    public void checkRecomendados(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.clickElement(homePage.btnPosicion3Parrilla4);
        testUtils.getElement(txtRecomendados);

    }


    //Navega Gratis FreeApps


    public void checkNavegaGratisFreeApps(String linea){
        goToEntretenimientoPanel(linea);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.horizontalScroll(homePage.panelEntretenimiento);
        testUtils.clickElement(homePage.btnPosicion2Parrilla4);
        allowAlertFreeApps();
        continueFreeApps();
        continueFreeApps2();
        testUtils.getElement(lblFreeApps);

        }

    public void allowAlertFreeApps()  {
        List<MobileElement> alert1;
        List<MobileElement> alert2;
        List<MobileElement> alert3;

        boolean alertIsPresent = true;

        while (alertIsPresent == true) {

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            alert1 = driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button"));
            alert2 = driver.findElements(By.id("com.clarocolombia.miclaro:id/tv_dialog_button"));
            alert3 = driver.findElements(By.id("android:id/button1"));

            if (alert1.size()!=0){
                alert1.get(0).click();
                alertIsPresent = true;

            }else{
                if (alert2.size()!=0){
                    alert2.get(0).click();
                    alertIsPresent = true;

                } else{
                    if (alert3.size()!=0){
                    alert3.get(0).click();
                    alertIsPresent = true;

                } else {
                        alertIsPresent = false;
                        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    }

                }
            }


        }
    }

    public void continueFreeApps()  {
        List<MobileElement> alert2;
        boolean alertIsPresent = true;

        while (alertIsPresent == true) {

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            alert2 = driver.findElements(By.id("com.clarocolombia.miclaro:id/tv_dialog_button"));


            if (alert2.size()!=0){
                alert2.get(0).click();
                alertIsPresent = true;

            } else {
                alertIsPresent = false;
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        }
    }

    public void continueFreeApps2()  {
        List<MobileElement> alert3;
        boolean alertIsPresent = true;

        while (alertIsPresent == true) {

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            alert3 = driver.findElements(By.id("android:id/button1"));


            if (alert3.size()!=0){
                alert3.get(0).click();
                alertIsPresent = true;

            } else {
                alertIsPresent = false;
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        }
    }





    }

