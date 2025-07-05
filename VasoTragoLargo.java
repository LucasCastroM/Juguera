package PrimerParcial3.Ejercicio2;

public class VasoTragoLargo extends Vaso {
    public VasoTragoLargo(double contenido) {
        super(contenido);
    }

    @Override
    public String toString() {
        return "Vaso trago largo con " + contenido + " ml de jugo.";
    }
}
