package Lab3;

import com.SOF304.yennth.Lab.Lab3.B4.B4_ArrayUtils;
import com.SOF304.yennth.Lab.Lab3.B5.entity.IndexOutOfRangeException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class B4_ArrayUtilsTest {

    @Test(expected = IndexOutOfRangeException.class)
    public void testGetElementAtIndexThrowsExceptionWhenIndexOutOfRange() {
        int[] array = {1, 2, 3, 4, 5};
        B4_ArrayUtils.getElementAtIndex(array, 5);
    }

    @Test
    public void testGetElementAtIndexReturnsCorrectValue() {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        int expectedValue = 3;
        assertEquals(expectedValue, B4_ArrayUtils.getElementAtIndex(array, index));
    }
}

