//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

import  java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double ConsumoMedio;
		double kmi; // distância inicial
		double kmf; //distância final
		double litros;
		double kmtotal;

        System.out.print("Digite a quilometragem inicial: ");
        kmi = input.nextDouble();

        System.out.print("Digite a quilometragem final: ");
        kmf = input.nextDouble();

        System.out.print("Digite o total de litros gastos: ");
        litros = input.nextDouble();

        kmtotal = kmf - kmi;
        
        if (litros > 0) {
            ConsumoMedio = kmtotal / litros;
            
            System.out.println("--- Relatório de Consumo ---");
            System.out.printf("Distância percorrida: %.2f km\n", kmtotal);
            System.out.printf("Consumo médio: %.2f km/l\n", ConsumoMedio);
        } else {
            System.out.println("Erro: A quantidade de litros deve ser maior que zero.");
        }

		input.close();
	}
}
