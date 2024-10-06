/*
 * Este es un programa simple en Java que solicita al usuario ingresar un número
 * e imprime una pirámide de asteriscos en la que el número ingresado determina
 * el número de filas de la pirámide.
 */
package figura;
import java.util.Scanner;

/**
 * Clase Figuraaa que contiene un método para imprimir una pirámide de asteriscos.
 */
public class Clase_Figura {
    
    // Declara una variable de instancia 'n' que representa la cantidad ingresada por el usuario.
    public int n;

    // Método para imprimir una pirámide de asteriscos basada en la entrada del usuario.
    public void piramide() {
        
        // Crea un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner objleer = new Scanner(System.in);
        
        // Solicita al usuario ingresar una cantidad y almacena el valor en la variable 'n'.
        System.out.println("Ingrese una cantidad: ");
        this.n = objleer.nextInt();
    
        // Bucle externo para controlar las filas de la pirámide.
        for (int i = 1; i <= n; i++) {
            
            // Bucle interno para controlar la cantidad de asteriscos en cada fila.
            for (int j = 1; j <= i; j++) {
                // Imprime un asterisco en la posición actual.
                System.out.print("*");
            }
            
            // Salto de línea después de imprimir todos los asteriscos en una fila.
            System.out.println();
        }   
    }
}


