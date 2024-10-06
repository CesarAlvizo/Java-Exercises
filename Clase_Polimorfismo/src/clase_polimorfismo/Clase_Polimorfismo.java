package clase_polimorfismo;
class Animal { //Se define una clase base Animal
   void sonido() {
      System.out.println("El animal emite un sonido");
   }
}

class Gato extends Animal { //Se define una subclase Gato que extiende la clase Animal
   void sonido() {
      System.out.println("El gato maulla");
   }
}

public class Clase_Polimorfismo {

    public static void main(String[] args) {
         Animal a = new Gato(); //Se crea una referencia de la clase base apuntando a una instancia de la subclase
        a.sonido(); //Se llama al método sonido a través de la referencia
    }
}