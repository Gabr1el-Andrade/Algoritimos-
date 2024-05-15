public class AlgoritimoRecursivo {
    public static void main(String[] args) {
        int numero = 3;
        long resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static long fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1); // Chamada recursiva
        }
    }
}

