/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (não é necessário considerar o mês em que ela nasceu). */

import java.util.Scanner;

 public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

        int anoNascimento, anoAtual, idade;
        anoAtual = 2026; 

        System.out.print("Digite o ano do seu nascimento: ");
        anoNascimento = input.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Status: PODE VOTAR este ano.");
        } else {
            System.out.println("Você tem " + idade + " anos.");
            System.out.println("Status: NÃO PODE VOTAR ainda.");
        }
		
		input.close();
	}
}