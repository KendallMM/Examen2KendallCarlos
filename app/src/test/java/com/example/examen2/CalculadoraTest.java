package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Calculadora.
 * Se cubren los métodos: convertirNumero, realizarOperacion, convertirADestino.
 */
public class CalculadoraTest {

    // Método: convertirNumero (Prueba 1: Caso Exitoso)
    @Test
    public void convertirNumero_BinarioCorrecto_RetornaDecimal() {
        // 101 en binario es 5
        int resultado = Calculadora.convertirNumero("101", 0);
        assertEquals(5, resultado);
    }

    // Método: convertirNumero (Prueba 2: Caso de Error)
    @Test
    public void convertirNumero_TextoInvalido_RetornaMenosUno() {
        // "HOLA" no es un número válido
        int resultado = Calculadora.convertirNumero("HOLA", 2);
        assertEquals(-1, resultado);
    }

    // Método: realizarOperacion (Prueba 1: Suma simple)
    @Test
    public void realizarOperacion_Suma_RetornaSumaCorrecta() {
        int resultado = Calculadora.realizarOperacion(10, 20, "+");
        assertEquals(30, resultado);
    }
}

