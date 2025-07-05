package PrimerParcial3.Ejercicio2;

public class Naranja extends Fruta {

    public Naranja(double peso) {
        super(peso);
        // TODO Auto-generated constructor stub
    }

    public double exprimir() {
        double jugo = this.getPeso() * 0.70;
        return jugo - this.pesoExtra();
    }
}
