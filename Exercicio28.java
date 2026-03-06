/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ang1, ang2, ang3;

		System.out.print("Digite o primeiro ângulo: ");
		ang1 = input.nextInt();

		System.out.print("Digite o segundo ângulo: ");
		ang2 = input.nextInt();

		System.out.print("Digite o terceiro ângulo: ");
		ang3 = input.nextInt();

		if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("Triângulo Retângulo");
		}
		else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
			System.out.println("Triângulo Obtusângulo");
		}
		else {
			System.out.println("Triângulo Acutângulo");
		}

		input.close();
	}
}