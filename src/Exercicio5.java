import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double numero1 = 0.0, numero2 = 0.0;
        Scanner scanner = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Por favor, digite 2 números:");
            numero1 = scanner.nextDouble();
            numero2 = scanner.nextDouble();
        } else if (args.length == 1) {
            numero1 = Double.valueOf(args[0]);
            System.out.println("Por favor, digite o 2º número:");
            numero2 = scanner.nextDouble();
        } else if (args.length == 2) {
            numero1 = Double.valueOf(args[0]);
            numero2 = Double.valueOf(args[1]);
        } else {
            System.out.println("A quantidade de números inseridos é inválida.");
            return;
        }

        double soma = numero1 + numero2;
        System.out.printf("A soma dos números %f e %f é %f.", numero1, numero2, soma);
    }
}
