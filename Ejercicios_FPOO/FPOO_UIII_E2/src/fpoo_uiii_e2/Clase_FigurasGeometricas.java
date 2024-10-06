package fpoo_uiii_e2;

public class  Clase_FigurasGeometricas {
    //Atributos
    public int Lado;
    public int Area;
    
    public void Calcular_Area_Cuadrado (){
        Area = Lado * Lado;
        System.out.println("El área del cuadrado es: " + 
                Area);
    }
}
