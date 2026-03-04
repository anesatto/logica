// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        double cotacaoDolar, qtdDolares, valorReal;

        System.out.print("Digite a cotação atual do dólar (R$): ");
        cotacaoDolar = input.nextDouble();

        System.out.print("Digite a quantidade de dólares (US$) que você possui: ");
        qtdDolares = input.nextDouble();

        valorReal = qtdDolares * cotacaoDolar;

		
        System.out.printf("Valor em Dólares: US$ %.2f\n", qtdDolares);
        System.out.printf("Cotação utilizada: R$ %.2f\n", cotacaoDolar);
        System.out.printf("Valor convertido para Reais: R$ %.2f\n", valorReal);

		 input.close();
	}
}
