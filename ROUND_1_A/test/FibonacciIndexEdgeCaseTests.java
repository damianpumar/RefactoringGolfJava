import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciIndexEdgeCaseTests {
    private final FibonacciIndex fibonacciIndex = new FibonacciIndex();

    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {
        assertEquals(-1, fibonacciIndex.findIndexOf(7));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {
        assertEquals(-1, fibonacciIndex.findIndexOf(-1));
    }
}
