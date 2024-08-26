package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Abby", "123");
        userList.addUser("Bobby", "456");
        userList.addUser("Cathy", "789");

        // TODO: find one of them
        User user = userList.findUserByUsername("Abby");

        // TODO: assert that UserList found User
        String expected = "Abby";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Abby", "123");
        userList.addUser("Bobby", "456");
        userList.addUser("Cathy", "789");

        // TODO: change password of one user
        boolean actual = userList.changePassword("Abby", "123", "1234");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Abby", "123");
        userList.addUser("Bobby", "456");
        userList.addUser("Cathy", "789");

        // TODO: call login() with correct username and password
        User user = userList.login("Abby", "123");

        // TODO: assert that User object is found
        assertNotNull(user);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Abby", "123");
        userList.addUser("Bobby", "456");
        userList.addUser("Cathy", "789");

        // TODO: call login() with incorrect username or incorrect password
        User user = userList.login("Abby", "1234");

        // TODO: assert that the method return null
        assertNull(user);
    }


}