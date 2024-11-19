package aplicacionISP;

import aplicacionISP.sistemaEmpleadosRestaurante.CamareroEmpleado;
import aplicacionISP.sistemaEmpleadosRestaurante.CocineroEmpleado;

public class Main {
    public static void main(String[] args) {
        CocineroEmpleado cocinero = new CocineroEmpleado();
        cocinero.cocinar();

        CamareroEmpleado camarero = new CamareroEmpleado();
        camarero.atenderMesas();
    }
}
