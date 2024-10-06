package porcaprobadosreprobados;
public class PorcAprobadosReprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase PorcentajeAprobadosReprobados
        Clase_Calif porcentajeObj = new Clase_Calif();

        // Leer las calificaciones y calcular el porcentaje
        porcentajeObj.leerCalificaciones();

        // Mostrar el porcentaje de aprobados y reprobados
        porcentajeObj.mostrarPorcentaje();
    }
    
}
