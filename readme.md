# Locadora de Veículos - Projeto Java

Este projeto implementa um sistema básico de locadora de veículos com cálculo de custos, descontos e multas.

## Funcionalidades

- Cálculo do custo de aluguel baseado na quantidade de dias
- Aplicação de desconto de 10% para aluguéis de 7 dias ou mais
- Cálculo de multa para devolução atrasada (150% do valor da diária por dia de atraso)
- Validação de entradas inválidas (valores negativos)

## Como executar

1. Clone o repositório
2. Compile e execute a classe `Main` para ver exemplos de uso
3. Execute os testes unitários com JUnit

## Requisitos

- Java JDK 11 ou superior
- JUnit 5 para testes

## Estrutura do Projeto

- `src/main/java/com/locadora/`: Código fonte principal
    - `Veiculo.java`: Classe principal que representa um veículo
    - `Main.java`: Classe de demonstração
- `src/test/java/com/locadora/`: Testes unitários
    - `VeiculoTest.java`: Testes para a classe Veiculo

## Autor

Rafael Duarte de Freitas

## Licença

Este projeto está licenciado sob a licença MIT.