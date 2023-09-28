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
public class BookTest {
     @Test
    public void testBookConstructor() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    @Test
    public void testGetTitle() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");

        assertEquals("To Kill a Mockingbird", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        Book book = new Book("1984", "George Orwell");

        assertEquals("George Orwell", book.getAuthor());
    }
}
   
        
    

    
    
    
   