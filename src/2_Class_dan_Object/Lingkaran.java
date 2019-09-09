package TugasLingkaran;
import java.util.Scanner;
public class Lingkaran {
    public double jari;
    public double phi=3.14;
    public double luas;
    public double keliling;
    
    Scanner sc=new Scanner(System.in);
    
    public double setjariJari(){
        return jari;
    }
    public double setLuas(){
        luas=phi*jari;
        return luas;
    }
    public double setKeliling(){
        keliling=2*phi*jari;
        return keliling;
    }
    public void tampilData(){
        System.out.println("Jari-Jari Lingkaran : "+jari);
        System.out.println("Luas Lingkaran      : "+luas);
        System.out.println("Keliling Lingkaran  : "+keliling);
    }
}
