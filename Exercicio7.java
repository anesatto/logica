// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
        double valorDepositado, rendimento, valorFinal;
        final double JUROS = 0.007;

        System.out.print("Digite o valor do depósito (R$): ");
        valorDepositado = input.nextDouble();

        rendimento = valorDepositado * JUROS;

        valorFinal = valorDepositado + rendimento;

        System.out.printf("Valor original: R$ %.2f\n", valorDepositado);
        System.out.printf("Rendimento do mês: R$ %.2f\n", rendimento);
        System.out.printf("Saldo total atualizado: R$ %.2f\n", valorFinal);		 

		input.close();
	}
}