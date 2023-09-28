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
public class DealerTest {
    
    public DealerTest() {
    }
   @Test
    public void testDealerConstructor() {
        Dealer dealer = new Dealer("John Doe", 12345, "Mathematics");

        assertEquals("John Doe", dealer.getName());
        assertEquals(12345, dealer.getUserId());
        assertEquals("Mathematics", dealer.getCourse());
    }
    
    @Test
    public void testGetCourse() {
        Dealer dealer = new Dealer("Alice Smith", 67890, "History");

        assertEquals("History", dealer.getCourse());
    }
}






