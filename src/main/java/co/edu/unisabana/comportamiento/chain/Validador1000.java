package co.edu.unisabana.comportamiento.chain;

public class Validador1000 implements ValidadorMoneda {
    @Override
    public boolean reconoceMoneda(Moneda moneda) {
        return moneda.getTexto().equals("COP 1000");
    }

    @Override
    public int valorMoneda() {
        return 1000;
    }
}
