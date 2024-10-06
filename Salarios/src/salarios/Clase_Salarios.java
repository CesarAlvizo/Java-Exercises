package salarios;
import java.util.Scanner;

public class Clase_Salarios {
    public String nombre;
    public double salarioDado;
    public double edad;

    public void Captura_Datos() {
        Scanner objCaptura = new Scanner(System.in);
        System.out.println("Captura el nombre: ");
        this.nombre = objCaptura.nextLine();
        System.out.println("Captura el salario: ");
        this.salarioDado = objCaptura.nextDouble();
        System.out.println("Captura la edad: ");
        this.edad = objCaptura.nextDouble();
    }

    public void Verificador_Edad() {
        if (edad < 16) {
            System.out.println("La persona no tiene edad para trabajar.");
        } else {
            double salario_total = salarioDado; // Salario sin beneficio

            if (edad >= 19 && edad <= 50) {
                salario_total *= 1.05; // Aumento del 5% para edades entre 19 y 50
            } else if (edad >= 51 && edad <= 60) {
                salario_total *= 1.10; // Aumento del 10% para edades entre 51 y 60
            } else if (edad > 60) {
                salario_total *= 1.15; // Aumento del 15% para edades mayores de 60
            }

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Salario sin aplicar ningún beneficio: " + salarioDado);
            System.out.println("Salario Total Para Pagar: " + salario_total);
        }
    }

}