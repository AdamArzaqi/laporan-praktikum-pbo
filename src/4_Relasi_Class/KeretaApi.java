package relasiclass_percobaan3_1841720075Adam;

public class KeretaApi {

    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.asisten = asisten;
        this.kelas = kelas;
        this.masinis = masinis;
        this.nama = nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getnama() {
        return nama;
    }
    public void setkelas(String kelas) {
        this.kelas = kelas;
    }
    public String getkelas() {
        return kelas;
    }
    public void setmasinis(Pegawai masinis) {
        this.masinis = masinis;
    }
    public Pegawai getmasinis() {
        return asisten;
    }
    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }
    public Pegawai getAsisten() {
        return asisten;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
