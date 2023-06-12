package buscarcaracter;

/**
 * Esta clase proporciona métodos para buscar un carácter en un array de caracteres ordenado.
 */
public class OperacionesArrays {

    /**
     * Busca un carácter en un array ordenado de caracteres.
     *
     * @param c el carácter a buscar
     * @param v el array de caracteres ordenado
     * @return true si el carácter se encuentra en el array, false en caso contrario
     */
    public boolean busca(char c, char[] v) {
        int a = 0;
        int z = v.length - 1;
        boolean resultado = false;

        while (a <= z && !resultado) {
            int m = (a + z) / 2;

            if (v[m] == c) {
                resultado = true;
            } else if (v[m] < c) {
                a = m + 1;
            } else {
                z = m - 1;
            }
        }

        return resultado;
    }
}

