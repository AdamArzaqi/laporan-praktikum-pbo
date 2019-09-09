package Game;

import java.util.Scanner;

public class PenyewaanTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Penyewaan penyewa=new Penyewaan();
        
        penyewa.id=172;
        System.out.println("Masukan Nama Anda   : ");
        penyewa.namaMember=sc.next();
        System.out.println("Masukan Nama Game   : ");
        penyewa.namaGame=sc.next();
        System.out.println("Lama Sewa Game      : ");
        penyewa.lamaSewa=sc.nextInt();
        System.out.println("Harga per-Hari      : ");
        penyewa.harga=sc.nextInt();
        penyewa.hargaTotal();
        penyewa.tampilData();
    }    
}