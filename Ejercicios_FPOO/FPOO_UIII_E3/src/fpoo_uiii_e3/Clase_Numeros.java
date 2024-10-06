
package fpoo_uiii_e3;


public class Clase_Numeros {
    //Definición de Atributos
    public int numero;
    
    public String Analiza_Numero()
    {
        String Resultado = "";
        if (numero > 0)
        {
            Resultado = "Postivo";
        }
        else if (numero < 0)
        {
            Resultado = "Negativo";
        }        
        else
        {
            Resultado = "Cero";
        }
        return Resultado;
    }
    
}
