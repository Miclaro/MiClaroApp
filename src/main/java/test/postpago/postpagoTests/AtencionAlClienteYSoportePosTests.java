package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.postpago.postpagoPages.AtencionAlClienteYSoportePosPage;

import java.net.MalformedURLException;


public class AtencionAlClienteYSoportePosTests extends BaseTest {

    protected AtencionAlClienteYSoportePosPage atencionAlClienteYSoportePosPage;


    @Test (priority = 13, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos012_ClaroBot(String lineaPostpago) throws MalformedURLException {
        this.atencionAlClienteYSoportePosPage = new AtencionAlClienteYSoportePosPage(basePage.getDriver());
        this.atencionAlClienteYSoportePosPage.checkClaroBot(lineaPostpago);
      //  assertTrue(administraTusProductosPage.getTxtUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
    }


    @Test (priority = 14, alwaysRun = true)
    @Parameters({"lineaPostpago"} )
    public void pos013_AgendarTurnos(String lineaPostpago)  {
        this.atencionAlClienteYSoportePosPage.checkAgendarTurnos(lineaPostpago);
      //  assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }

    @Test(priority = 15, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos014_CentrosAtencionVentas(String lineaPostpago){
        this.atencionAlClienteYSoportePosPage.checkCentrosAtencionVentas(lineaPostpago);

    }

    @Test (priority = 16, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos015_gestionaTuEquipo(String lineaPostpago)   {
        this.atencionAlClienteYSoportePosPage.checkGestionaTuEquipo(lineaPostpago);
       // assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }


    @Test (priority = 17, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos016_AdquirirProductos(String lineaPostpago) {
        this.atencionAlClienteYSoportePosPage.checkAdquirirProductos(lineaPostpago);
        //assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


    @Test(priority = 18, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos017_ResuelvefallasServicios(String lineaPostpago){
        this.atencionAlClienteYSoportePosPage.checkResuelveFallasServicios(lineaPostpago);
       // assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago), lineaPostpago);
    }



    @Test(priority = 19, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos018_ConsultaEstadoPQR(String lineaPostpago){
        this.atencionAlClienteYSoportePosPage.checkConsultaEstadoPQR(lineaPostpago);
       // assertEquals(administraTusProductosPage.getTxtNoEquiposFinanciados(lineaPostpago), "Actualmente no cuentas con equipos financiados.");
    }


    @Test(priority = 20, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos019_ConsultaTusServiciosTecnicos(String lineaPostpago){
        this.atencionAlClienteYSoportePosPage.checkConsultaTusServiciosTecnicos(lineaPostpago);
    }


    @Test(priority = 21,alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos020_ClaroCheck(String lineaPostpago){
        this.atencionAlClienteYSoportePosPage.checkClaroCheck(lineaPostpago);
       // assertEquals(administraTusProductosPage.getTxtLineaPosDesasociar(lineaPostpago), lineaPostpago);
    }


    @Test(priority = 22, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos021_CentroDeAyuda(String lineaPostpago){
        this.atencionAlClienteYSoportePosPage.checkCentroAyuda(lineaPostpago);
    }

}
