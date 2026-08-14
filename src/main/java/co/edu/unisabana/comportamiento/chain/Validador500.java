package co.edu.unisabana.comportamiento.chain;

public class Validador500 implements ValidadorMoneda {
    @Override
    public boolean reconoceMoneda(Moneda moneda) {
        return moneda.getTexto().equals("COP 500");
    }

    @Override
    public int valorMoneda() {
        return 500;
    }
}
