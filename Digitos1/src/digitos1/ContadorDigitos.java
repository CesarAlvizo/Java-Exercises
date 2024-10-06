package digitos1;

public class ContadorDigitos {

    // Atributo para almacenar el número
    public int numero;

    // Constructor para inicializar el número
    public ContadorDigitos(int numero) {
        this.numero = numero;
    }

    // Método para contar los dígitos del número
    public int contarDigitos() {
        int contador = 0;
        int numTemporal = numero;

        // Manejo especial para el caso del número 0
        if (numTemporal == 0) {
            return 1;
        }

        do {
            numTemporal /= 10;
            contador++;
        } while (numTemporal != 0);

        return contador;
    }

    
}

