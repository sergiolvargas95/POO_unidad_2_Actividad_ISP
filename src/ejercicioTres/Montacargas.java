package ejercicioTres;

public class Montacargas implements Transportador {
    private double capacidadMaxima;
    private double cargaActual;

    public Montacargas(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = 0;
    }

    @Override
    public void cargarMercancia(double peso) {
        if (cargaActual + peso <= capacidadMaxima) {
            cargaActual += peso;
            System.out.println("Montacargas: Cargados " + peso + " kg de mercancía. Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("Montacargas: Carga excede la capacidad máxima.");
        }
    }
}

