package violacionISP.metodosInnecesarios;

public class CocineroEmpleado implements Empleado {
    @Override
    public void cocinar() {
        System.out.println("El cocinero está cocinando.");
    }
    @Override
    public void limpiar() {
// Implementación vacía, ya que el cocinero no debería limpiar.
    }
    @Override
    public void atenderMesas() {
// Implementación vacía, ya que el cocinero no debería atender mesas.
    }
}
