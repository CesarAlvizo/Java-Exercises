package porcaprobadosreprobados;
import java.util.Scanner;
public class Clase_Calif {
    // Atributos para almacenar el número de aprobados y reprobados
    private int aprobados;
    private int reprobados;

    // Método para leer las calificaciones y calcular el porcentaje de aprobados y reprobados
    public void leerCalificaciones() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            System.out.print("Ingrese la calificación del alumno " + i + ": ");
            int calificacion = scanner.nextInt();

            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
   // Método para calcular y mostrar el porcentaje de aprobados y reprobados
    public void mostrarPorcentaje() {
        double porcentajeAprobados = (double) aprobados / 50 * 100;
        double porcentajeReprobados = (double) reprobados / 50 * 100;

        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");
    }

}
