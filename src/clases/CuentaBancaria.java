package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
     private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    // Constructor
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = new Random().nextInt(900000) + 100000; // Genera un número de cuenta aleatorio de 6 dígitos
        listaDeCuentasBancarias.add(this); // Añadimos la cuenta a la lista
    }

    // Getters y Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    // Métodos para depósito y retiro
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se deposito " + monto + " en la cuenta " + numeroCuenta);
        } else {
            System.out.println("El monto de deposito debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Se retiro " + monto + " de la cuenta " + numeroCuenta);
        } else {
            System.out.println("No hay suficiente saldo para retirar " + monto + ".");
        }
    }

    // Método para mostrar información de la cuenta
    public void despliegaInformacion() {
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.print("Titular: ");
        titular.despliegaInformacion();
    }

    // Método estático para imprimir información de todas las cuentas bancarias
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("\nInformacion de todas las cuentas bancarias:");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
        }
    }
}

    

