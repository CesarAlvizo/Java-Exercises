package estudiantes;


import java.util.Scanner;

public class Estudiantes
{
    //Declaracion de atributos 
    public String No_Control;
    public String Nombre_Completo;
    public String carrera;
    public String materia;
    public int C1;
    public int C2;
    public int C3;
    public double promedio;

    //Creacion de procesos
    public void Datos()
    {
        Scanner obj_captura = new Scanner(System.in);
        System.out.print("No de Control: ");
        this.No_Control = obj_captura.nextLine();
        System.out.print("Nombre: ");
        this.Nombre_Completo = obj_captura.nextLine();
        System.out.print("Carrera: ");
        this.carrera = obj_captura.nextLine();
        System.out.print("Materia: ");
        this.materia = obj_captura.nextLine();
        System.out.println("A continuacion se capturan " + "las calificaciones de la materia "+
            this.materia + ": ");
        System.out.print("Calificacion de la unidad I: ");
        this.C1 = obj_captura.nextInt();
        System.out.print("Calificacion de la unidad II: ");
        this.C2 = obj_captura.nextInt();
        System.out.print("Calificacion de la unidad III: ");
        this.C3 = obj_captura.nextInt();
    }   
}