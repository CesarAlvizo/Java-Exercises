
package numerosamigos;

public class Amigueada {

    // Atributos para almacenar los números
    public int numero1;
    public int numero2;

    // Constructor para inicializar los números
    public Amigueada(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para sumar los divisores propios de un número
    public int sumarDivisoresPropios(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    // Método para verificar si los números son amigos
    public boolean sonAmigos() {
        return (sumarDivisoresPropios(numero1) == numero2) && (sumarDivisoresPropios(numero2) == numero1);
    }
}