package PrimerParcial3.Ejercicio2;

public class Pera extends Fruta {
    public Pera(double peso) {
        super(peso);
        // TODO Auto-generated constructor stub
    }

    public double exprimir() {
        double jugo = this.getPeso() * 0.70;
        return jugo - this.pesoExtra();
    }
}
