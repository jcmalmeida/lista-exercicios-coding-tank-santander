import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int soma = 0;
            for (int anterior = numero; anterior > 0; anterior--) {
                soma += anterior;
            }
            System.out.printf("A soma de %d com seus antecessores é: %d.", numero, soma);
        }
    }
}
