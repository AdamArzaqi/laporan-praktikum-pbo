package TugasLingkaran;
import java.util.Scanner;
public class LingkaranTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lingkaran lingkar=new Lingkaran();        
        System.out.println("Masukan Jari-Jari   : ");
        lingkar.jari=sc.nextDouble();
        lingkar.setLuas();
        lingkar.setKeliling();
        lingkar.tampilData();        
    }    
}