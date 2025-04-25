package Cuentas;


import Cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;
        float cantidad = 100;

        Cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        

        operativa_cuenta(Cuenta1, cantidad);
    }

    private static void operativa_cuenta(CCuenta Cuenta1, float cantidad) {
        try {
            Cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
