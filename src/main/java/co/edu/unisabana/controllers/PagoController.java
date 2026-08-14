package co.edu.unisabana.controllers;

import co.edu.unisabana.logica.Pago;

public class PagoController {

    Pago pago;

    public PagoController(Pago pago) {
        this.pago = pago;
    }

    //@Post
    public String pagar(int monto, String datos) {
        pago.pagar(monto, datos);
        return "ok";
    }
}
