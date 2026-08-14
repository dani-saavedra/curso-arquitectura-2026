package co.edu.unisabana.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Internet internet = new Proxy();

        String result = internet.navegar("wikipedia.com");
        System.out.println(result);
        String result2 = internet.navegar("juegos.com");
        System.out.println(result2);
    }
}
