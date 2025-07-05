package PrimerParcial3.Ejercicio2;

public class Vaso {
    protected double contenido;

    public Vaso(double contenido) {
        this.contenido = contenido;
    }

    public double getContenido() {
        return contenido;
    }

    public String toString() {
        return "Vaso con " + contenido + " ml de jugo.";
    }
}
