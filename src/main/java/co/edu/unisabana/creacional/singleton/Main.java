package co.edu.unisabana.creacional.singleton;

public class Main {
    public static void main(String[] args) {
        Cache cache = Cache.getInstance();
        Cache otroObjetoCualquiera = Cache.getInstance();

        System.out.println(cache);
        System.out.println(otroObjetoCualquiera);
    }
}
