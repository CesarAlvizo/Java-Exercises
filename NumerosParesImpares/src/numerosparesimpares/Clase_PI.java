package numerosparesimpares;

public class Clase_PI {
    // Atributos para almacenar los límites del rango
    public int limiteInferior;
    public int limiteSuperior;

    // Método para mostrar los números pares e impares en el rango
    public void mostrarParesImpares() {
        System.out.println("Números pares en el rango:");
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros impares en el rango:");
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    } 
}
