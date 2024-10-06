/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasfinalesa;

public class ContadorNotas {

    // Atributo para almacenar las notas
    public int[] notas;

    // Constructor para inicializar las notas
    public ContadorNotas(int[] notas) {
        this.notas = notas;
    }

    // Método para contar notas mayores o iguales a 70 y a 100
    public void contarNotas() {
        int contador70 = 0;
        int contador100 = 0;
        int i = 0;

        do {
            if (notas[i] >= 70) {
                contador70++;
            }
            if (notas[i] == 100) {
                contador100++;
            }
            i++;
        } while (i < notas.length);
        
        System.out.println("Cantidad de notas mayores o iguales a 70: " + contador70);
        System.out.println("Cantidad de notas iguales a 100: " + contador100);
    }

}
