package fpoo_uiii_e2;
import java.util.Scanner;

public class FPOO_UIII_E2 {

        public static void main(String[] args) {
        Clase_FigurasGeometricas objFiguras = new Clase_FigurasGeometricas();
        Scanner objLeerNumero = new Scanner(System.in);
        System.out.println("Lado cuadrado: ");
        objFiguras.Lado = objLeerNumero.nextInt();
        objFiguras.Calcular_Area_Cuadrado();
    }
}
