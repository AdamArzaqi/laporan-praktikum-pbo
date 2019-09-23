package relasiclass_percobaan4_1841720075Adam;

public class Penumpang {
    
    private String ktp;
    private String nama;
   
    Penumpang(String nama, String ktp){
    this.nama=nama;
    this.ktp=ktp;       
   }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public String getnama() {
        return nama;
    }
    public void setktp(String ktp) {
        this.ktp = ktp;
    }
    public String getktp() {
        return ktp;
    }
    public String info() { 
           String info = "";
           info += "Ktp: " + ktp + "\n"; 
           info += "Nama: " + nama + "\n";
           return info; 
    } 
}