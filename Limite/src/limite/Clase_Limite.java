package limite;
import java.util.Scanner;

public class Clase_Limite {
    public double Liminf;
    public double Limsup;
    int Intervalo;
    
    Scanner objLeer = new Scanner(System.in);
            
    public void CapturaLim(){
        do{
            System.out.println("Escribe el limite inferior: ");
            this.Liminf=objLeer.nextDouble(); 
   
            System.out.println("Escribe el limite superior: ");
            this.Limsup=objLeer.nextDouble(); 
            
            if (Liminf > Limsup) {
                System.out.println("Error: El límite inferior es mayor que el límite superior. Intente de nuevo.");
            }
        }
        while (Liminf>Limsup);
    }
    
        public void Suma(){
         int suma = 0;
         int igual = 0;
         int fuera = -1;
         
            do {
            System.out.println("Ingresar intervalo: ");
            this.Intervalo=objLeer.nextInt();
            suma = (suma + Intervalo);
            
                if (Intervalo == Liminf||Intervalo == Limsup) {
                    igual = (igual + 1);
                }
                if (Intervalo < Liminf||Intervalo > Limsup) {
                    fuera=(fuera + 1);
                    suma = suma - Intervalo;
                }         
            } while (Intervalo !=0);
            
             if(Intervalo == 0){
             System.out.println("\nLa suma de los numeros dentro de los intervalos es: "+ suma);
             System.out.println("Numeros iguales a los limites: "+ igual);
             System.out.println("Numeros fuera del rango: " + fuera );}

        }
        
}
       
