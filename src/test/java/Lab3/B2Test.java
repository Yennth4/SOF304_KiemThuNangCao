package Lab3;

import com.SOF304.yennth.Lab.Lab3.B2.B2;
import org.junit.Assert;
import org.junit.Test;

public class B2Test {

    @Test
    public void test2() {
        B2 bai2 = new B2();
        int kq = bai2.phepChia2SoNguyen(10,5);
        Assert.assertEquals(2,kq);
    }


}
