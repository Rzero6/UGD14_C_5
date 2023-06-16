/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ugd14_c_5;

import org.junit.Test;
import static org.junit.Assert.*;


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
    
}
