
package hardware;
import java.util.Scanner;

public class Clase_Hardware {
    public String nombre;
    public String marca;      
    public double precio;
    public double agregado;
 
     public void Captura_Datos()
    {
        Scanner objCaptura = new Scanner(System.in);
        System.out.print("Captura el nombre: ");
        this.nombre = objCaptura.nextLine();
        System.out.print("Captura la marca: ");
        this.marca = objCaptura.nextLine();
        System.out.print("Captura el precio: ");
        this.precio = objCaptura.nextDouble();
    }
     
    public void Cargo_Producto()
    {
        if (this.precio > 300)
        {
            agregado = this.precio * 1.16; 
            System.out.println("El costo total es de: "+ agregado);

        } 
    
        else
        {
            agregado = this.precio + 90;
            System.out.println("Se ha agregado un cargo de 90 pesos por entrega a domicilio");
            System.out.println("El costo total es de: "+ agregado);

            
        }                                  
    }
  }

