package relasiclass_percobaan4_1841720075Adam;

public class Gerbong {
    private String kode;
    private Kursi[]arrKursi;
    
    Gerbong(String kode,int jumlah){
        this.kode=kode;
        this.arrKursi=new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() { 
        for (int i = 0; i < arrKursi.length; i++) {
        this.arrKursi[i] = new Kursi(String.valueOf(i + 1)); 
        }
    }
    public void setkode(String kode){
        this.kode=kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrKursi[nomor - 1].setpenumpang(penumpang); 
    }
    public String info() { String info = ""; 
        info += "Kode: " + kode + "\n"; 
    for (Kursi kursi : arrKursi) {
        info += kursi.info(); 
        } 
    return info; 
    } 
}