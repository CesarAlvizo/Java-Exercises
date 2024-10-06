package clase_herencia_2;
class Vehiculo {
    void arrancar() {
        System.out.println("El vehículo puede arrancar");
    }
}

class Coche extends Vehiculo { 
    void tocarBocina() {
        System.out.println("El coche puede tocar la bocina");
    }
}

class Bicicleta extends Vehiculo { 
    void pedalear() {
        System.out.println("La bicicleta se puede pedalear");
    }
}

public class Clase_Herencia_2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche(); 
        miCoche.arrancar(); 
        miCoche.tocarBocina(); 

        Bicicleta miBici = new Bicicleta(); 
        miBici.arrancar(); 
        miBici.pedalear(); 
    }
}
