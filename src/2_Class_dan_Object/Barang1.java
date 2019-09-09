package TugasBarang;

public class Barang1 {
    public String kode;
    public String namaBarang;
    public int hargaAwal;
    public float diskon;
    public int hargaJual;
    
    public void setKode(String newKode){
        kode=newKode;
    }
    public void setBarang(String newBarang){
        namaBarang=newBarang;
    }
    public void setHargaAwal(int newHarga){
        hargaAwal=newHarga;
    }
    public float setDiskon(float newDiskon){
        diskon=newDiskon;
        return diskon;
    }
    public int hitungHargaJual(int hargaAwal, float diskon){
        hargaJual=(int) (hargaAwal-(diskon/100*hargaAwal));
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("------------------");
        System.out.println();
        System.out.println("Kode    : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Awal  : "+hargaAwal);
        System.out.println("Diskon  : "+diskon+"%");
        System.out.println("Total Bayar : "+hargaJual);
    }
}
