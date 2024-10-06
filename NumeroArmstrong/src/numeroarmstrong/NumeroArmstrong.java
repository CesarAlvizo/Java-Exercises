package numeroarmstrong;
import java.util.Scanner;

public class NumeroArmstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número a verificar
        System.out.print("Ingrese un número para verificar si es un número de Armstrong: ");
        int numeroIngresado = scanner.nextInt();

        // Crear una instancia de la clase NumeroArmstrong
        Clase_Numero numeroArmstrongObj = new Clase_Numero();
        // Asignar el número ingresado al atributo de la instancia
        numeroArmstrongObj.numero = numeroIngresado;

        // Verificar si el número es un número de Armstrong
        if (numeroArmstrongObj.esNumeroArmstrong()) {
            System.out.println(numeroIngresado + " es un número de Armstrong.");
        } else {
            System.out.println(numeroIngresado + " no es un número de Armstrong.");
        }

        // Cerrar el escáner
        scanner.close();
    }
    
}
