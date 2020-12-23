package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.postpago.postpagoPages.EntretenimientoPosPage;

import java.net.MalformedURLException;


public class EntretenimientoPosTests extends BaseTest {

    protected EntretenimientoPosPage entretenimientoPosPage;



    @Test (priority = 26, alwaysRun = true)
    @Parameters({"lineaPostpago"} )
    public void pos025_RedEnVivo(String lineaPostpago) throws MalformedURLException, InterruptedException {
        this.entretenimientoPosPage = new EntretenimientoPosPage(basePage.getDriver());
        this.entretenimientoPosPage.checkRedEnVivo(lineaPostpago);
        //  assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }


    @Test (priority = 27, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos026_ClaroMusica(String lineaPostpago) {
        this.entretenimientoPosPage.checkClaroMusica(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }



    @Test (priority = 28, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos027_Recomendados(String lineaPostpago)   {
        this.entretenimientoPosPage.checkRecomendados(lineaPostpago);
        // assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }



    @Test (priority = 29, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos028_ClaroGaming(String lineaPostpago)  {
        this.entretenimientoPosPage.checkClaroGaming(lineaPostpago);
      //  assertTrue(administraTusProductosPage.getTxtUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
    }


    @Test (priority = 30, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos029_ClaroVideo(String lineaPostpago)   {
        this.entretenimientoPosPage.checkClaroVideo(lineaPostpago);
       // assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }



/**
    @Test (priority = 31, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos030_TonosDeEspera(String lineaPostpago) {
        this.entretenimientoPosPage.checkTonosDeEspera(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }




    @Test (priority = 32, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos031_NavegaGratisFreeApps(String lineaPostpago) {
        this.entretenimientoPosPage.checkNavegaGratisFreeApps(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    } **/


    @Test (priority = 33, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos032_PruebaT(String lineaPostpago) {
        this.entretenimientoPosPage.checkPruebaT(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


    @Test (priority = 34, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos033_Revista15Minutos(String lineaPostpago) {
        this.entretenimientoPosPage.checkRevista15Minutos(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


}
