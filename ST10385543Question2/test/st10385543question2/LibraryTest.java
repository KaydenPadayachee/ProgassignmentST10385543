/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10385543question2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author kpada
 */
public class LibraryTest {
    
   
    @Test
    public void testSearchBook() {
        Library library = new Library(10);
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");

        library.addBook(book1);
        library.addBook(book2);

        // Test searching for an existing book
        Book foundBook = library.searchBook("Book 1");
        assertNotNull(foundBook);
        assertEquals("Book 1", foundBook.getTitle());

        // Test searching for a non-existing book
        Book notFoundBook = library.searchBook("Book 3");
        assertNull(notFoundBook);
    }

    
}
    
    
   