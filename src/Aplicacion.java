import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona persona1 = new Persona("Juan Perez", 30);
        Persona persona2 = new Persona("Ana Gomez", 25);
        Persona persona3 = new Persona("Carlos Ruiz", 40);

        // Crear instancias de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(500.0, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(3000.0, persona3);

        // Realizar operaciones de depósito y retiro
        cuenta1.depositar(500.0);  // Depositar 500 en cuenta1
        cuenta2.retirar(200.0);    // Retirar 200 de cuenta2
        cuenta3.depositar(1000.0); // Depositar 1000 en cuenta3

        // Imprimir los saldos después de las operaciones
        System.out.println("Saldo actual de cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo actual de cuenta2: " + cuenta2.getSaldo());
        System.out.println("Saldo actual de cuenta3: " + cuenta3.getSaldo());

        // Imprimir la información de todas las cuentas bancarias
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
