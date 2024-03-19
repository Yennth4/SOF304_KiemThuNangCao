package Lab3;

import com.SOF304.yennth.Lab.Lab3.B5.entity.B5_UserProfile;
import com.SOF304.yennth.Lab.Lab3.B5.service.B5_UserProfileManager;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class B5_UserProfileManagerTest {

    @Test(expected = NullPointerException.class)
    public void testGetNameThrowsExceptionWhenProfileIsNull() {
        B5_UserProfileManager manager = new B5_UserProfileManager(null);
        manager.getUserName(); // This should throw NullPointerException
    }

    @Test
    public void testGetNameReturnsCorrectName() {
        B5_UserProfile userProfile = new B5_UserProfile("John");
        B5_UserProfileManager manager = new B5_UserProfileManager(userProfile);
        assertEquals("John", manager.getUserName());
    }
}