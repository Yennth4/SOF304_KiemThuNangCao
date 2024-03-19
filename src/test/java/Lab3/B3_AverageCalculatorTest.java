package Lab3;

import com.SOF304.yennth.Lab.Lab3.B3.B3_AverageCalculator;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class B3_AverageCalculatorTest {

    @Test(expected = ArithmeticException.class)
    public void testCalculateAverageThrowsExceptionWhenListIsEmpty() {
        B3_AverageCalculator calculator = new B3_AverageCalculator();
        List<Integer> emptyList = new ArrayList<>();
        calculator.calculateAverage(emptyList); // This should throw ArithmeticException
    }

    @Test
    public void testCalculateAverageReturnsCorrectValue() {
        B3_AverageCalculator calculator = new B3_AverageCalculator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double expectedAverage = 3.0;
        assertEquals(expectedAverage, calculator.calculateAverage(numbers), 0.001);
    }
}
