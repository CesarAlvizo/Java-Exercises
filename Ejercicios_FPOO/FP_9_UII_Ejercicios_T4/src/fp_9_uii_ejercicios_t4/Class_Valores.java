
package fp_9_uii_ejercicios_t4;
import java.util.Scanner;
/**
 *
 * @author Miguel Ortiz
 */
public class Class_Valores {
        
    public int[] Captura_Valores(int[] paramNumeros)
    {
        Scanner objLeer = new Scanner(System.in);
        for (int i = 0;i < paramNumeros.length;i++)
        {
            System.out.print("Captura número " + (i) + ": ");
            paramNumeros[i] = objLeer.nextInt();
        }
        return paramNumeros;
    }
    
    public void Buscar_NumMenores(int[] paramNumeros)
    {
        int ValorMayor = -99999;
        int ValorMenor = 999999;
        String Posicion = "Posiciones: ";
        for (int i = 0; i < paramNumeros.length; i++)
        {
            if (paramNumeros[i]<ValorMenor)
            {
                ValorMenor = paramNumeros[i];
            }
        }
        
        for(int i = 0; i < paramNumeros.length; i++)
        {
            if (paramNumeros[i] == ValorMenor)
            {                
                Posicion = Posicion + (i + 1) + ",";
                //ValorMenor = paramNumeros[i];
            }
        }
        System.out.println("Número menor encontrado: " + ValorMenor + "\n" +
                "Posiciones: " + Posicion);
        
    }
}
