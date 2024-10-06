/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasfinalesa;

import java.util.Scanner;

public class Mayoreada {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] notas = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese la nota #" + (i + 1) + ": ");
                notas[i] = scanner.nextInt();
            }
            
            ContadorNotas contadorNotas = new ContadorNotas(notas);
            contadorNotas.contarNotas();
        }
    }
    
}
