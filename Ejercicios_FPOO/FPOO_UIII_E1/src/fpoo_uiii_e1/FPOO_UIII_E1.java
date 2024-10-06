package fpoo_uiii_e1;
import java.util.Scanner;

public class FPOO_UIII_E1 {

    public static void main(String[] args) {
       int Obtener_Resultado;
       Clase_OperacionesBasicas objOperaciones = new Clase_OperacionesBasicas();
       Scanner objLeer_Numero = new Scanner(System.in);
       
       System.out.print("Captura el numero uno: ");
       objOperaciones.numero1 = objLeer_Numero.nextInt();
       System.out.print("Captura el numero dos: ");
       objOperaciones.numero2 = objLeer_Numero.nextInt();
       
       /*Ejecución de los métodos de la clase Clase_OperacionesBasicas*/
       objOperaciones.Multiplicacion_Numeros();
       objOperaciones.Sumar_Numeros();
       Obtener_Resultado = objOperaciones.Resta_Numeros();
       
       /*Impresión de resultados*/
       System.out.println("El resultado de la resta es: " +
               Obtener_Resultado);  
    }    
}
