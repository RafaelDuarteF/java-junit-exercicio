package com.locadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCalcularCustoComDesconto() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertEquals(630.0, veiculo.calcularCusto(7), 0.001);
    }

    @Test
    public void testCalcularCustoSemDesconto() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertEquals(300.0, veiculo.calcularCusto(3), 0.001);
    }

    @Test
    public void testDescontoPara7DiasOuMais() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertEquals(70.0, veiculo.desconto(7), 0.001);
        assertEquals(0.0, veiculo.desconto(6), 0.001);
    }

    @Test
    public void testCalcularMulta() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertEquals(150.0, veiculo.calcularMulta(1), 0.001);
        assertEquals(300.0, veiculo.calcularMulta(2), 0.001);
    }

    @Test
    public void testValorDiariaNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Veiculo("Fiat Uno", -100.0);
        });
    }

    @Test
    public void testDiasAluguelZeroOuNegativo() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            veiculo.calcularCusto(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            veiculo.calcularCusto(-1);
        });
    }

    @Test
    public void testDiasAtrasoNegativo() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);
        assertThrows(IllegalArgumentException.class, () -> {
            veiculo.calcularMulta(-1);
        });
    }
}