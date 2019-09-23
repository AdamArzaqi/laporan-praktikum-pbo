package relasiclass_percobaan2_1841720075Adam;

public class mainpercobaan2 {

    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        pelanggan p = new pelanggan();
        p.setnama("Jane Doe");
        p.setMobil(m);
        p.setsopir(s);
        p.sethari(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
    }
}