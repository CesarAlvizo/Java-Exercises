package intermedio;
import java.util.Scanner;

public class Clase_Numero {
    public double Numero1;
    public double Numero2;
    public double Numero3;
    public double CifraIntermedia;

    public void CapturaNum(){
    Scanner objLeer=new Scanner(System.in);
    System.out.println("Escribe el primer número: ");
    this.Numero1=objLeer.nextDouble();    
    System.out.println("Escribe el segundo número: ");
    this.Numero2=objLeer.nextDouble(); 
    System.out.println("Escribe el tercer número: ");
    this.Numero3=objLeer.nextDouble(); 
    }
    public void Verificacion(){
 
         if ((Numero1 >= Numero2 && Numero1 <= Numero3) || (Numero1 <= Numero2 && Numero1 >= Numero3)) {
            CifraIntermedia = Numero1;
            System.out.println("La cifra intermedia es: "+ CifraIntermedia);

        } else if ((Numero2 >= Numero1 && Numero2 <= Numero3) || (Numero2 <= Numero1 && Numero2 >= Numero3)) {
            CifraIntermedia = Numero2;
            System.out.println("La cifra intermedia es: "+ CifraIntermedia);

        } else {
            CifraIntermedia = Numero3;
            System.out.println("La cifra intermedia es: "+ CifraIntermedia);
        }
       }
     }
   

