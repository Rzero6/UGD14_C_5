/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ugd14_c_5;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;
@RunWith(Suite.class)
@Suite.SuiteClasses({})

public class KurirTest extends junit.framework.TestCase{
    
    public KurirTest() {
    }
    
    @Test
    public void test1() {
        System.out.println("Semua Nilai Atribut Benar");
        String nama = "nama";
        String id_kurir = "KU1234";
        double gaji_pokok = 1000;
        
        Kurir kurir = new Kurir(nama,id_kurir,gaji_pokok);
        assertNotNull(kurir);
        
    }
    
    @Test
    public void test2(){
        System.out.println("Nama tidak boleh kosong");
        String nama = "";
        String id_kurir = "KU1234";
        double gaji_pokok = 1000;
        
        Kurir kurir = new Kurir(nama,id_kurir,gaji_pokok);
        assertNotNull(kurir);
    }
    
    @Test
    public void test3(){
        System.out.println("ID Kurir harus diawali dengan KUXXXX");
        String nama = "nama";
        String id_kurir = "123456";
        double gaji_pokok = 1000;
        
        Kurir kurir = new Kurir(nama,id_kurir,gaji_pokok);
        assertNotNull(kurir);
    }
    
    @Test
    public void test4(){
        System.out.println("Gaji Pokok Tidak Boleh Kurang dari 0");
        String nama = "nama";
        String id_kurir = "KU1234";
        double gaji_pokok = -1;
        
        Kurir kurir = new Kurir(nama,id_kurir,gaji_pokok);
        assertNotNull(kurir);
    }
    
    
    @Test
    public void testHitungTotalGaji() {
        Kurir kurir = new Kurir("Lala", "KU1234", 10000);
        double result = kurir.hitungTotalGaji(-1);
        double expResult = 10000+1+1000-5300;
        assertFalse(result!=expResult);
    }
    @Test
    public void testHitungTotalGaji2() {
        Kurir kurir = new Kurir("Lala", "KU1234", 10000);
        double result = kurir.hitungTotalGaji(1000);
        double expResult = 10000+1+1000-5300;
        assertFalse(result!=expResult);
    }

    /**
     * Test of hitungBonus method, of class Kurir.
     */
    @Test
    public void testHitungBonus() {
        Kurir kurir = new Kurir("Lala", "KU1234", 10000);
        double result = kurir.hitungBonus(1, -10);
        double expResult = 1000;
        assertFalse(result!=expResult);
    }
    @Test
    public void testHitungBonus2() {
        Kurir kurir = new Kurir("Lala", "KU1234", 10000);
        double result = kurir.hitungBonus(-1, 1);
        double expResult = 1000;
        assertFalse(result!=expResult);
    }
    @Test
    public void testHitungBonus3() {
        Kurir kurir = new Kurir("Lala", "KU1234", 10000);
        double result = kurir.hitungBonus(1, 10.0);
        double expResult = 1.0;
        assertEquals(expResult,result);
    }

    @Test
    public void testHitungPajak1(){
        Kurir kurir = new Kurir("nama", "KU1111", 1000);
        double result = kurir.hitungPajak(-1);
        double expResult = 1000;
         
        assertTrue(expResult == result);
    }
    
    @Test
    public void testHitungPajak2(){
        Kurir kurir = new Kurir("nama", "KU1111", 1000);
        double result = kurir.hitungPajak(10);
        double expResult = 100;
        
        assertTrue(expResult == result);
    }
    @Test
    public void testTampil(){
        Kurir kurir = new Kurir("nama", "KU1111", 1000);
        String result = kurir.tampil();
        String expResult = "Kurir dengan nama id kurir KU1111 memiliki Gaji 1000.0";
        assertEquals(expResult,result);
    }
}
