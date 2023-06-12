package proyecto_acronimos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AcronimosTest {

    @Test
    public void testObtenerAcronimo() {
        Acronimos acronimos = new Acronimos();

        Assertions.assertEquals("E.T.", acronimos.obtenerAcronimo("E.T. - El Extraterrestre"));
        Assertions.assertEquals("L.S.", acronimos.obtenerAcronimo("La sirenita"));
        Assertions.assertEquals("I.I.", acronimos.obtenerAcronimo("Inteligencia Artificial"));
        Assertions.assertEquals("I.A.", acronimos.obtenerAcronimo("I.A."));
    }
}
