package PrimerParcial3.Ejercicio2;

public class Remolacha extends Hortaliza {
    public Remolacha(double peso) {
        super(peso);
    }

    public double exprimir() {
        double jugo = this.getPeso() * 0.70;
        return jugo - this.pesoExtra();
    }

}
