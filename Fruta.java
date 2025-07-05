package PrimerParcial3.Ejercicio2;

public class Fruta extends Alimento {

    public Fruta(double peso) {
        super(peso);
    }

    public double pesoExtra() {
        return this.getPeso() * 0.10;
    }

}
