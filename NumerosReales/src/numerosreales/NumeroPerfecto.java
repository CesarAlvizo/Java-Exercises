package numerosreales;

public class NumeroPerfecto {

    // Atributo para almacenar el número
    public int numero;

    // Constructor para inicializar el número
    public NumeroPerfecto(int numero) {
        this.numero = numero;
    }

    // Método para verificar si el número es perfecto
    public boolean esNumeroPerfecto() {
        int sumaDivisores = 1; // Inicializamos con 1 porque todo número es divisible por 1

        int divisor = 2;
        do {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
            divisor++;
        } while (divisor <= numero / 2);

        return sumaDivisores == numero;
    }

    
}