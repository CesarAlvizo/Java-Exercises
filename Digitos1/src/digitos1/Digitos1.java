
package digitos1;

import java.util.Scanner;

/**
 *
 * @author sam7w
 */
public class Digitos1 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numeroIngresado = scanner.nextInt();
            
            ContadorDigitos contadorDigitos = new ContadorDigitos(numeroIngresado);
            
            int cantidadDigitos = contadorDigitos.contarDigitos();
            System.out.println("El número " + numeroIngresado + " tiene " + cantidadDigitos + " dígitos.");
        }
    }
}
