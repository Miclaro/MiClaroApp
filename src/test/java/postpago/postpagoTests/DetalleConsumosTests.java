package postpago.postpagoTests;

import main.BaseTest;
import org.testng.annotations.Test;

public class DetalleConsumosTests extends BaseTest {


    @Test
    public void cp001_ConsultarDetalleConsumosdatos(){
        this.detalleConsumosPage.setBtnpostpagohome();
    }

}
