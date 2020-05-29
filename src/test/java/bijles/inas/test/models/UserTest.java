package bijles.inas.test.models;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void userSetUsernameSuccessTest() {
        // Arrange
        User user = new User();
        String username = "kevinbeye";

        // Act
        user.setUsername(username);

        // Assert
        Assert.assertEquals(username, user.getUsername());
    }
}
