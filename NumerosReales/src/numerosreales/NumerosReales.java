package numerosreales;

import java.util.Scanner;

public class NumerosReales {

public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numeroIngresado = scanner.nextInt();
            
            NumeroPerfecto numeroPerfecto = new NumeroPerfecto(numeroIngresado);
            
            if (numeroPerfecto.esNumeroPerfecto()) {
                System.out.println(numeroIngresado + " es un número perfecto.");
            } else {
                System.out.println(numeroIngresado + " no es un número perfecto.");
            }
        }
        
    }
 
}