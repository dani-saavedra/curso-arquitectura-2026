package co.edu.unisabana.creacional.abtract;

public class Main {
    public static void main(String[] args) {
        Decorador decorador = new Decorador();
        //decorador.decorar("Art Deco");
        decorador.decorar(new ConcreteArtDeco());
    }
}
