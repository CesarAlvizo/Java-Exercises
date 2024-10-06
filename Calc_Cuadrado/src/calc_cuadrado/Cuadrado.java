package calc_cuadrado;
import java.util.Scanner;

public class Cuadrado {
    public double Numero1;
    public double Numero2;
    public double Resultado;
    public double Perimetro;
    public double Area;
    
    public void Capturadedatos(){
    Scanner objLeer = new Scanner (System.in);
    System.out.print("Captura Numero 1: ");
    this.Numero1= objLeer.nextDouble();
    System.out.print("Captura Numero 2: ");
    this.Numero2= objLeer.nextDouble();
    }
    public void Calcular(){
        if (Numero1==Numero2) {
            Perimetro= this.Numero1+this.Numero2+this.Numero1+this.Numero2;
            System.out.println("El perimetro del cuadrado es: "+this.Perimetro);
            Area= this.Numero1*this.Numero2;
            System.out.println("El area del cuadrado es: "+this.Area);
        }
        else{
            System.out.println("No es posible calcular, los numeros digitados NO son iguales");
        }
    }
}
