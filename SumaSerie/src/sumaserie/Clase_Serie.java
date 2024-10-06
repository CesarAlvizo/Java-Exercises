package sumaserie;
public class Clase_Serie {
    
    // Atributo para almacenar la suma de la serie
    private double sumaSerie;
    
    // Método para calcular la suma de la serie hasta el término n
        public void calcularSuma(int n) {
        int i = 1;
        while (i <= n) {
            sumaSerie += 1.0 / i;
            i++;
        }
    }

    // Método para mostrar el resultado
    public void mostrarResultado() {
        System.out.println("La suma de la serie es: " + sumaSerie);
    }
}
