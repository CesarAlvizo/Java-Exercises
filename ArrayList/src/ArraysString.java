import java.util.ArrayList;

public class ArraysString {

    public static void main(String[] args) {
        //Voy a generar mi lista
        java.util.ArrayList<String> nombres = new java.util.ArrayList<>();
        //Agrego los datos de la lista
        nombres.add("Javier Alejandro");
        nombres.add("Luis Fernando");
        nombres.add("Marisol");
        nombres.add("Francisco");
        nombres.add("Monica Daniela");
        nombres.add("Norma");
        //Imprimir la lista
        System.out.println("Nombres de la lista:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        //Creo metodo para eliminar datos
        nombres.remove("Luis Fernando");
        nombres.remove("Francisco");
        
        System.out.println(); //Saltar linea y no quede junto
        
        //Mostrar lista actualizada
        System.out.println("Lista actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

