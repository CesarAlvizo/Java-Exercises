package fpoo_uiii_e1;

public class Clase_OperacionesBasicas {
    //Definición de los aributos de la clase
    public int numero1;
    public int numero2;
    
    //Definición de métodos
    public void Sumar_Numeros()
    {        
        int Resultado = 0;
        Resultado = numero1 + numero2;
        System.out.println("La suma de los números es: " + 
                Integer.toString(Resultado));
    }
    
    public int Resta_Numeros()
    {
        int Resultado = 0;
        Resultado = numero1 - numero2;
        return Resultado;
    }
    
    public void Multiplicacion_Numeros()
    {
        int Resultado = 0;
        Resultado = numero1 * numero2;
        System.out.println("La multiplicación de los números es: " + 
                Integer.toString(Resultado));
    }
}
