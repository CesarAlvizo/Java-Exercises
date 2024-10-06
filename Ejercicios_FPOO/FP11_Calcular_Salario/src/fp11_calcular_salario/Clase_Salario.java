
package fp11_calcular_salario;
import java.util.Scanner;

public class Clase_Salario {
    public double salario;
    public String nombre;
    public double Salario_Tot;
    
    public void Captura_Datos()
    {
        Scanner objLeer = new Scanner(System.in);
        System.out.println("Captura nombre: ");
        this.nombre = objLeer.nextLine();
        System.out.print("Captura el salario: ");
        this.salario = objLeer.nextDouble();
    }
    
    public void Calcular_Salario()
    {
        if (this.salario >= 2000 && this.salario <= 5000)
        {
            this.Salario_Tot = (this.salario * 0.03) + this.salario;
        }
        else if (this.salario >= 5001)
        {
            this.Salario_Tot = this.salario - (this.salario * 0.02);
        }
        else 
        {
            this.Salario_Tot = this.salario;
        }
    }
    
    public void Impresion()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario Neto: " + this.salario);
        System.out.println("Salario Total: " + this.Salario_Tot);
    }
    
}
