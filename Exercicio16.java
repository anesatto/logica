/* Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
 * Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. 
 * O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos. */

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

        double salarioCarlos, salarioJoao;
        int meses = 0;

        System.out.print("Digite o salário de Carlos: R$ ");
        salarioCarlos = input.nextDouble();

        salarioJoao = salarioCarlos / 3;

        while (salarioJoao < salarioCarlos) {
            salarioCarlos = salarioCarlos + (salarioCarlos * 0.02);
            salarioJoao = salarioJoao + (salarioJoao * 0.05);
            meses++;
        }
		
        System.out.printf("Salário final de Carlos: R$ %.2f\n", salarioCarlos);
        System.out.printf("Salário final de João:   R$ %.2f\n", salarioJoao);
        System.out.println("Quantidade de meses necessários: " + meses);
		
		input.close();
	}
}