/* Escreva um programa para ler a altura, peso e gênero para calcular o IMC.
*/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
		double altura, pesoIdeal = 0;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		genero = input.nextInt();
		
		System.out.print("Digite a altura: ");
		altura = input.nextDouble();
		
        System.out.print("Digite o seu peso atual (kg): ");
        double pesoAtual = input.nextDouble();

        if (genero == 2) { 
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Gênero: Masculino");
        } else if (genero == 1) { 
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Gênero: Feminino");
        } else {
            System.out.println("Gênero inválido.");
        }

        double imc = pesoAtual / (altura * altura);

        System.out.printf("Seu peso ideal seria: %.2f kg\n", pesoIdeal);
        System.out.printf("Seu IMC atual é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
		
		input.close();
	}
}