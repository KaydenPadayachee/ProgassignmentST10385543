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
// tests all methods in customer class
public class CustomerTest {
    
    public CustomerTest() {
    }
      @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("John Doe", 12345);

        assertEquals("John Doe", customer.getName());
        assertEquals(12345, customer.getUserId());
    }

    @Test
    public void testGetName() {
        Customer customer = new Customer("Alice Smith", 67890);

        assertEquals("Alice Smith", customer.getName());
    }

    @Test
    public void testGetUserId() {
        Customer customer = new Customer("Bob Johnson", 54321);

        assertEquals(54321, customer.getUserId());
    }
}
