
package fpoo_uiii_meses;

public class Clase_Meses {
    public int numero_mes;
    
    public void ObtenerMes()
    {      
            switch (numero_mes) 
            {
                case 1:
                    System.out.println("Enero");
                    System.out.println("Año Nuevo y Rosca de Reyes");
                    break;
                case 2:
                    System.out.println("Febrero");
                    System.out.println("El día de amor y la amistad");
                    break;
                case 3:
                    System.out.println("Marzo");
                    System.out.println("Natalición  de Benito Juárez");
                    break;
                case 4:
                    System.out.println("Abril");
                    System.out.println("Feria de San Marcos");
                    break;
                case 5:
                    System.out.println("Mayo");
                    System.out.println("Día de la Madre");
                    break;
                case 6:
                    System.out.println("Junio");
                    System.out.println("Día del Padre");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    System.out.println("Día de la Independencia de México");
                    break;
                case 10:
                    System.out.println("Octubre");
                    System.out.println("Día de la raza");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    System.out.println("Aniversario de la Revolución");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    System.out.println("Temporada de navidad");
                    break;
                default:
                    System.out.println("Mes no válido");
                    break;
            }         
    }
    
}
