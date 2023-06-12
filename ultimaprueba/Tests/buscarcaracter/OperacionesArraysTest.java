package buscarcaracter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacionesArraysTest {

    @Test
    public void testBusca() {
        OperacionesArrays operacionesArrays = new OperacionesArrays();

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        Assertions.assertTrue(operacionesArrays.busca('c', array));
        Assertions.assertFalse(operacionesArrays.busca('z', array));
    }
}
