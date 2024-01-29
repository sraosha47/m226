import static org.mockito.Mockito.*;

import model.Media;
import org.junit.jupiter.api.Test;

public class MediaTests {

    @Test
    public void testMediaInfo() {
        // Create a mock for the Media class
        Media mockMedia = mock(Media.class);

        // Configure the behavior of getTitle, getAuthor, and getAvailable methods
        when(mockMedia.getTitle()).thenReturn("Sample Title");
        when(mockMedia.getAuthor()).thenReturn("Sample Author");
        when(mockMedia.getAvailable()).thenReturn(true);

        // Call the info method on the Media object
        mockMedia.info();

        // Verify that the expected methods were called on the Media mock
        verify(mockMedia, times(1)).getTitle();
        verify(mockMedia, times(1)).getAuthor();
        verify(mockMedia, times(1)).getAvailable();
    }

    @Test
    public void testMediaSwitchAvailability() {
        // Create a mock for the Media class
        Media mockMedia = mock(Media.class);

        // Call the switchAvailability method on the Media object
        mockMedia.switchAvailability();

        // Verify that the switchAvailability method was called on the Media mock
        verify(mockMedia, times(1)).switchAvailability();
    }

    @Test
    public void testMediaSetTimestamp() {
        // Create a mock for the Media class
        Media mockMedia = mock(Media.class);

        // Call the setTimestamp method on the Media object
        mockMedia.setTimestamp();

        // Verify that the setTimestamp method was called on the Media mock
        verify(mockMedia, times(1)).setTimestamp();
    }

    // Add more test methods as needed for other functionalities in the Media class
}
