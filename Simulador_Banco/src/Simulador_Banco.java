public class Simulador_Banco {
    private double saldo ;
    
    public Simulador_Banco() {
        saldo = 0;
    }

    public void deposito(double cantidad) {
        saldo += cantidad; //suma la cantidad ingresada por el usuario al saldo actual de la cuenta
        System.out.println("Depósito exitoso. Saldo actual: " + saldo);
    }

    public void retiro(double cantidad) {
        if (cantidad <= saldo) { //verifica si la cantidad a retirar es menor o igual al saldo disponible en la cuenta
            saldo -= cantidad; //En caso de que la condición del sea verdadera, esta línea resta la cantidad especificada
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else { // En caso de que los fondos sean insuficientes para realizar el retiro
            System.out.println("Fondos insuficientes");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

 public static void main(String[] args) { 
        // TODO code application logic here
        // Crear una instancia de la clase Figuramagica
        Simulador_Banco objEst;
        objEst = new Simulador_Banco ();
        
        // Llamar al método piramide para solicitar la altura al usuario
        objEst.deposito(2500);
        objEst.retiro(1000);
        objEst.consultarSaldo();
}}
