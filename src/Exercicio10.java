import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();
        System.out.println("Por favor, informe a taxa de juros do empréstimo:");
        double juros = scanner.nextDouble();
        System.out.println("Por favor, informe o tempo para pagamento:");
        int prazo = scanner.nextInt();

        double jurosSobreCem = juros / 100.0;
        double termoExponencial = Math.pow((1.0 + jurosSobreCem), prazo);
        double parcela = valorEmprestimo * (termoExponencial * jurosSobreCem) / (termoExponencial - 1);
        System.out.printf("Valor fixo da parcela: R$ %.2f, Saldo devedor total: R$ %.2f\n", parcela, valorEmprestimo);
        double saldoDevedor = valorEmprestimo;
        double jurosPago, amortizacao, jurosTotal = 0.0, amortizacaoTotal = 0;
        for (int tempo = 1; tempo <= prazo; tempo++) {
            jurosPago = jurosSobreCem * saldoDevedor;
            jurosTotal += jurosPago;
            amortizacao = parcela - jurosPago;
            amortizacaoTotal += amortizacao;
            saldoDevedor = saldoDevedor - amortizacao;
            System.out.printf("Prestação %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f\n", tempo, jurosPago, amortizacao, saldoDevedor);
        }
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", (valorEmprestimo + jurosTotal), jurosTotal, amortizacaoTotal);
    }
}
