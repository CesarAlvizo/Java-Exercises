package sumaserie;
import java.util.Scanner;

public class SumaSerie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número n
        System.out.print("Ingrese un número entero positivo n: ");
        int n = scanner.nextInt();

        // Verificar si n es un número positivo
        if (n > 0) {
            // Crear una instancia de la clase SumaSerie
            Clase_Serie sumaSerieObj = new Clase_Serie();

            // Calcular la suma de la serie
            sumaSerieObj.calcularSuma(n);

            // Mostrar el resultado
            sumaSerieObj.mostrarResultado();
        } else {
            System.out.println("Por favor, ingrese un número entero positivo.");
        }

        // Cerrar el escáner
        scanner.close();
    }
    
}
