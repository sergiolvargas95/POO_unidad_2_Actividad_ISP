package aplicacionISP.sistemaEmpleadosRestaurante;

public class CocineroEmpleado implements Cocinero {
    @Override
    public void cocinar() {
        System.out.println("El cocinero está preparando la comida.");
    }
}
