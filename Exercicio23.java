/*
 Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
 * Calcular e imprimir o seguinte:
 * Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área.
 * Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 * Se o número de lados for igual a 5 escrever PENTÁGONO. 
*/

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.util.in);
        
        System.out.print("Digite o número de lados do polígono: ");
        int numLados = input.nextInt();
        
        System.out.print("Digite a medida do lado (em cm): ");
        double medidaLado = input.nextDouble();
        
        if (numLados == 3) {
            double areaTriangulo = (Math.pow(medidaLado, 2) * Math.sqrt(3)) / 4;
            System.out.printf("TRIÂNGULO - Área: %.2f cm²\n", areaTriangulo);
            
        } else if (numLados == 4) {
            double areaQuadrado = medidaLado * medidaLado;
            System.out.printf("QUADRADO - Área: %.2f cm²\n", areaQuadrado);
            
        } else if (numLados == 5) {
            System.out.println("PENTÁGONO");
            
        } else {
            System.out.println("Polígono não suportado por este programa.");
        }
        
        input.close();
    }
}