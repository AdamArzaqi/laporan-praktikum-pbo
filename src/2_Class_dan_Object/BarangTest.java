package TugasBarang;
import java.util.Scanner;
public class BarangTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Barang1 brg=new Barang1();
        System.out.println("Masukan Kode Barang : ");
        brg.kode=sc.next();
        System.out.println("Masukan Nama Barang : ");
        brg.namaBarang=sc.next();
        System.out.println("Masukan Harga Awal : ");
        brg.hargaAwal=sc.nextInt();
        System.out.println("Masukan Jumlah Diskon : ");
        brg.diskon=sc.nextFloat();
        
        brg.hitungHargaJual(brg.hargaAwal, brg.diskon);
        brg.tampilData();
    }
    
}
