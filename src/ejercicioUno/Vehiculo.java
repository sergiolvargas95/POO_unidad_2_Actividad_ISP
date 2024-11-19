package ejercicioUno;

public class Vehiculo implements Reparacion, Limpieza {
    @Override
    public void reparar() {
        System.out.println("Reparando el vehículo.");
    }

    @Override
    public void limpiar() {
        System.out.println("Limpiando el vehículo.");
    }
}
