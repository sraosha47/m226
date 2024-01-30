import static org.mockito.Mockito.*;

import model.Media;
import org.junit.jupiter.api.Test;

public class MediaTests {

    @Test
    public void testMediaMethods() {
        // Create a mock for the Media class
        Media mockMedia = mock(Media.class);

        // Configure the behavior of the getAvailable method
        when(mockMedia.getAvailable()).thenReturn(true);

        // Call the methods on the mockMedia object
        mockMedia.info();
        mockMedia.setOwner("Mock Owner");
        mockMedia.switchAvailability();
        mockMedia.setTimestamp();
        mockMedia.setDescription("Mock Description");

        // Verify that the expected methods were called on the mockMedia
        verify(mockMedia, times(1)).info();
        verify(mockMedia, times(1)).setOwner("Mock Owner");
        verify(mockMedia, times(1)).switchAvailability();
        verify(mockMedia, times(1)).setTimestamp();
        verify(mockMedia, times(1)).setDescription("Mock Description");
    }
}