import static org.mockito.Mockito.*;

import model.Book;
import org.junit.jupiter.api.Test;

public class BookTests {

    @Test
    public void testBookInfo() {
        // Create a mock for the Book class
        Book mockBook = mock(Book.class);

        // Configure the behavior of getTitle, getAuthor, and getAvailable methods
        when(mockBook.getTitle()).thenReturn("Sample Title");
        when(mockBook.getAuthor()).thenReturn("Sample Author");
        when(mockBook.getIsbn()).thenReturn("Sample ISBN");
        when(mockBook.getDescription()).thenReturn("Sample Description");
        when(mockBook.getAvailable()).thenReturn(true);

        // Call the info method on the Book object
        mockBook.info();

        // Verify that the expected methods were called on the Book mock
        verify(mockBook, times(1)).getTitle();
        verify(mockBook, times(1)).getAuthor();
        verify(mockBook, times(1)).getIsbn();
        verify(mockBook, times(1)).getDescription();
        verify(mockBook, times(1)).getAvailable();
    }

    @Test
    public void testBookSwitchAvailability() {
        // Create a mock for the Book class
        Book mockBook = mock(Book.class);

        // Call the switchAvailability method on the Book object
        mockBook.switchAvailability();

        // Verify that the switchAvailability method was called on the Book mock
        verify(mockBook, times(1)).switchAvailability();
    }

    @Test
    public void testBookSetTimestamp() {
        // Create a mock for the Book class
        Book mockBook = mock(Book.class);

        // Call the setTimestamp method on the Book object
        mockBook.setTimestamp();

        // Verify that the setTimestamp method was called on the Book mock
        verify(mockBook, times(1)).setTimestamp();
    }

    // Add more test methods as needed for other functionalities in the Book class
    @Test
    public void testBookCreation() {
        // Create a mock for the Book class
        Book mockBook = mock(Book.class);

        // Configure the behavior of getTitle, getAuthor, and getIsbn methods
        when(mockBook.getTitle()).thenReturn("Sample Title");
        when(mockBook.getAuthor()).thenReturn("Sample Author");
        when(mockBook.getIsbn()).thenReturn("1234567890");

        // Call the info method on the Book object
        String title = mockBook.getTitle();
        String author = mockBook.getAuthor();
        String isbn = mockBook.getIsbn();

        // Verify that the expected methods were called on the Book mock
        verify(mockBook, times(1)).getTitle();
        verify(mockBook, times(1)).getAuthor();
        verify(mockBook, times(1)).getIsbn();

        // Assert that the returned values match the expected values
        assert(title.equals("Sample Title"));
        assert(author.equals("Sample Author"));
        assert(isbn.equals("1234567890"));
    }

    // Add more test methods as needed for other functionalities in the Book class
}

