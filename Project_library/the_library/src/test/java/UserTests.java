import static org.mockito.Mockito.*;

import model.User;
import org.junit.jupiter.api.Test;

public class UserTests {

    @Test
    public void testGetFullname() {
        // Create a mock for the User class
        User mockUser = mock(User.class);

        // Configure the behavior of getFirstname and getSurname methods
        when(mockUser.getFirstname()).thenReturn("John");
        when(mockUser.getSurname()).thenReturn("Doe");

        // Call the getFullname method on the User object
        String fullname = mockUser.getFullname();

        // Verify that the expected methods were called on the User mock
        verify(mockUser, times(1)).getFirstname();
        verify(mockUser, times(1)).getSurname();

        // Assert that the getFullname method returns the expected value
        assert(fullname.equals("John Doe"));
    }

    // Add more test methods as needed for other functionalities in the User class
}
