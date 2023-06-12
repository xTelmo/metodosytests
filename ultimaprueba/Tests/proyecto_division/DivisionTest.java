package proyecto_division;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void testCalcularDivision() {
        Division division = new Division();

        try {
            float resultado = division.calcularDivision(10, 2);
            Assertions.assertEquals(5, resultado);
        } catch (Exception e) {
            Assertions.fail("No se esperaba una excepción: " + e.getMessage());
        }

        try {
            division.calcularDivision(10, 0);
            Assertions.fail("Se esperaba una excepción pero no se lanzó.");
        } catch (Exception e) {
            Assertions.assertEquals("Error. El divisor no puede ser 0.", e.getMessage());
        }
    }
}
