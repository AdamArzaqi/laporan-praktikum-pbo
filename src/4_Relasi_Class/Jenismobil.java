package jobsheet4_tugas_1841720075Adam;

public class Jenismobil {
    private String merk;
    private String transmisi;
    
    Jenismobil(String merk, String transmisi){
        this.merk=merk;
        this.transmisi=transmisi;
     }
    public void setmerk(String merk){
        this.merk=merk;
    }
    public String getmerk(){
        return merk;
    }   
      public void settransmmisi(String transmisi){
        this.transmisi=transmisi;
    }
    public String gettransmisi(){
        return transmisi;
    }      
}
