package proyecto_factorial;

/**
 * Esta clase proporciona métodos para calcular el factorial de un número.
 */
public class Factorial {

    /**
     * Calcula el factorial del número dado.
     *
     * @param n el número para calcular el factorial
     * @return el factorial del número
     * @throws Exception si el número es negativo
     */
    public float factorial(byte n) throws Exception {
        if (n < 0) {
            throw new Exception("Error. El número tiene que ser >=0");
        }

        float resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
