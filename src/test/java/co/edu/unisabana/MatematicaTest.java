package co.edu.unisabana;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {

    Matematica matematica = new Matematica();

    @Test
    void sumar() {
        //AAA
        //Arrange: Preparación
        //Act: ejecutar
        //Assertion: Validar
        int resultado = matematica.sumar(10, 20);
        assertEquals(30, resultado);
        //FIRST
        //El nombre de la prueba es el que representa el valor que va a tener la prueba
        //Given When Then

    }
}