/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.Truck;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author okoob
 */
public class TruckTest {
    Truck truck;
    
    public TruckTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testTruck() {
    truck.setVin(1111);
    truck.setMake("Volvo");
    truck.setColor("black");
    
    assertEquals(1111, truck.getVin());
    assertEquals("Volvo", truck.getMake());
    assertEquals("black", truck.getColor());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        truck = new Truck();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
