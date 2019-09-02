/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepatudemo;

/**
 *
 * @author ASUS
 */
public class Sepatu {
    private String merk;
    private String jenis;
    private String warna;
    private int ukuran;
    private int harga;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
       public void setjenis(String newValue){
        jenis = newValue;
    }
    
    public void setwarna(String newValue){
        warna = newValue;
        
    }
    public void setukuran (int newValue){
        ukuran = newValue;
    }
     public void harga (int increament){
        
        harga = harga + increament;       
        System.out.println("harga"+ harga);
     }
     public void harga2 (int increament){
        
        harga = harga - increament;       
        System.out.println("harga"+harga);
   
     }
     public void cetakStatus()
    {
        System.out.println("merek: " + merk);
        System.out.println("jenis: " + jenis);
        System.out.println("warna: "+ warna);
        System.out.println("ukuran: "+ ukuran);
        System.out.println("harga: "+ harga);
        
    }
    }


