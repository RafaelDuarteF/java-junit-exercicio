package com.locadora;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero");
        }

        double custo = dias * valorDiaria;
        return custo - desconto(dias);
    }

    public double desconto(int dias) {
        if (dias >= 7) {
            return 0.1 * (dias * valorDiaria);
        }
        return 0;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("Dias de atraso não podem ser negativos");
        }
        return diasAtraso * (valorDiaria * 1.5); // Multa de 150% do valor da diária
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo");
        }
        this.valorDiaria = valorDiaria;
    }
}