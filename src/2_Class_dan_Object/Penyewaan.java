package Game;

public class Penyewaan {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;
    public int total;
    
    public void setId(int newId){
        id=newId;
    }
    public void setNamaMember(String newNamaMember){
        namaMember=newNamaMember;
    }
    public void setNamaGame(String newNamaGame){
        namaGame=newNamaGame;
    }
    public void setLamaSewa(int newLamaSewa){
        lamaSewa=newLamaSewa;
    }
    public int hargaTotal(){
        total=lamaSewa*harga;
        return total;
    }
    public void tampilData(){
        System.out.println("");
        System.out.println("Id Sewa             : "+id);
        System.out.println("Nama Member         : "+namaMember);
        System.out.println("Nama Game           : "+namaGame);
        System.out.println("Harga per-Hari      : "+harga);
        System.out.println("Laama Sewa          : "+lamaSewa);
        System.out.println("Total Pembayaran    : "+total);
    }
}
