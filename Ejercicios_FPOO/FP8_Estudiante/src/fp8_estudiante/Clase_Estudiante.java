package fp8_estudiante;
import java.util.Scanner;

public class Clase_Estudiante {
    public String nombre; //Captura nombre del estudiante
    public double PromGral; //Captura el promedio del estudiante
    
    /*Método que permite la evaluación de 
      promedio general, en el cual se me
      evalua si el estudainte aprobo o no.*/
    public void Captura_Datos()
    {
        Scanner objCaptura = new Scanner(System.in);
        System.out.print("Captura el nombre: ");
        this.nombre = objCaptura.nextLine();
        System.out.print("Captura el promedio gral.: ");
        this.PromGral = objCaptura.nextDouble();
    }
    
    public void Evaluacion_PromGral()
    {
        if (this.PromGral >= 70)
        {
            System.out.println("Nombre Estudiante: " +
                    this.nombre);
            System.out.println("El promedio es: " +
                    this.PromGral);
            System.out.println("El estudiante tiene un promedio aprobatorio.");
            
        }
        else
        {
            System.out.println("Nombre Estudiante: " +
                    this.nombre);
            System.out.println("El promedio es: " +
                    this.PromGral);
            System.out.println("El estudiante tiene un promedio reprobatorio.");
        }
    }
}
