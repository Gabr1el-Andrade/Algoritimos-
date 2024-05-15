import java.math.BigInteger;

public class AlgoritimoBottomUp {
    public static void main(String[] args) {
        int numero = 50;
        BigInteger resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static BigInteger fatorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
