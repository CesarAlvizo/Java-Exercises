
package fp_9_uii_ejercicios_t4;

public class FP_9_UII_Ejercicios_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Numeros;
        Numeros = new int[5];
        Class_Valores objValores = new Class_Valores();
        Numeros = objValores.Captura_Valores(Numeros);
        objValores.Buscar_NumMenores(Numeros);
    }
    
}
