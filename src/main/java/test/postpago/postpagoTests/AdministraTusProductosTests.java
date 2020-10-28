package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class AdministraTusProductosTests extends BaseTest {


    @Test (priority = 0, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void cp001_ConsultarDetalleConsumosdatos(String lineaPostpago) {
        this.administraTusProductosPage.checkDetalleConsumos(lineaPostpago);
        //assertEquals(detalleConsumosPage.getLblUltimaActualizacion(), "Actualizado", "successful detalle de consumos");
        assertTrue(administraTusProductosPage.getLblUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
       // this.administraTusProductosPage.clickBtnAtras();
    }


    @Test (priority = 1, alwaysRun = true)
    @Parameters({"lineaPostpago"} )
    public void cp002_ConsultarPagaTuFactura(String lineaPostpago)  {
        this.administraTusProductosPage.checkPagaTuFactura();
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
       // this.administraTusProductosPage.clickBtnAtras();
    }

    @Test (priority = 2, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void cp003_ConsultarDetallePlan(String lineaPostpago)   {
        this.administraTusProductosPage.checkDetalleDePlan();
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(lineaPostpago),lineaPostpago);
      //  this.administraTusProductosPage.clickBtnAtras();
    }

    @Test (priority = 3, alwaysRun = true)
    @Parameters({"lineaPostpago"})
    public void cp004_ConsultarRecargasYPaquetes(String lineaPostpago) throws InterruptedException {
        this.administraTusProductosPage.checkRecargasYPaquetes();
        assertEquals(administraTusProductosPage.getTxtLineaPosRecargasPaquetes(), lineaPostpago);
       // this.administraTusProductosPage.clickBtnAtrasRecargasPaquetes();
    }
}
