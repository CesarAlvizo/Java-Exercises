/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp_9_uii_ejercicios_t2;
import java.util.Scanner;

public class Class_Numeros {
    private int numero;
    
    public String Verifica_Numero()
    {
        Scanner objCaptura = new Scanner(System.in);
        System.out.print("Captura el valor entero: ");
        this.numero = objCaptura.nextInt();
        if (numero == 0)
        {
            return "El número capturado es cero";
        }
        else if (this.numero > 0)
        {
            return "El número capturado es positivo.";
        }
        else
        {
            return "El número captura es negativo.";
        }
    }
}
