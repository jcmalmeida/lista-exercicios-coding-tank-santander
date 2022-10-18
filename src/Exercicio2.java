import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota da prova 1:");
        float nota1 = scanner.nextFloat();
        System.out.println("Informe a nota da prova 2:");
        float nota2 = scanner.nextFloat();
        System.out.println("Informe a nota da prova 3:");
        float nota3 = scanner.nextFloat();
        System.out.println("Informe a nota da prova 4:");
        float nota4 = scanner.nextFloat();

        Boolean nota1Valida = (nota1 >= 0) && (nota1 <= 10);
        Boolean nota2Valida = (nota2 >= 0) && (nota2 <= 10);
        Boolean nota3Valida = (nota3 >= 0) && (nota3 <= 10);
        Boolean nota4Valida = (nota4 >= 0) && (nota4 <= 10);
        Boolean notasValidas = nota1Valida && nota2Valida && nota3Valida && nota4Valida;

        if (notasValidas) {
            float media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.printf("A média do aluno foi %.1f.", media);
        } else {
            if (!nota1Valida) {
                System.out.println("A nota da prova 1 é inválida.");
            }
            if (!nota2Valida) {
                System.out.println("A nota da prova 2 é inválida.");
            }
            if (!nota3Valida) {
                System.out.println("A nota da prova 3 é inválida.");
            }
            if (!nota4Valida) {
                System.out.println("A nota da prova 4 é inválida.");
            }
        }
    }
}
