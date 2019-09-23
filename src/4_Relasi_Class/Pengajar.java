package jobsheet4_tugas_1841720075Adam;

public class Pengajar {
    private String nama;
    private String kelamin;
    private int Biaya;
    
    Pengajar(String nama, String kelamin, int Biaya){
          this.Biaya=Biaya;
          this.kelamin=kelamin;
          this.nama=nama;
    }
    public void setnama(String nama){    
        this.nama=nama;
    }
    public String getnama(){
        return nama;
    }
    public void setkelamin(String kelamin){    
        this.kelamin=kelamin;
    }
    public String getkelamin(){
        return kelamin;
    }  
        public int hitungBiayaPengajar(int hari){
            return Biaya * hari; 
    } 
}