package PrimerParcial3.Ejercicio2;

public class Manzana extends Fruta {

    public Manzana(double peso) {
        super(peso);
    }

     public double exprimir() {
        double jugo = this.getPeso() * 0.75;
        return jugo - this.pesoExtra();
    }

}
