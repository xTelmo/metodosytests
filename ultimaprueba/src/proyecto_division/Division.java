package proyecto_division;

/**
 * Esta clase proporciona métodos para realizar operaciones de división.
 */
public class Division {

    /**
     * Calcula la división entre el dividendo y el divisor.
     *
     * @param dividendo el dividendo de la división
     * @param divisor el divisor de la división
     * @return el resultado de la división
     * @throws Exception si el divisor es 0
     */
    public float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Error. El divisor no puede ser 0.");
        }

        float resultado = dividendo / divisor;

        return resultado;
    }
}

