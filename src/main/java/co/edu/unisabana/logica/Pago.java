package co.edu.unisabana.logica;

public class Pago {

    Database database;

    public Pago(Database database) {
        this.database = database;
    }

    public String pagar(int monto, String tarjetaPagar) {
        if (tarjetaPagar == null || tarjetaPagar.isBlank()) {
            throw new IllegalArgumentException("La tarjeta es obligatoria.");
        }
        validarNumeroTarjeta(tarjetaPagar);
        if (monto <= 100) {
            throw new IllegalArgumentException("El monto debe ser mayor que 100.");
        }
        if (monto >= 500) {
            throw new IllegalArgumentException("El monto debe ser menor que 500.");
        }
        //invoca algo
        database.guardarTransaccion(monto, tarjetaPagar);
        return "Pago realizado.";
    }


    //Si algo es dificil de probar, esta mal diseñado/implementado

    private void validarNumeroTarjeta(String tarjeta) {
        if (Integer.parseInt(tarjeta) < 1000 || Integer.parseInt(tarjeta) > 3000) {
            throw new UnsupportedOperationException("El tarjeta no es valido.");
        }
    }
}
