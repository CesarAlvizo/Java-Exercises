package numerosparesimpares;
import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de la clase NumerosParesImpares
        Clase_PI numerosObj = new Clase_PI();

        // Solicitar al usuario que ingrese los límites del rango
        System.out.print("Ingrese el límite inferior del rango: ");
        numerosObj.limiteInferior = scanner.nextInt();

        System.out.print("Ingrese el límite superior del rango: ");
        numerosObj.limiteSuperior = scanner.nextInt();

        // Verificar que el límite superior sea mayor que el límite inferior
        if (numerosObj.limiteSuperior >= numerosObj.limiteInferior) {
            // Mostrar los números pares e impares en el rango
            numerosObj.mostrarParesImpares();
        } else {
            System.out.println("Error: El límite superior debe ser mayor o igual al límite inferior.");
        }

        // Cerrar el escáner
        scanner.close();
    }    
}
 
