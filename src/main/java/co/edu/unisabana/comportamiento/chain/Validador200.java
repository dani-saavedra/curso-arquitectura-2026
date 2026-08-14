package co.edu.unisabana.comportamiento.chain;

public class Validador200 implements ValidadorMoneda {
    @Override
    public boolean reconoceMoneda(Moneda moneda) {
        return moneda.getTexto().equals("COP 200") || moneda.getTexto().equals("200 OLD");
    }

    @Override
    public int valorMoneda() {
        return 200;
    }
}
