import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de provas que você fez:");
        int numeroDeProvas = scanner.nextInt();

        int[] notas = new int[numeroDeProvas];

        for (int prova = 1; prova <= numeroDeProvas; prova++) {
            System.out.printf("Informe a nota da prova %d:\n", prova);
            notas[prova - 1] = scanner.nextInt();
        }

        int menorNota = notas[0];
        int maiorNota = notas[0];
        int somaDasNotas = notas[0];

        for (int i = 1; i < numeroDeProvas; i++) {
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            somaDasNotas += notas[i];
        }
        int media = somaDasNotas / numeroDeProvas;

        System.out.printf("A menor nota é: %d\n", menorNota);
        System.out.printf("A maior nota é: %d\n", maiorNota);
        System.out.printf("A média das notas é: %d\n", media);
    }
}
