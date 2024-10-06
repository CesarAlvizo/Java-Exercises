package fabionacci;
import java.util.Scanner;

public class Fabionacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número n
        System.out.print("Ingrese un número para los primeros números de Fibonacci: ");
        int n = scanner.nextInt();

        // Verificar si n es mayor que 0
        if (n > 0) {
            // Crear una instancia de la clase Fibonacci
            Clase_Fabionacci fibonacciObj = new Clase_Fabionacci();

            // Calcular los primeros n números de Fibonacci
            fibonacciObj.calcularFibonacci(n);

            // Mostrar el resultado
            fibonacciObj.mostrarResultado();
        } else {
            System.out.println("Por favor, ingrese un número mayor que 0.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
