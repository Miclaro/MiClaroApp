package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.postpago.postpagoPages.EntretenimientoPosPage;

import java.net.MalformedURLException;


public class EntretenimientoPosTests extends BaseTest {

    protected EntretenimientoPosPage entretenimientoPosPage;


    @Test (priority = 25, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos026_ClaroGaming(String lineaPostpago) throws MalformedURLException {
        this.entretenimientoPosPage = new EntretenimientoPosPage(basePage.getDriver());
        this.entretenimientoPosPage.checkClaroGaming(lineaPostpago);
      //  assertTrue(administraTusProductosPage.getTxtUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
    }


    @Test (priority = 26, alwaysRun = true)
    @Parameters({"lineaPostpago"} )
    public void pos027_RedEnVivo(String lineaPostpago)  {
        this.entretenimientoPosPage.checkRedEnVivo(lineaPostpago);
      //  assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }


    @Test (priority = 27, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos028_ClaroVideo(String lineaPostpago)   {
        this.entretenimientoPosPage.checkClaroVideo(lineaPostpago);
       // assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }


    @Test (priority = 28, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos029_ClaroMusica(String lineaPostpago) {
        this.entretenimientoPosPage.checkClaroMusica(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }

    @Test (priority = 29, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos030_TonosDeEspera(String lineaPostpago) {
        this.entretenimientoPosPage.checkTonosDeEspera(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


    @Test (priority = 30, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos031_PruebaT(String lineaPostpago) {
        this.entretenimientoPosPage.checkPruebaT(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


    @Test (priority = 31, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos032_Revista15Minutos(String lineaPostpago) {
        this.entretenimientoPosPage.checkRevista15Minutos(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


}
