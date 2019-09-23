package relasiclass_percobaan4_1841720075Adam;

public class Kursi {
    private String nomer;
    private Penumpang penumpang;
   
    Kursi(String nomer) {
    this.nomer=nomer;           
    }
    public void setnomer(String nomer) {
        this.nomer = nomer;
    }
    public String getnomer() {
        return nomer;
   }  
    public void setpenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    public Penumpang getpenumpang() {
        return penumpang;
}
    public String info() { 
        String info = ""; 
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null) { 
            info += "Penumpang: " + penumpang.info() + "\n"; 
       } 
        return info; 
    } 
}        