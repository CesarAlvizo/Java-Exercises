
package fpoo_uiii_ciclo_for;
import java.util.Scanner;

public class FPOO_UIII_Ciclo_For {
    public static void main(String[] args) {
        Clase_Estructura objFactorial = new Clase_Estructura();
        Scanner LeerNumero = new Scanner(System.in);
        System.out.print("Captura el número: ");
        objFactorial.numero = LeerNumero.nextInt();
        objFactorial.GeneraFactorial();
    }
    
}
