package clase_banco;
public class Clase_Banco {
    private double saldo;
    public Clase_Banco() {
        saldo = 0;
    }
    public void altaCliente(String nombre, String banco) {
        String nombreCliente = nombre;
        String bancoPertenece = banco;
        System.out.println("Cliente " + nombreCliente + " dado de alta en el banco " + bancoPertenece);
    }
    public void deposito(double cantidad, String nombre) {
        String nombreCliente = nombre;
        if (nombre.equals(nombreCliente)) {
            saldo += cantidad;
            System.out.println("Depósito exitoso para " + nombreCliente + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Cliente no encontrado en el banco");
        }
    }
    public void retiro(double cantidad, String nombre) {
        String nombreCliente = nombre;
        if (nombre.equals(nombreCliente)) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro exitoso para " + nombreCliente + ". Saldo actual: " + saldo);
            } else {
                System.out.println("Fondos insuficientes");
            }
        } else {
            System.out.println("Cliente no encontrado en el banco");
        }
    }
    public void consultarSaldo(String nombre) {
        String nombreCliente = nombre;
        if (nombre.equals(nombreCliente)) {
            System.out.println("Saldo actual de " + nombreCliente + ": " + saldo);
        } else {
            System.out.println("Cliente no encontrado en el banco");
        }
    }
    public static void main(String[] args) {
    Clase_Banco banco = new Clase_Banco();
    banco.altaCliente("Juan", "Banco Central");
    banco.deposito(250, "Juan");
    banco.retiro(100, "Juan");
    banco.consultarSaldo("Juan");
}    
}

