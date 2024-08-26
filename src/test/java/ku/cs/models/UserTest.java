package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testIsUsername() {
        User user = new User("user01", "plain-p@ssw0rd");
        assertTrue(user.isUsername("user01"));
        assertFalse(user.isUsername("user001"));
    }

    @Test
    public void testSetPassword() {
        User user = new User("user01", "plain-p@ssw0rd");
        user.setPassword("1234");
        assertNotEquals("1234", user.getPassword());
        assertTrue(BCrypt.verifyer().verify("1234".toCharArray(), user.getPassword()).verified);
    }

    @Test
    public void testValidatePassword() {
        User user = new User("user01", "123");
        assertTrue(user.validatePassword("123"));
        assertFalse(user.validatePassword("12345"));
    }

}