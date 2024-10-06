package clase_herencia;

class Animal { //Se define una clase base Animal
   void mover() {
      System.out.println("Los animales pueden moverse");
   }
}

class Perro extends Animal { //Se define una subclase que extiende la clase
   void ladrar() {
      System.out.println("Los perros pueden ladrar");
   }
}

public class Clase_Herencia {
    public static void main(String[] args) {
      Perro labrador = new Perro(); //Se crea una instancia de la clase
      labrador.mover(); //Se llama al método en la instancia mover
      labrador.ladrar(); //Se llama al método en la instancia ladrar
    }
}