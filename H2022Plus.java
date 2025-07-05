package PrimerParcial3.Ejercicio2;

public class H2022Plus {


    public static Vaso servir(Fruta fruta) {
        double jugo = fruta.exprimir();
        return new VasoTragoLargo(jugo);

    }

    public static Vaso servir(Hortaliza hortaliza){
        double jugo = hortaliza.exprimir();
        return new VasoCopo(jugo);
    }

}
