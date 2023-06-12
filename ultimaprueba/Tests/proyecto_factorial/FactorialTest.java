package proyecto_factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();

        try {
            float resultado = factorial.factorial((byte) 5);
            Assertions.assertEquals(120, resultado);
        } catch (Exception e) {
            Assertions.fail("No se esperaba una excepción: " + e.getMessage());
        }

        try {
            factorial.factorial((byte) -1);
            Assertions.fail("Se esperaba una excepción pero no se lanzó.");
        } catch (Exception e) {
            Assertions.assertEquals("Error. El número tiene que ser >=0", e.getMessage());
        }
    }
}
