
package fpoo_uiii_while;

public class Clase_Meses {
    public void Muestra_MesesAño()
    {
        int cont = 0;
        while (cont <= 12)
        {
            cont++; //cont = cont + 1;
            switch (cont) 
            {
                case 1:
                    System.out.println("Enero");
                    System.out.println("Año Nuevo y Rosca de Reyes");
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("Febrero");
                    System.out.println("El día de amor y la amistad");
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("Marzo");
                    System.out.println("Natalición  de Benito Juárez");
                    System.out.println("------------------------------");
                    break;
                case 4:
                    System.out.println("Abril");
                    System.out.println("Feria de San Marcos");
                    System.out.println("------------------------------");
                    break;
                case 5:
                    System.out.println("Mayo");
                    System.out.println("Día de la Madre");
                    System.out.println("------------------------------");
                    break;
                case 6:
                    System.out.println("Junio");
                    System.out.println("Día del Padre");
                    System.out.println("------------------------------");
                    break;
                case 7:
                    System.out.println("Julio");
                    System.out.println("------------------------------");
                    break;
                case 8:
                    System.out.println("Agosto");
                    System.out.println("------------------------------");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    System.out.println("Día de la Independencia de México");
                    System.out.println("------------------------------");
                    break;
                case 10:
                    System.out.println("Octubre");
                    System.out.println("Día de la raza");
                    System.out.println("------------------------------");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    System.out.println("Aniversario de la Revolución");
                    System.out.println("------------------------------");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    System.out.println("Temporada de navidad");
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Mes no válido");
                    break;
            }
        }
    }
    /*Método para mostrar como se ejecuta el ciclo
      Do - While
    */
    public void DW_Muestra_MesesAño()
    {
        int cont = 1;
        do
        {            
            switch (cont) 
            {                
                case 1:
                    System.out.println("Enero");
                    System.out.println("Año Nuevo y Rosca de Reyes");
                    System.out.println("------------------------------");
                    break;
                case 2:
                    System.out.println("Febrero");
                    System.out.println("El día de amor y la amistad");
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("Marzo");
                    System.out.println("Natalición  de Benito Juárez");
                    System.out.println("------------------------------");
                    break;
                case 4:
                    System.out.println("Abril");
                    System.out.println("Feria de San Marcos");
                    System.out.println("------------------------------");
                    break;
                case 5:
                    System.out.println("Mayo");
                    System.out.println("Día de la Madre");
                    System.out.println("------------------------------");
                    break;
                case 6:
                    System.out.println("Junio");
                    System.out.println("Día del Padre");
                    System.out.println("------------------------------");
                    break;
                case 7:
                    System.out.println("Julio");
                    System.out.println("------------------------------");
                    break;
                case 8:
                    System.out.println("Agosto");
                    System.out.println("------------------------------");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    System.out.println("Día de la Independencia de México");
                    System.out.println("------------------------------");
                    break;
                case 10:
                    System.out.println("Octubre");
                    System.out.println("Día de la raza");
                    System.out.println("------------------------------");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    System.out.println("Aniversario de la Revolución");
                    System.out.println("------------------------------");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    System.out.println("Temporada de navidad");
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Mes no válido");
                    break;
            }
            cont++;
        }
        while (cont == 1);
    }
}
