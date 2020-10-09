package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AdministraTusProductosTests extends BaseTest {

    @Test (priority = 0)
    public void cp001_ConsultarDetalleConsumosdatos() {
        this.administraTusProductosPage.checkDetalleConsumos();
        //assertEquals(detalleConsumosPage.getLblUltimaActualizacion(), "Actualizado", "successful detalle de consumos");
        assertTrue(administraTusProductosPage.getLblUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
        this.administraTusProductosPage.clickBtnAtras();
    }

    @Test (priority = 1)
    public void cp002_ConsultarPagaTuFactura(){
        this.administraTusProductosPage.checkPagaTuFactura();
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(),"3103021199");
        this.administraTusProductosPage.clickBtnAtras();
    }

    @Test (priority = 2)
    public void cp003_ConsultarDetallePlan(){
        this.administraTusProductosPage.checkDetalleDePlan();
        assertEquals(administraTusProductosPage.getlblLíneaPostpago(),"3103021199");
        this.administraTusProductosPage.clickBtnAtras();
    }

    @Test (priority = 3)
    public void cp004_ConsultarRecargasYPaquetes() throws Exception {
        this.administraTusProductosPage.checkRecargasYPaquetes();
    }
}
