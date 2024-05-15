import static org.junit.Assert.*;
import org.junit.Test;

public class TestFibonacci {
    @Test
    public void testFibonacciBaseCases() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.fibonacci(0));
        assertEquals(1, fib.fibonacci(1));
    }

    @Test
    public void testFibonacciPositiveCases() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.fibonacci(2));
        assertEquals(1, fib.fibonacci(3));
        assertEquals(2, fib.fibonacci(4));
        assertEquals(3, fib.fibonacci(5));
        assertEquals(5, fib.fibonacci(6));
        assertEquals(8, fib.fibonacci(7));
        assertEquals(13, fib.fibonacci(8));
        assertEquals(21, fib.fibonacci(9));
        assertEquals(34, fib.fibonacci(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibonacciNegativeNumber() {
        Fibonacci fib = new Fibonacci();
        fib.fibonacci(-1); // Deve lançar uma exceção
    }
}
