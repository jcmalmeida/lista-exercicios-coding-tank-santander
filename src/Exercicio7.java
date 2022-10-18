import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial investido em R$:");
        BigDecimal valorInicial = scanner.nextBigDecimal();
        System.out.println("Informe o juro ao mês em %:");
        BigDecimal juros = scanner.nextBigDecimal();
        System.out.println("Informe o tempo em meses que o dinheiro ficará investido:");
        int prazo = scanner.nextInt();
        System.out.printf("\n");

        System.out.printf("%.2f reais, %.0f%% de juros ao mês por %d meses.\n\n", valorInicial, juros, prazo);

        BigDecimal saldo = valorInicial;
        BigDecimal rendimentoMensal;
        for (int mes = 1; mes <= prazo; mes++) {
            rendimentoMensal = saldo.multiply(juros.multiply(BigDecimal.valueOf(1.0 / 100.0)));
            saldo = saldo.add(rendimentoMensal);
            System.out.printf("Mês %d: Juros: R$ %.2f, Saldo: R$ %.2f\n", mes, rendimentoMensal, saldo);
            //System.out.println("Mês " + mes + ": Juros: R$ " + rendimentoMensal + " , saldo: R$ " + saldo);
        }
    }
}
