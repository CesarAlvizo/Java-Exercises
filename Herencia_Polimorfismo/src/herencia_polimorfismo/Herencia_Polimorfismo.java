//Agregar 2 nuevas subclases que hereden y tenga un metodo personalizado cada una
package herencia_polimorfismo;
class Forma {
    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}
// Definición de la subclase Circulo que hereda de Forma
class Circulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
    public void calcularRadio(double area) {
        double radio = Math.sqrt(area / Math.PI);
        System.out.println("El radio del círculo con área " + area + " es: " + radio);
    }
}
// Definición de la subclase Rectangulo que hereda de Forma
class Rectangulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
    public void calcularArea(double largo, double ancho) {
        double area = largo * ancho;
        System.out.println("El área del rectángulo es: " + area);
    }
}

// Definición de la subclase Triangulo que hereda de Forma
class Triangulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }
    public void calcularPerimetro(double lado1, double lado2, double lado3) {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }
}

// Definición de la subclase Cuadrado que hereda de Forma
class Cuadrado extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
    public void calcularDiagonal(double lado) {
        double diagonal = lado * Math.sqrt(2);
        System.out.println("La diagonal del cuadrado es: " + diagonal);
    }
}

// Definición de la clase DibujodeFormas que utiliza polimorfismo
class DibujoDeFormas {
    public void dibujarForma(Forma forma) {
        forma.dibujar();
    }
}

public class Herencia_Polimorfismo {
    public static void main(String[] args) {
        Forma circulo = new Circulo();
        Forma rectangulo = new Rectangulo();
        Forma triangulo = new Triangulo(); 
        Forma cuadrado = new Cuadrado(); 

        DibujoDeFormas dibujo = new DibujoDeFormas(); 
        dibujo.dibujarForma(circulo); 
        dibujo.dibujarForma(rectangulo); 
        dibujo.dibujarForma(triangulo); 
        dibujo.dibujarForma(cuadrado);
        
        ((Circulo) circulo).calcularRadio(78.5);
        ((Rectangulo) rectangulo).calcularArea(5, 10);
        ((Triangulo) triangulo).calcularPerimetro(3, 4, 5);
        ((Cuadrado) cuadrado).calcularDiagonal(4);
    }
}