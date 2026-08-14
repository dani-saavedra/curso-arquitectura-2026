package co.edu.unisabana.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Coinko {

    List<ValidadorMoneda> validadorMonedas;

    public Coinko() {
        validadorMonedas = new ArrayList<>();
        validadorMonedas.add(new Validador500());
        validadorMonedas.add(new Validador200());
        validadorMonedas.add(new Validador1000());
    }

    /*
        public int recibirDinero(List<String> monedas) {
            int dinero = 0;
            for (String moneda : monedas) {
                if (moneda.equals("COP 200")) {
                    dinero += 200;
                } else if (moneda.equals("COP 500")) {
                    dinero += 500;
                } else if (moneda.equals("COP 1000")) {
                    dinero += 1000;
                }
            }
            return dinero;
        }
         */
    public int recibirDinero(List<Moneda> monedas) {
        int dinero = 0;
        for (Moneda moneda : monedas) {
            for (ValidadorMoneda validador : validadorMonedas) {
                if (validador.reconoceMoneda(moneda)) {
                    dinero += validador.valorMoneda();
                    break;
                }
            }
        }
        return dinero;
    }
}