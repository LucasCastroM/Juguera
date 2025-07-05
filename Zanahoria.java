package PrimerParcial3.Ejercicio2;

public class Zanahoria extends Hortaliza {
    public Zanahoria(double peso) {
        super(peso);
    }

    public double exprimir() {
        double jugo = this.getPeso() * 0.40;
        return jugo - this.pesoExtra();
    }

}
