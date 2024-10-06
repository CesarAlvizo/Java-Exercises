class Operaciones {
    // Atributos para almacenar números
     double numero1;
    double numero2;

    // Constructor
    public Operaciones(double num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    // Método para realizar la suma
    public double sumar() {
        return numero1 + numero2;
    }

    // Método para realizar la resta
    public double restar() {
        return numero1 - numero2;
    }

    // Método para realizar la multiplicación
    public double multiplicar() {
        return numero1 * numero2;
    }

    // Método para realizar la división
    public double dividir() {
        //Primero verifica si numero2 no es igual a 0. Esta condición se utiliza para evitar la división por cero
        if (numero2 != 0) {
        //Si numero2 no es cero, procede a realizar la división numero1 / numero2.  
            return numero1 / numero2;
        //Si numero2 es 0, entra en el bloque else.
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
    
        // Método para calcular la raíz cuadrada de uno de los números almacenados
    public double calcularRaizCuadrada() {
        return Math.sqrt(numero1);
    }
   public double calcularRaizCuadrada2() {
        return Math.sqrt(numero2);
    }
        
    // Método para mostrar la información de los resultados
    public void mostrarResultados() {
        System.out.println("Suma: " + sumar());
        System.out.println("Resta: " + restar());
        System.out.println("Multiplicación: " + multiplicar());
        System.out.println("División: " + dividir());
        System.out.println("El resultado de la raíz de " + numero1 + " es: " +  calcularRaizCuadrada());
        System.out.println("El resultado de la raíz de " + numero2 + " es: " +  calcularRaizCuadrada2());
        }
}