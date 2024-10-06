/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitacion;
import java.util.Scanner;

public class Clase_Habitacion {
    public String tipoHab;
    public int diasHab;
    public int costo;
    
public void Captura_Datos(){
    Scanner objCaptura = new Scanner(System.in);
    System.out.println("Elija el tipo de habitacion: A, B, C.");
    this.tipoHab = objCaptura.nextLine();
    System.out.println("Numero de dias que se quedara: ");
    this.diasHab = objCaptura.nextInt();
}

public void Descuento_Total(){
    if(this.tipoHab.equals("A")){
      this.costo = 35;
    }else if(this.tipoHab.equals("B")){
        this.costo = 25;
    }else if(this.tipoHab.equals("C")){
        this.costo = 15;
    }
   
    if(this.diasHab >= 1)
    if(this.diasHab <= 3){
        double total;
        double descuento;
        double totalPagar;
        total = this.diasHab * this.costo;
        descuento = total * 2 / 100;
        totalPagar = total - descuento;
        System.out.println("Total a pagar: " + totalPagar);
    }else if(this.diasHab >= 4)
          if(this.diasHab <= 7){
        double total;
        double descuento;
        double totalPagar;
        total = this.diasHab * this.costo;
        descuento = total * 10 / 100;
        totalPagar = total - descuento;
        System.out.println("Total a pagar: " + totalPagar);
    }else if(this.diasHab >= 8){
        double total;
        double descuento;
        double totalPagar;
        total = this.diasHab * this.costo;
        descuento = total * 25 / 100;
        totalPagar = total - descuento;
        System.out.println("Total a pagar: " + totalPagar);
    }
}
}
