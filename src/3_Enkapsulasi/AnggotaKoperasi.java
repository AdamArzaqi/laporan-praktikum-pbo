package Tugaskoperasi1841720075Adam;

public class AnggotaKoperasi {
  private String ktp;   
  private String nama;    
  private int limitPeminjaman; 
  private int jumlahPinjaman; 
 
    public AnggotaKoperasi(String ktp, String nama,  int limitPeminjaman){    
        this.ktp = ktp;    
        this.nama = nama; 
        this.limitPeminjaman = limitPeminjaman;     
        this.jumlahPinjaman = 0; 
    } 
    public String getktp() { 
    return ktp; 
    } 
    public String getnama() {     
        return nama; 
    } 	 
    public int getLimitpeminjaman() {    
        return limitPeminjaman; 
    } 
    public int getJumlahpinjaman() {  
        return jumlahPinjaman; 
    } 
    public void pinjam(int uang){     
        if(uang>limitPeminjaman){ 
            System.out.println("Maaf, jumlah pinjaman melebihi limit."); 
    }else{ 
        jumlahPinjaman += uang; 
        } 
    } 
    public void angsuran(int uang){ 
        jumlahPinjaman -= uang; 
    }
    public double getMinimalAngsur(){
        return jumlahPinjaman*0.1;
    }
    public void angsur(int bayar){
        if(bayar<getMinimalAngsur()){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
        else{
            jumlahPinjaman-=bayar;
        }
    }
} 


