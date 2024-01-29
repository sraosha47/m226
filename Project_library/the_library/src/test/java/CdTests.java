import static org.mockito.Mockito.*;

import model.Cd;
import model.Library;
import org.junit.jupiter.api.Test;

public class CdTests {

    @Test
    public void testCdInfo() {
        // Create a mock for the Cd class
        Cd mockCd = mock(Cd.class);

        // Configure the behavior of getTitle, getArtist, getDescription, and getAvailable methods
        when(mockCd.getTitle()).thenReturn("Album Title");
        when(mockCd.getArtist()).thenReturn("Artist Name");
        when(mockCd.getDescription()).thenReturn("Sample CD description");
        when(mockCd.getAvailable()).thenReturn(true);

        // Call the info method on the Cd object
        mockCd.info();

        // Verify that the expected methods were called on the Cd mock
        verify(mockCd, times(1)).getTitle();
        verify(mockCd, times(1)).getArtist();
        verify(mockCd, times(1)).getDescription();
        verify(mockCd, times(1)).getAvailable();
    }

    // Add more test methods as needed for other functionalities in the Cd class
}