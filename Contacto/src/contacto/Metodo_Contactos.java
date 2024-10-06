
package contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodo_Contactos {

    public static void main(String[] args) {
//Creamos un ArrayList llamado Contacto
        ArrayList<Contacto> agenda = new ArrayList<>();
        try (//Creamos un objeto Scanner llamado scanner para leer la entrada del usuario
                Scanner input = new Scanner(System.in)) {
            int opcion;
//Inicia un bucle (Do-while) para permitir al usuario realizar múltiples operaciones
            do {
                System.out.println("\nOpciones:");
                System.out.println("1. Agregar contacto");
                System.out.println("2. Eliminar contacto");
                System.out.println("3. Buscar contacto");
                System.out.println("4. Salir");
                System.out.print("Ingrese la opción deseada: ");
                opcion = input.nextInt();
                input.nextLine(); // Consumir el salto de línea
//Permite seleccionar la operación a realizar según la opción elegida por el usuario
switch (opcion) {
    case 1 -> {
        //Agregar contacto
        System.out.print("Ingrese el nombre del contacto: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese el número celular: ");
        String numeroCelular = input.nextLine();
        System.out.print("Ingrese el correo del contacto: ");
        String correo = input.nextLine();
        System.out.print("Ingrese la dirección del contacto: ");
        String direccion = input.nextLine();


        Contacto nuevoContacto = new Contacto(nombre, numeroCelular, correo, direccion);
        agenda.add(nuevoContacto);
        System.out.println("Contacto agregado a la agenda.");
    }
    case 2 -> {
        //Eliminar Contacto
        System.out.print("Ingrese el correo del contacto a eliminar: ");
        String correoEliminar = input.nextLine();
        agenda.removeIf(contacto -> contacto.getcorreo().equals(correoEliminar));
        System.out.println("Contacto eliminado de la agenda.");
    }
    case 3 -> {
        //Buscar Contacto
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        String nombreBuscar = input.nextLine();
        for (Contacto c : agenda) {
            if (c.getNombre().equals(nombreBuscar)) {
                System.out.println("Contacto encontrado - Nombre: " + c.getNombre() + ", Número Celular: " + c.getNumeroCelular());
                break;
            }
        }
        System.out.println("Contacto no encontrado en la agenda.");
    }
    case 4 -> //Finaliza el programa si el usuario elige esta opción
        System.out.println("Saliendo de la agenda de contactos.");
    default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
}
            } while (opcion != 4);
//Se cierra el objeto al finalizar el programa.
        }
    }
}