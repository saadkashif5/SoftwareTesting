import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginAppTest {


    @Test
    void bothValid() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("alicebrown@example.com","password101");
        assertEquals("Alice Brown", result);
    }

    @Test
    void validEmail() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("alicebrown@example.com","password");
        assertNull(result);
    }

    @Test
    void bothInvalid() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("contact@saadkashif.com","password");
        assertNull(result);
    }

    @Test
    void invalidEmail() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser("contact@saadkashif.com","password123");
        assertNull(result);
    }

    @Test
    void nullEntry() {
        LoginApp app = new LoginApp();
        String result = app.authenticateUser(null,null);
        assertNull(result);
    }
}