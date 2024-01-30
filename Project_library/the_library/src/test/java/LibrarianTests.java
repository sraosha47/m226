import static org.mockito.Mockito.*;

import model.Librarian;
import model.Media;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class LibrarianTests {

    @Test
    public void testAddMedia() {
        // Create a mock for the Librarian class
        Librarian mockLibrarian = mock(Librarian.class);

        // Create a mock for the ArrayList and the Media class
        ArrayList<Media> mockLibrary = mock(ArrayList.class);
        Media mockMedia = mock(Media.class);

        // Call the addMedia method on the Librarian object
        mockLibrarian.addMedia(mockLibrary, mockMedia);

        // Verify that the add method was called on the mockLibrary with the mockMedia
        verify(mockLibrary, times(1)).add(mockMedia);

        // Verify that the info method was called on the mockMedia
        verify(mockMedia, times(1)).info();
    }

    @Test
    public void testChangeMediaInfo() {
        // Create a mock for the Librarian class
        Librarian mockLibrarian = mock(Librarian.class);

        // Create a mock for the ArrayList and the Media class
        ArrayList<Media> mockLibrary = mock(ArrayList.class);
        Media mockMedia = mock(Media.class);

        // Configure the behavior of the contains, setDescription, and setAvailability methods of the mockLibrary and mockMedia
        when(mockLibrary.contains(mockMedia)).thenReturn(true);
        doNothing().when(mockMedia).setDescription(anyString());
        doNothing().when(mockMedia).setAvailability(anyBoolean());

        // Call the changeMediaInfo method on the Librarian object
        mockLibrarian.changeMediaInfo(mockLibrary, mockMedia, "New Description", true);

        // Verify that the contains method was called on the mockLibrary with the mockMedia
        verify(mockLibrary, times(1)).contains(mockMedia);

        // Verify that the setDescription method was called on the mockMedia with the specified argument
        verify(mockMedia, times(1)).setDescription("New Description");

        // Verify that the setAvailability method was called on the mockMedia with the specified argument
        verify(mockMedia, times(1)).setAvailability(true);

        // Verify that the info method was called on the mockMedia
        verify(mockMedia, times(1)).info();
    }
}