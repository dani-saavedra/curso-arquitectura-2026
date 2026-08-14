package co.edu.unisabana.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coinko coinko = new Coinko();
        /*
        ArrayList<String> monedas = new ArrayList<>();
        monedas.add("300");
        monedas.add("COP 200");
        monedas.add("COP 1000");
        monedas.add("USD 1");
        int dineroTotalAceptado = coinko.recibirDinero(monedas);

         */
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("300"));
        monedas.add(new Moneda("COP 200"));
        monedas.add(new Moneda("200 OLD"));
        monedas.add(new Moneda("COP 1000"));
        monedas.add(new Moneda("USD 1"));
        int dineroTotalAceptado = coinko.recibirDinero(monedas);

        System.out.println("Dinero aceptado " + dineroTotalAceptado);
    }
}
