package digitos;
import java.util.Scanner;

public class Clase_Digitos {
    public double Numero;
    
    public void CapturaNum(){
    Scanner objLeer=new Scanner(System.in);
    System.out.println("Escribe un numero: ");
    this.Numero=objLeer.nextDouble();     
    }
    
    public void CalculoCifras(){
        if (Numero>=0 && Numero<=9) {
        System.out.println(Numero+" Es un numero de una cifra");
        }
        if (Numero>=10 && Numero<=99) {
        System.out.println(Numero+" Es un numero de dos cifras");
        }
        if (Numero>=100 && Numero<=999) {
        System.out.println(Numero+" Es un numero de tres cifras");
        }
        if (Numero>=1000) {
        System.out.println("Error, captura otro numero");
        }
    }
}
