package ejercicioDos;

public class CuentaBancaria implements Transferencia, Retiro, PagoFactura {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Transferencia de " + monto + " realizada a " + cuentaDestino);
        } else {
            System.out.println("Saldo insuficiente para la transferencia.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para el retiro.");
        }
    }

    @Override
    public void pagarFactura(double monto, String factura) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Factura " + factura + " pagada por " + monto);
        } else {
            System.out.println("Saldo insuficiente para pagar la factura.");
        }
    }
}
