package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Calculadora.
 * Se cubren los métodos: convertirNumero, realizarOperacion, convertirADestino.
 */
public class CalculadoraTest {

    // Casos de Prueba Kendall

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

    // Casos de Prueba Carlos

    // Método: realizarOperacion (Prueba 2: Excepción División por cero)
    @Test(expected = ArithmeticException.class)
    public void realizarOperacion_DivisionPorCero_LanzaExcepcion() {
        Calculadora.realizarOperacion(5, 0, "/");
    }

    // Método: convertirADestino (Prueba 1: Decimal a Hexadecimal)
    @Test
    public void convertirADestino_DecimalAHex_RetornaStringCorrecto() {
        // 15 en decimal es "f" en hexadecimal
        String resultado = Calculadora.convertirADestino(15, 3);
        assertEquals("f", resultado);
    }

    // Método: convertirADestino (Prueba 2: Decimal a Binario)
    @Test
    public void convertirADestino_DecimalABinario_RetornaStringCorrecto() {
        // 2 en decimal es "10" en binario
        String resultado = Calculadora.convertirADestino(2, 0);
        assertEquals("10", resultado);
    }
}

