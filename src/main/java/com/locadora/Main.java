package com.locadora;

public class Main {
    public static void main(String[] args) {
        try {
            // Criando alguns veículos
            Veiculo carroEconomico = new Veiculo("Fiat Uno", 80.0);
            Veiculo carroIntermediario = new Veiculo("HB20", 120.0);
            Veiculo carroPremium = new Veiculo("BMW X1", 300.0);

            // Testando cálculos
            System.out.println("Aluguel de 3 dias:");
            System.out.printf("%s: R$%.2f%n", carroEconomico.getModelo(), carroEconomico.calcularCusto(3));
            System.out.printf("%s: R$%.2f%n", carroIntermediario.getModelo(), carroIntermediario.calcularCusto(3));
            System.out.printf("%s: R$%.2f%n", carroPremium.getModelo(), carroPremium.calcularCusto(3));

            System.out.println("\nAluguel de 7 dias (com desconto):");
            System.out.printf("%s: R$%.2f%n", carroEconomico.getModelo(), carroEconomico.calcularCusto(7));
            System.out.printf("%s: R$%.2f%n", carroIntermediario.getModelo(), carroIntermediario.calcularCusto(7));
            System.out.printf("%s: R$%.2f%n", carroPremium.getModelo(), carroPremium.calcularCusto(7));

            System.out.println("\nMulta por atraso de 2 dias:");
            System.out.printf("%s: R$%.2f%n", carroEconomico.getModelo(), carroEconomico.calcularMulta(2));
            System.out.printf("%s: R$%.2f%n", carroIntermediario.getModelo(), carroIntermediario.calcularMulta(2));
            System.out.printf("%s: R$%.2f%n", carroPremium.getModelo(), carroPremium.calcularMulta(2));

            // Testando casos inválidos (descomente para ver os erros)
            // Veiculo veiculoInvalido = new Veiculo("Inválido", -100.0);
            // carroEconomico.calcularCusto(0);
            // carroEconomico.calcularMulta(-1);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}