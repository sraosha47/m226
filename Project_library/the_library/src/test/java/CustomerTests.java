import static org.mockito.Mockito.*;

import model.Customer;
import model.Media;
import org.junit.jupiter.api.Test;

public class CustomerTests {

    @Test
    public void testRentMedia() {
        // Erstelle einen Mock für das Media-Objekt
        Media mockMedia = mock(Media.class);

        // Setze das Media-Objekt als verfügbar
        when(mockMedia.getAvailable()).thenReturn(true);

        // Erstelle einen Customer
        Customer customer = new Customer("Max", "Mustermann", "123456789", "max@example.com");

        // Rufe die rentMedia-Methode auf
        customer.rentMedia(mockMedia);

        // Überprüfe, ob switchAvailability und setOwner aufgerufen wurden
        verify(mockMedia, times(1)).switchAvailability();
        verify(mockMedia, times(1)).setOwner(customer.getFullname());
    }

    @Test
    public void testReturnMedia() {
        // Erstelle einen Mock für das Media-Objekt
        Media mockMedia = mock(Media.class);

        // Setze das Media-Objekt als verfügbar
        when(mockMedia.getAvailable()).thenReturn(false);

        // Setze den Besitzer des Media-Objekts
        when(mockMedia.getOwner()).thenReturn("Max Mustermann");

        // Erstelle einen Customer
        Customer customer = new Customer("Max", "Mustermann", "123456789", "max@example.com");

        // Rufe die returnMedia-Methode auf
        customer.returnMedia(mockMedia);

        // Überprüfe, ob switchAvailability und setOwner aufgerufen wurden
        verify(mockMedia, times(1)).switchAvailability();
        verify(mockMedia, times(1)).setOwner("");
    }
}