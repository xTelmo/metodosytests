package proyecto_acronimos;

/**
 * Esta clase proporciona métodos para obtener el acrónimo de una cadena.
 */
public class Acronimos {

    /**
     * Obtiene el acrónimo correspondiente a una cadena.
     *
     * @param cadena la cadena de caracteres
     * @return el acrónimo de la cadena
     */
    public String obtenerAcronimo(String cadena) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter != ' ') {
                if (i == 0 || cadena.charAt(i - 1) == ' ') {
                    resultado.append(caracter).append('.');
                }
            }
        }

        return resultado.toString();
    }
}

