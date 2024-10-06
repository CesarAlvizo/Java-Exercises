package salario;
import java.util.Scanner;
        
public class Clase_Empleado {
    public String Nombre;
    public double SalarioBase;
    public double Apoyo;
    public double Bono;
    public double Impuesto;
    public double SalarioFinal;

    
    public void CapturaDatos(){
    Scanner objLeer = new Scanner(System.in);
    System.out.println("Captura tu nombre: ");
    this.Nombre= objLeer.nextLine();
    System.out.println("Captura tu salario base: ");
    this.SalarioBase= objLeer.nextDouble();
    
    }
    
    public void Calculo_Salario(){
        if (SalarioBase>=1000 && SalarioBase <=3000) {
            this.Apoyo=(SalarioBase*.05);
            this.Bono=(SalarioBase*.10);
            this.SalarioFinal=(SalarioBase+Apoyo+Bono);
            System.out.println(Nombre+" \nTu salario sin aplicar alguna gratificacion o impuesto es de: "+SalarioBase+"\nTu salario final es de: "+SalarioFinal);
            }
            if (SalarioBase>=3001 && SalarioBase <=5000) {
            this.Bono=(SalarioBase*.15);    
            this.SalarioFinal=(SalarioBase+Bono);
            System.out.println(Nombre+" \nTu salario sin aplicar alguna gratificacion o impuesto es de: "+SalarioBase+"\nTu salario final es de: "+SalarioFinal);    
            }
            if (SalarioBase>=5001) {
            this.Impuesto=(SalarioBase*.08);    
            this.SalarioFinal=(SalarioBase-Impuesto);
            System.out.println(Nombre+" \nTu salario sin aplicar alguna gratificacion o impuesto es de: "+SalarioBase+"\nTu salario final es de: "+SalarioFinal);    
            }  
            else{
            System.out.println(Nombre+" \nTu salario es de: "+SalarioBase);    
            }
            
        }
        
    }

