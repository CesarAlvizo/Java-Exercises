package fp11_operaciones;
import java.util.Scanner;

public class Clase_Operaciones {
    public double Num1;
    public double Num2;
    public double Resultado;
    
    public void Captura_Datos()
    {
        Scanner objLeer = new Scanner(System.in);
        System.out.print("Captura numero uno: ");
        this.Num1 = objLeer.nextDouble();
        System.out.print("Captura numero dos: ");
        this.Num2 = objLeer.nextDouble();
    }
    
    public void Suma()
    {
        this.Resultado = this.Num1 + this.Num2;
        this.Impresion();
    }
    
    public void Resta()
    {
        this.Resultado = this.Num1 - this.Num2;
        this.Impresion();
    }
    
    public void Multiplicacion()
    {
        this.Resultado = this.Num1 * this.Num2;
        this.Impresion();
    }
    
    public void Division()
    {
        this.Resultado = this.Num1 / this.Num2;
        this.Impresion();
    }
    
    private void Impresion()
    {
        System.out.println("El resultado de la operación es: " 
                + this.Resultado);
    }
    
}
