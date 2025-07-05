package PrimerParcial3.Ejercicio2;

public class VasoCopo extends Vaso {
    public VasoCopo(double contenido) {
        super(contenido);
    }


    @Override
    public String toString() {
        return "Vaso copón con " + contenido + " ml de jugo.";
    }
}

