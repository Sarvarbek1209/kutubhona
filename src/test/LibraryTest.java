package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Test Title", "Test Author", 2020, "1234567890");
        library.addBook(book);
        assertEquals(1, library.searchByTitle("Test Title").size());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Test Title", "Test Author", 2020, "1234567890");
        library.addBook(book);
        library.removeBook("1234567890");
        assertEquals(0, library.searchByTitle("Test Title").size());
    }

    @Test
    public void testSearchByTitle() {
        Library library = new Library();
        Book book = new Book("Test Title", "Test Author", 2020, "1234567890");
        library.addBook(book);
        assertEquals(1, library.searchByTitle("Test Title").size());
    }

    @Test
    public void testSearchByAuthor() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author", 2020, "1234567890");
        Book book2 = new Book("Title2", "Author", 2021, "0987654321");
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.searchByAuthor("Author").size());
    }

    @Test
    public void testSearchByYear() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1", 2020, "1234567890");
        Book book2 = new Book("Title2", "Author2", 2020, "0987654321");
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.searchByYear(2020).size());
    }
}
