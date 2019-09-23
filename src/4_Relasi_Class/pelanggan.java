package relasiclass_percobaan2_1841720075Adam;

public class pelanggan {

    private String nama;
    private int hari;
    private Sopir sopir;
    private Mobil mobil;

    pelanggan() {
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
    public void setsopir(Sopir sopir) {
        this.sopir = sopir;
    }
    public Sopir getsopir() {
        return sopir;
    }
    public void sethari(int hari) {
        this.hari = hari;
    }
    public int gethari() {
        return hari;
    }
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}