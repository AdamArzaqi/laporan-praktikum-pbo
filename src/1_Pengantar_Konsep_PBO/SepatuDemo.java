package sepatudemo;

public class SepatuDemo {

    public static void main(String[] args) {
        
        Sepatu st1 = new Sepatu ();
        sepatubola st3 = new sepatubola ();
        Sepatu st2 = new Sepatu ();
        
        
        st1.setMerk("vans");
        st1.setukuran(40);
        st1.setjenis("sekolah");
        st1.setwarna("hitam");
        st1.harga (250000);
        st1.cetakStatus();
        System.out.println();
        
        st2.setMerk("eiger");
        st2.setukuran(42);
        st2.setjenis("gunung");
        st2.setwarna("hijau");
        st2.harga(300000);
        st2.cetakStatus();
        System.out.println();
        
        st3.setMerk("nike");
        st3.setukuran(40);
        st3.setjenis("bola");
        st3.setwarna("biru");
        st3.setpull("pull");
        st3.harga(700000);
        st3.cetakStatus();
        
        
        System.out.println();
       }
}
