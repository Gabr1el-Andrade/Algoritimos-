import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class AlgoritimoTopDown {
    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static void main(String[] args) {
        int numero = 100;
        BigInteger resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static BigInteger fatorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        BigInteger result = BigInteger.valueOf(n).multiply(fatorial(n - 1));
        memo.put(n, result);

        return result;
    }
}
