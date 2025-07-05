package PrimerParcial3.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Fruta manzana = new Manzana(100);       // 100g
        Hortaliza zanahoria = new Zanahoria(80); // 80g

        Vaso vaso1 = H2022Plus.servir(manzana);
        Vaso vaso2 = H2022Plus.servir(zanahoria);

        System.out.println(vaso1); // Vaso trago largo con X ml de jugo.
        System.out.println(vaso2); // Vaso copón con Y ml de jugo.
    }
}
