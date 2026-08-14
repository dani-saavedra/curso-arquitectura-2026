package co.edu.unisabana.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PagoTest {

    Pago pago = new Pago(new Database());

    @Test
    void Dado_datosCorrectos_Cuando_Paga_Entonces_retornaMsjExitoso() {
        String msj = pago.pagar(200, "1500");
        assertEquals("Pago realizado.", msj);
    }

    @Test
    void pagar_MontoDePagoMayorAlPermitido() {
        assertThrows(IllegalArgumentException.class, () -> pago.pagar(500, "1500"));
    }

    @Test
    void deberiaLanzarExcepcionCuandoLaTarjetaEsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> pago.pagar(200, null)
        );
        assertEquals("La tarjeta es obligatoria.", exception.getMessage());
    }

    @Test
    void deberiaLanzarExcepcionCuandoElMontoEsMenorA100() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> pago.pagar(100, "1500")
        );

        assertEquals("El monto debe ser mayor que 100.", exception.getMessage());
    }
    @Test
    void deberiaLanzarExcepcionCuandoLaTarjetaEsMayorAlRangoPermitido() {
        UnsupportedOperationException exception = assertThrows(
                UnsupportedOperationException.class,
                () -> pago.pagar(200, "3001")
        );

        assertEquals("El tarjeta no es valido.", exception.getMessage());
    }

}