
package fpoo_uiii_ciclo_for;

public class Clase_Estructura {
    public int numero;
    
    public void GeneraFactorial()
    {
        //Cpatura 5 = 5*4*3*2*1 ó 1*2*3*4*5
        String Factorial = "";
        int ResultadoFact = 1;
        for (int i=numero;i>=1;i--)
            {
                Factorial = Factorial + "*" + i;
                ResultadoFact = ResultadoFact * i;
            }
        System.out.println(Factorial + " = " + ResultadoFact);
    }    
}
