/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd14_c_5;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class Kurir {
    private String nama;
    private String id_kurir;
    private double gaji_pokok;

    public Kurir(String nama, String id_kurir, double gaji_pokok) {
        if(nama.isEmpty())
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        if(!id_kurir.startsWith("KU")|| id_kurir.length()!=6){
            throw new IllegalArgumentException("ID Kurir Harus 6 digit dan diawali dengan KUXXXX (Contoh KU1234)");
        }
        if(gaji_pokok<0){
            throw new IllegalArgumentException("Gaji Pokok Tidak boleh kurang dari 0");
        }
        this.nama = nama;
        this.id_kurir = id_kurir;
        this.gaji_pokok = gaji_pokok;
    }
    
    public double getGajiPokok(){
        return gaji_pokok;
    }
    
    public double hitungTotalGaji(double tunjangan){
        if(tunjangan<0)
            throw new IllegalArgumentException("Tunjangan Tidak boleh kurang dari 0");
        return gaji_pokok+hitungBonus(2, 30000)+tunjangan+hitungPajak(53);
        
    }
    
    public double hitungBonus(double jumlahPaket, double biayaPerPaket){
        if(jumlahPaket<0)
            throw new IllegalArgumentException("Jumlah Paket Tidak boleh kurang dari 0");
        if(biayaPerPaket<0)
            throw new IllegalArgumentException("Biaya per Paket Tidak boleh kurang dari 0");
        return jumlahPaket*biayaPerPaket*10.0/100.0;
    }
    
    public double hitungPajak(double presentase){
        if(presentase<0)
            throw new IllegalArgumentException("Persentase Tidak boleh kurang dari 0");
        return gaji_pokok*presentase/100.0;
    }
    
    public String tampil(){
        //NPM 1 (210711015)
        //NMP 2 (210711023)
        return "Kurir dengan "+nama+" id kurir "+id_kurir+" memiliki Gaji "+gaji_pokok;
    }
}
