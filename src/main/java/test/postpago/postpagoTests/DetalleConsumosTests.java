package test.postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class DetalleConsumosTests extends BaseTest {

    @Test
    public void cp001_ConsultarDetalleConsumosdatos() throws MalformedURLException {
        this.detalleConsumosPage.checkDetalleConsumos();
        //assertEquals(detalleConsumosPage.getLblUltimaActualizacion(), "Actualizado", "successful detalle de consumos");
        assertTrue(detalleConsumosPage.getLblUltimaActualizacion().contains("Actualizado"), "successful detalle de consumos");
    }

}
