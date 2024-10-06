package fabionacci;

public class Clase_Fabionacci {
    // Atributo para almacenar los primeros n números de Fibonacci
    private int[] NumerosF;
    
    // Método para calcular los primeros n números de Fibonacci
    public void calcularFibonacci(int n) {
        NumerosF = new int[n];
        int i = 0;
        int a = 0, b = 1;

        while (i < n) {
            NumerosF[i] = a;
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
    }

    // Método para mostrar los resultados
    public void mostrarResultado() {
        System.out.print("Los primeros números de Fibonacci son: ");
        for (int num : NumerosF) {
            System.out.print(num + " ");
        }
    }
}
