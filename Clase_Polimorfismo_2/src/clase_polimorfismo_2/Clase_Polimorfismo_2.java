package clase_polimorfismo_2;
class Instrumento {
    void tocar() {
        System.out.println("El instrumento está sonando");
    }
}
class Guitarra extends Instrumento { 
    @Override
    void tocar() {
        System.out.println("La guitarra está sonando");
    }
}
class Piano extends Instrumento { 
    @Override
    void tocar() {
        System.out.println("El piano está sonando");
    }
}
public class Clase_Polimorfismo_2 {
    public static void main(String[] args) {
        Instrumento instrumento1 = new Guitarra(); 
        Instrumento instrumento2 = new Piano(); 
        
        instrumento1.tocar(); 
        instrumento2.tocar();
    }
}