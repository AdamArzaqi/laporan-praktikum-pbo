package relasiclass_percobaan2_1841720075Adam;

public class Mobil {
   
    private String nama;
    private int biaya;
    
    Mobil(){
        
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }   
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public int getBiaya(){
        return biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari; 
    } 

}