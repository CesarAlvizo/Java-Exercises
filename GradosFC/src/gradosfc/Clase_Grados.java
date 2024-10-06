package gradosfc;
import java.util.Scanner;

public class Clase_Grados {
    public double Num;
    public double GradosC1;
    public double GradosC;


    public void Capturadedatos(){
    Scanner objLeer = new Scanner (System.in);
    System.out.print("Grados Farenheit a convertir: ");
    this.Num= objLeer.nextDouble();
}
    public void Conversion(){
    GradosC1=(this.Num-32);
    GradosC=(this.GradosC1*5/9);
    System.out.print("Formula: ("+this.Num+" - 32) * (5/9)\n");
    System.out.print("La conversion de "+this.Num+" Grados Farenheit "+" a grados Celsius es: "+this.GradosC+"\n");      
    }
}