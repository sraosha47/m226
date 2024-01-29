import static org.mockito.Mockito.*;

import model.Customer;
import model.Media;
import org.junit.jupiter.api.Test;

public class CustomerTests {

    @Test
    public void testRentMedia() {
        // Create a mock for the Media class
        Media mockMedia = mock(Media.class);

        // Configure the behavior of getAvailable method of the Media mock
        when(mockMedia.getAvailable()).thenReturn(true);

        // Create a Customer instance
        Customer customer = new Customer("John", "Doe", "123456789", "john@example.com");

        // Call the rentMedia method on the Customer object
        customer.rentMedia(mockMedia);

        // Verify that the expected methods were called on the Media mock
        verify(mockMedia, times(1)).getAvailable();
        verify(mockMedia, times(1)).switchAvailability();
        verify(mockMedia, times(1)).setOwner(customer.getFullname());
        verify(mockMedia, times(1)).setTimestamp();

        // Verify that the media list was updated in the Customer object
        assert(customer.media.contains(mockMedia));
    }

    @Test
    public void testReturnMedia() {
        // Create a mock for the Media class
        Media mockMedia = mock(Media.class);

        // Configure the behavior of getOwner method of the Media mock
        when(mockMedia.getOwner()).thenReturn("John Doe");

        // Create a Customer instance
        Customer customer = new Customer("John", "Doe", "123456789", "john@example.com");

        // Add the mockMedia to the customer's media list
        customer.media.add(mockMedia);

        // Call the returnMedia method on the Customer object
        customer.returnMedia(mockMedia);

        // Verify that the expected methods were called on the Media mock
        verify(mockMedia, times(1)).getOwner();
        verify(mockMedia, times(1)).switchAvailability();
        verify(mockMedia, times(1)).setOwner("");

        // Verify that the media list was updated in the Customer object
        assert(!customer.media.contains(mockMedia));
    }

    // Add more test methods as needed for other functionalities in the Customer class
}