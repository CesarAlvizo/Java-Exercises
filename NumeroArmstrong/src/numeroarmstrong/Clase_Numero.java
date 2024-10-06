package numeroarmstrong;

public class Clase_Numero {
     // Atributo para almacenar el número a verificar
    public int numero;

    // Método para calcular la potencia de un número
    private int potencia(int base, int exponente) {
        int resultado = 1;
        int i = 0;
        while (i < exponente) {
            resultado *= base;
            i++;
        }
        return resultado;
    }

    // Método para verificar si el número es un número de Armstrong
    public boolean esNumeroArmstrong() {
        int original = numero;
        int suma = 0;
        int longitud = String.valueOf(numero).length();

        int temp = numero;
        while (temp > 0) {
            int digito = temp % 10;
            suma += potencia(digito, longitud);
            temp /= 10;
        }

        return suma == original;
    }
}
