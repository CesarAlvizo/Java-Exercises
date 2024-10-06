
package fp8_parimpar;
import java.util.Scanner;

public class Clase_Numero {
    public int numero;
    public int suma;
    
    public void CapturaNumero()
    {
        Scanner objLeer = new Scanner(System.in);
        System.out.print("Captura número: ");
        this.numero = objLeer.nextInt();
        this.Verificion();
    }
    
    private void Verificion()
    {
        int Residuo = 0;
        Residuo = 0;
        Residuo = this.numero % 2;        
        Sumatoria(this.numero);
        Impresion(Residuo);
    }
    
    private void Sumatoria(int pNumero)
    {
        this.suma = 0;
        this.suma = this.suma + pNumero;
    }
    
    private void Impresion(int pResiduo)
    {
        if (pResiduo == 0)
        {
            System.out.println("El número " + this.numero + "es PAR");
        }
        else
        {
            System.out.println("El número " + this.numero + "es IMPAR");
        }
        System.out.println("La sumamatoria es: " + this.suma);
    }    
}
