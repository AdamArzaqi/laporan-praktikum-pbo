package jobsheet4_tugas_1841720075Adam;

public class Pelanggan {

    private String nama;
    private int hari;
    private Pengajar pengajar;
    private Mobil mobil;

    Pelanggan(String nama, int hari) {
    this.hari=hari;
    this.nama=nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    public Mobil getMobil() {
        return mobil;
    }
    public void setpengajar(Pengajar pengajar) {
        this.pengajar = pengajar;
    }
    public Pengajar getPengajar() {
        return pengajar;
    }
    public void sethari(int hari) {
        this.hari = hari;
    }
    public int gethari() {
        return hari;
    }
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + pengajar.hitungBiayaPengajar(hari);
    }
}