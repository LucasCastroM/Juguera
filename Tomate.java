package PrimerParcial3.Ejercicio2;

public class Tomate extends Hortaliza {
    public Tomate(double peso) {
        super(peso);
    }

    public double exprimir() {
        double jugo = this.getPeso() * 0.80;
        return jugo - this.pesoExtra();
    }

}
