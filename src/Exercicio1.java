import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe sua altura em metros:");
        float altura = scanner.nextFloat();
        System.out.println("Por favor, informe seu peso em kg:");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);
        String classificacao;
        if (imc < 17) {
            classificacao = "Muito abaixo do peso";
        } else if (imc >= 17 && imc < 18.50) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.50 && imc < 25) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            classificacao = "Acima do peso";
        } else if (imc >= 30 && imc < 35) {
            classificacao = "Obesidade I";
        } else if (imc >= 35 && imc < 40) {
            classificacao = "Obesidade II - severa";
        } else {
            classificacao = "Obesidade III - mórbida";
        }
        System.out.printf("O valor do seu IMC é %.0f (considerado %s).", imc, classificacao);
    }
}
