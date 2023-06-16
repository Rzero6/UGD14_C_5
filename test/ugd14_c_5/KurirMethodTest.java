/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ugd14_c_5;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VICTUS
 */
public class KurirMethodTest {
    
    public KurirMethodTest() {
    }

    Kurir kurir;    
    protected void setUp(){
       kurir = new Kurir("Lala", "KU1234", 10000); 
    }
    @Test
    public void testHitungTotalGaji() {
        setUp();
        double result = kurir.hitungTotalGaji(-1);
        double expResult = 10000+1+1000-5300;
        assertFalse(result!=expResult);
    }
    @Test
    public void testHitungTotalGaji2() {
        setUp();
        double result = kurir.hitungTotalGaji(1000);
        double expResult = 10000+1+1000-5300;
        assertFalse(result!=expResult);
    }

    /**
     * Test of hitungBonus method, of class Kurir.
     */
    @Test
    public void testHitungBonus() {
        setUp();
        double result = kurir.hitungBonus(1, -10);
        double expResult = 1000;
        assertFalse(result!=expResult);
    }
    @Test
    public void testHitungBonus2() {
        setUp();
        double result = kurir.hitungBonus(-1, 1);
        double expResult = 1000;
        assertFalse(result!=expResult);
    }
    @Test
    public void testHitungBonus3() {
        setUp();
        double result = kurir.hitungBonus(1, 10.0);
        double expResult = 1.0;
        assertEquals(expResult,result);
    }

    /**
     * Test of hitungPajak method, of class Kurir.
     */
    @Test
    public void testHitungPajak1(){
        setUp();
        double result = kurir.hitungPajak(-1);
        double expResult = 1000;
        assertTrue(expResult == result);
    }
    
    @Test
    public void testHitungPajak2(){
        setUp();
        double result = kurir.hitungPajak(10);
        double expResult = 1000;
        assertTrue(expResult == result);
    }
    @Test
    public void testTampil(){
        setUp();
        String result = kurir.tampil();
        String expResult = "Kurir dengan Lala id kurir KU1234 memiliki Gaji 10000.0";
        assertEquals(expResult,result);
    }
}
