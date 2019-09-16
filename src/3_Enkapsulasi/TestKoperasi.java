package Tugaskoperasi1841720075Adam;
import java.util.Scanner;
public class TestKoperasi {
       public static void main(String[] args){ 
       Scanner sc = new Scanner(System.in);
     AnggotaKoperasi donny = new AnggotaKoperasi("111333444", "Donny", 5000000); 
 
    System.out.println("Nama Anggota: "+donny.getnama()); 
    System.out.println("Limit Pinjaman: "+donny.getLimitpeminjaman()); 
 
    System.out.print("Masukkan pinjaman: ");    
    int p = sc.nextInt();    
    donny.pinjam(p); 
    System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahpinjaman()); 
    
    System.out.print("Masukkan pinjaman: ");     
    int p2 = sc.nextInt();     
    donny.pinjam(p2); 
    System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahpinjaman()); 
 
    System.out.print("Masukkan angsuran: ");    
    int a = sc.nextInt();     
    donny.angsuran(a); 
    System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahpinjaman()); 
    System.out.print("Masukkan angsuran: ");   
    int a2 = sc.nextInt();     
    donny.angsuran(a2); 
    System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahpinjaman()); 
    } 
} 

 

