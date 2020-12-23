package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.postpago.postpagoPages.AdministraTusProductosPosPage;

import java.net.MalformedURLException;

import static org.testng.Assert.assertEquals;


public class AdministraTusProductosPosTests extends BaseTest {

    protected AdministraTusProductosPosPage administraTusProductosPage;


    @Test (priority = 0, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos001_ConsultarDetalleConsumosdatos(String lineaPostpago) throws MalformedURLException {
        this.administraTusProductosPage = new AdministraTusProductosPosPage(basePage.getDriver());
        this.administraTusProductosPage.checkDetalleConsumos(lineaPostpago);
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
       // assertTrue(administraTusProductosPage.getTxtUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
    }


    @Test (priority = 1, alwaysRun = true)
    @Parameters({"lineaPostpago"} )
    public void pos002_ConsultarPagaTuFactura(String lineaPostpago)  {
        this.administraTusProductosPage.checkPagaTuFactura(lineaPostpago);
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }


    @Test (priority = 2, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos003_ConsultarDetallePlan(String lineaPostpago)   {
        this.administraTusProductosPage.checkDetalleDePlan(lineaPostpago);
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
    }


    @Test (priority = 3, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos004_ConsultarRecargasYPaquetes(String lineaPostpago) {
        this.administraTusProductosPage.checkRecargasYPaquetes(lineaPostpago);
        assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
    }


    @Test(priority = 4, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos005_RoamingInternacional(String lineaPostpago){
        this.administraTusProductosPage.checkRoamingInternacional(lineaPostpago);
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago), lineaPostpago);
    }


    @Test(priority = 5, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos006_SimuladorDeFinanciamiento(String lineaPostpago){
        this.administraTusProductosPage.checkSimuladorDeFinanciamiento(lineaPostpago);
    }


    @Test(priority = 6, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos007_MisEquiposFinanciados(String lineaPostpago){
        assertEquals(administraTusProductosPage.getTxtNoEquiposFinanciados(lineaPostpago), "Actualmente no cuentas con equipos financiados.");
        this.administraTusProductosPage.checkNoEquiposFinanciados();
    }


    @Test(priority = 7, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos008_CambiaTuNumero(String lineaPostpago){
        this.administraTusProductosPage.checkCambiaTuNumero(lineaPostpago);
    }


    @Test(priority = 8, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos009_AdquiereLineaNuevaPos(String lineaPostpago){
        this.administraTusProductosPage.checkAdquiereLineaPos(lineaPostpago);
    }


    @Test(priority = 9, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos010_TiendaClaroPos(String lineaPostpago){
        this.administraTusProductosPage.checkTiendaClaroPos(lineaPostpago);
    }


    @Test(priority = 10, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos011_AdelantaSaldo(String lineaPostpago){
        this.administraTusProductosPage.checkAdelantaTuSaldo(lineaPostpago);
    }


    @Test(priority = 11, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos012_PortabilidadPostpago(String lineaPostpago){
        this.administraTusProductosPage.checkPortabilidadPostpago(lineaPostpago);
    }


    @Test(priority = 12,alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void pos013_DesasociarCuentaPos(String lineaPostpago){
        assertEquals(administraTusProductosPage.getTxtLineaPosDesasociar(lineaPostpago), lineaPostpago);
        this.administraTusProductosPage.checkDesasociarCuentaPos();
    }









}
