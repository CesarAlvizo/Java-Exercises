package fp_8_ejercicio_1;
import java.util.Scanner;

public class Clase_Estudiante {
    /*Creación de los atributos de la clase.*/
    public String NoControl;
    public String NombreCompleto;
    public String Carrera;
    public String Materia;
    public int Cal1;
    public int Cal2;
    public int Cal3;
    public int Promedio;
    
    /* Creación de los procesos a ejecutar 
       por la clase. */
    
    public void CapturaDatos()
    {
        /*El método permite capturar la información de estudiante, así como
          las calificaciones obtenidas en una materia*/
        Scanner obj_Captura = new Scanner(System.in); // Definición de objeto para caltura de datos
        System.out.print("Captura el No. Control: ");
        this.NoControl = obj_Captura.nextLine();
        System.out.print("Captura el nombre: ");
        this.NombreCompleto = obj_Captura.nextLine();
        System.out.print("Captura el carrera: ");
        this.Carrera = obj_Captura.nextLine();
        System.out.print("Captura el materia: ");
        this.Materia = obj_Captura.nextLine();
        System.out.println("A continuación se capturaran "
                + "las calificaciones de la materia " + 
                this.Materia + ": ");
        System.out.print("Calificación de la Unidad I: ");
        this.Cal1 = obj_Captura.nextInt();
        System.out.print("Calificación de la Unidad II: ");
        this.Cal2 = obj_Captura.nextInt();
        System.out.print("Calificación de la Unidad III: ");
        this.Cal3 = obj_Captura.nextInt();
    }
    
    public void PromedioGral()
    {
        this.Promedio = (this.Cal1 + this.Cal2 + this.Cal3)/3;
        System.out.println("El promedio gral. de " +
                this.NombreCompleto + ": " + this.Promedio);
    }
    
    public void PromedioGralSinReprobadas()
    {
        int Sumatoria = 0;
        if (this.Cal1 >= 70)
        {
            Sumatoria = Sumatoria + this.Cal1; 
        }
        
        if (this.Cal2 >= 70)
        {
            Sumatoria = Sumatoria + this.Cal2; 
        }
        
        if (this.Cal3 >= 70)
        {
            Sumatoria = Sumatoria + this.Cal3; 
        }
        this.Promedio = Sumatoria / 3;
        System.out.println("El promedio del estudiante " +
                this.NombreCompleto + "es: " + this.Promedio);
    }
}
