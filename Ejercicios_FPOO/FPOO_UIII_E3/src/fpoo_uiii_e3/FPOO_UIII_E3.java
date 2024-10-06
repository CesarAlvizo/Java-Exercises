/*
Este programa calcula si el número ingresado desde la
consola es "Positivo", "Negativo" o un "Cero"
 */
package fpoo_uiii_e3;
import java.util.Scanner;
public class FPOO_UIII_E3 {
    public static void main(String[] args) {
        Clase_Numeros objNumeros = new Clase_Numeros();
        Scanner LeerNumero = new Scanner(System.in);
        String valor_metodo;
        
        System.out.print("Captura el número a analizar: ");
        objNumeros.numero = LeerNumero.nextInt();
        valor_metodo = objNumeros.Analiza_Numero();
        System.out.println("El número es un " + valor_metodo);
    }
    
}
