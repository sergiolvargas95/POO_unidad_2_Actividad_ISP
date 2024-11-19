package ejercicioTres;

public class Camion implements Conducible, Transportador {
    private double capacidadMaxima;
    private double cargaActual;

    public Camion(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = 0;
    }

    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }

    @Override
    public void cargarMercancia(double peso) {
        if (cargaActual + peso <= capacidadMaxima) {
            cargaActual += peso;
            System.out.println("Cargados " + peso + " kg de mercancía. Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("Carga excede la capacidad máxima del camión.");
        }
    }
}
