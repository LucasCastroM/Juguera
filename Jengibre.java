package PrimerParcial3.Ejercicio2;

public class Jengibre extends Hortaliza {

    public Jengibre(double peso) {
        super(peso);
    }

    public double exprimir() {
        double jugo = this.getPeso() * 0.30;
        return jugo - this.pesoExtra();
    }
    
}
