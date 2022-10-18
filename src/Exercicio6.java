import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer? (opções: + - / * )");
        String stringOperacao = scanner.nextLine();
        System.out.println("Informe o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        int numero2 = scanner.nextInt();

        char operacao = stringOperacao.charAt(0);
        Boolean operacaoValida = (operacao == '+') || (operacao == '-') || (operacao == '*') || (operacao == '/');
        int resultado = 0;
        if (operacaoValida) {
            switch (operacao) {
                case '+' -> resultado = numero1 + numero2;
                case '-' -> resultado = numero1 - numero2;
                case '*' -> resultado = numero1 * numero2;
                case '/' -> resultado = numero1 / numero2;
            }
            System.out.printf("O resultado da operação %d %c %d é %d.", numero1, operacao, numero2, resultado);
        } else {
            System.out.println("Operação desconhecida.");
        }
    }
}
