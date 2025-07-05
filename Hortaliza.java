package PrimerParcial3.Ejercicio2;

public class Hortaliza extends Alimento{
    public Hortaliza(double peso){
       super(peso);
    }

    public double pesoExtra(){
        return this.getPeso() *0.05;
    }
}
