package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.postpago.postpagoPages.MasBeneficiosPosPage;

import java.net.MalformedURLException;


public class MasBeneficiosPosTests extends BaseTest {

    protected MasBeneficiosPosPage masBeneficiosPosPage;


    @Test (priority = 23, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos022_ClaroClub(String lineaPostpago) throws MalformedURLException {
        this.masBeneficiosPosPage = new MasBeneficiosPosPage(basePage.getDriver());
        this.masBeneficiosPosPage.checkClaroClub(lineaPostpago);
      //  assertTrue(administraTusProductosPage.getTxtUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
    }


    @Test (priority = 24, alwaysRun = true)
    @Parameters({"lineaPostpago"} )
    public void pos023_FamiliaYAmigos(String lineaPostpago)  {
        this.masBeneficiosPosPage.checkFamiliaAmigos(lineaPostpago);
      //  assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }



    @Test (priority = 25, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos024_DatosCompartidos(String lineaPostpago) {
        this.masBeneficiosPosPage.checkDatosCompartidos(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


}
