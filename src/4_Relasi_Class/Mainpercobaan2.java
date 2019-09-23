package jobsheet4_tugas_1841720075Adam;

public class Mainpercobaan2 {

    public static void main(String[] args) {
        Jenismobil jm = new Jenismobil("toyota", "manual");
        
        Mobil m = new Mobil(jm,20000);
       
        m.setBiaya(350000);
        Pengajar pn = new Pengajar("Budi", "Cowok Dong ", 20000);
        Pelanggan p = new Pelanggan("nama",8);
        p.setnama("Sutoyo");
        p.sethari(2);
        p.setMobil(m);
        p.setpengajar(pn);
        System.out.println("Merk mobil: " + p.getMobil().getjenismobil().getmerk());
        System.out.println("Biaya mobil: " + p.getMobil().hitungBiayaMobil(p.gethari()));
        System.out.println("Nama Pengajar: " + pn.getnama());
        System.out.println("Kelamin Pengajar: " + pn.getkelamin());
        System.out.println("Biaya Pengajar: " + pn.hitungBiayaPengajar(p.gethari()));
        System.out.println("Nama Pelanggan: " + p.getNama());
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());

    }
}
