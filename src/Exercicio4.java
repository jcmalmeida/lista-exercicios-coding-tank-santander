public class Exercicio4 {
    public static void main(String[] args) {
        int numero = 0;

        if (args.length == 1) {
            numero = Integer.valueOf(args[0]);
        } else {
            System.out.println("Número inválido de argumentos, é esperado que seja informado um argumento.");
            return;
        }

        Boolean ePar = (numero % 2) == 0;
        if (ePar) {
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.printf("O número %d é ímpar.", numero);
        }
    }
}
