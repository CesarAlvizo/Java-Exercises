package numerosamigos;

import java.util.Scanner;

public class NumerosAmigos{
        
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        Amigueada numerosAmigos = new Amigueada(numero1, numero2);

        if (numerosAmigos.sonAmigos()) {
            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
        }
    }
    }
}
