// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
// A fórmula de conversão é:  F= (9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 

import java.util.Scanner; 

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        double c, f;

        System.out.print("Digite a temperatura em Celsius: ");
        c = input.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.println("--- Conversão de Temperatura ---");
        System.out.printf("Temperatura em Celsius: %.1f°C\n", c);
        System.out.printf("Temperatura em Fahrenheit: %.1f°F\n", f);
		 
		 input.close();
	}
}
