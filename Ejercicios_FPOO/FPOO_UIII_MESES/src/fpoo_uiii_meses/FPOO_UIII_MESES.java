
package fpoo_uiii_meses;
import java.util.Scanner;

public class FPOO_UIII_MESES {

   
    public static void main(String[] args) {
        Clase_Meses objMes = new Clase_Meses();
        Scanner LeerMes = new Scanner(System.in);
        System.out.print("Captura el número de mes: ");
        objMes.numero_mes = LeerMes.nextInt();
        objMes.ObtenerMes();
    }
    
}
