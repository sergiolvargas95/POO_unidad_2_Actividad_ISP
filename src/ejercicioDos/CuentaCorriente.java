package ejercicioDos;

public class CuentaCorriente implements Transferencia, PagoFactura {
    private double saldo;

    public CuentaCorriente(double saldoInicial) {
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
    public void pagarFactura(double monto, String factura) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Factura " + factura + " pagada por " + monto);
        } else {
            System.out.println("Saldo insuficiente para pagar la factura.");
        }
    }
}
