package ejercicioDos;

public class CuentaAhorro implements Retiro, PagoFactura {
    private double saldo;

    public CuentaAhorro(double saldoInicial) {
        this.saldo = saldoInicial;
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