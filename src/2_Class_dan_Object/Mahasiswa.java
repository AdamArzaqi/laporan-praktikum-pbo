package com.mycompany.jobsheet2;

public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    public int usia;
    public String hobi;


    public void tampilBiodata(){
        System.out.println("Nim     : "+nim);
        System.out.println("Nama    : "+nama);
        System.out.println("Alamat  : "+alamat);
        System.out.println("Kelas   : "+kelas);
    }

    public void tampilBiodata2(){
        System.out.println("Usia    : "+usia);
        System.out.println("Hobi    : "+hobi);
    }    
}

