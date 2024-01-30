import static org.mockito.Mockito.*;

import model.Book;
import model.Cd;
import model.Customer;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test
    public void testRentMediaAndReturnMedia() {
        // Create a mock for the Book and Cd classes
        Book mockBook = mock(Book.class);
        Cd mockCd = mock(Cd.class);

        // Configure the behavior of the getAvailable method for both mock objects
        when(mockBook.getAvailable()).thenReturn(true);
        when(mockCd.getAvailable()).thenReturn(true);

        // Create a Customer instance
        Customer customer = new Customer("Ted", "Lasso", "0797776669", "ted.lasso@home.com");

        // Call the rentMedia method on the Customer object
        customer.rentMedia(mockBook);
        customer.rentMedia(mockCd);

        // Verify that the expected methods were called on the mockBook and mockCd
        verify(mockBook, times(1)).getAvailable();
        verify(mockCd, times(1)).getAvailable();
        verify(mockBook, times(1)).switchAvailability();
        verify(mockCd, times(1)).switchAvailability();
        verify(mockBook, times(1)).setOwner(customer.getFullname());
        verify(mockCd, times(1)).setOwner(customer.getFullname());
        verify(mockBook, times(1)).setTimestamp();
        verify(mockCd, times(1)).setTimestamp();

        // Call the listRented method on the Customer object
        customer.listRented();

        // Call the returnMedia method on the Customer object
        customer.returnMedia(mockBook);

        // Verify that the expected methods were called on the mockBook
        verify(mockBook, times(1)).getOwner();
        verify(mockBook, times(1)).switchAvailability();
        verify(mockBook, times(1)).setOwner("");

        // Call the listRented method on the Customer object after returning the media
        customer.listRented();
    }
}