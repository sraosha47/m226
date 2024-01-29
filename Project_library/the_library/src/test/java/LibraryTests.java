import static org.mockito.Mockito.*;

import model.Library;
import model.Media;
import org.junit.jupiter.api.Test;

public class LibraryTests {

    @Test
    public void testAddMedium() {
        // Create a mock for the Media class
        Media mockMedium = mock(Media.class);

        // Create an instance of the Library
        Library library = Library.getInstance();

        // Call the addMedium method on the Library object
        library.addMedium(mockMedium);

    }

    @Test
    public void testListMedia() {
        // Create a mock for the Media class
        Media mockMedium = mock(Media.class);

        // Configure the behavior of getAvailable method of the Media mock
        when(mockMedium.getAvailable()).thenReturn(true);

        // Create an instance of the Library
        Library library = Library.getInstance();

        // Add the mockMedium to the library
        library.addMedium(mockMedium);

        // Call the listMedia method on the Library object
        library.listMedia();

        // Verify that the expected methods were called on the Media mock
        verify(mockMedium, times(1)).info();
    }

    // Add more test methods as needed
}
