import java.util.Scanner;
public class Clase_Scanner {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        // Solicitar al usuario que ingrese un número decimal
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Solicitar al usuario que ingrese un carácter
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
                
        // Mostrar un mensaje con la información ingresada
        System.out.println("Hola, " + nombre + ". Tu edad es " + edad + " años.");
        
        // Mostrar los datos ingresados por el usuario
        System.out.println("El número decimal ingresado es: " + numeroDecimal);
        System.out.println("El carácter ingresado es: " + caracter);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}