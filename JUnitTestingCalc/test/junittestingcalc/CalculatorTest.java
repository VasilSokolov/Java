/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittestingcalc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for the Calculator class.
 * 
 * @author 123
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("Testing add method.");
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
    
    /**
     * Test the subtract method of the Calculator class.
     */
    @Test
    public void testSubtract(){
        System.out.println("Testing subtract method. ");
        int x = 7;
        int y = 6;
        Calculator instance = new Calculator();
        int expResult = 42;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
    }
    
}
