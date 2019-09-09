package com.mycompany.jobsheet2;

public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        Mahasiswa mhs2=new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs2.usia=99;
        mhs2.hobi="Makan";
        mhs1.tampilBiodata();
        mhs2.tampilBiodata2();
    }    
}