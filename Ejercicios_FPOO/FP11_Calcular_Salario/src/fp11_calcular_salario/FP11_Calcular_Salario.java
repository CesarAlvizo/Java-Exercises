package fp11_calcular_salario;

public class FP11_Calcular_Salario {
    
    public static void main(String[] args) {
        Clase_Salario objTrabajador = new Clase_Salario();
        objTrabajador.Captura_Datos();
        objTrabajador.Calcular_Salario();
        objTrabajador.Impresion();
    }
    
}
