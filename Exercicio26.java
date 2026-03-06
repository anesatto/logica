// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.


import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int n1 = input.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int n2 = input.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        int n3 = input.nextInt();
        
        int maior;

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        System.out.println("O maior valor digitado foi: " + maior);
        
        input.close();
    }
}