package relasiclass_percobaan3_1841720075Adam;

public class Pegawai {
    private String nip; 
    private String nama; 
 
    Pegawai(String nip,String nama){
        this.nama=nama;
        this.nip=nip;
    }
    public void setNip(String nip){    
        this.nip=nip;
    }
    public String getNip(){
        return nip;
      }          
    public void setNama(String nama){    
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public String info(){ 
        String info = ""; info += "Nip: " + this.nip + "\n"; info += "Nama: " + this.nama + "\n"; return info; 
    } 
  }

