package interfacelatihan_1841720075Adam;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi
{
    public Sarjana(String nama)
    {
        super(nama);
    }

    @Override
    public void lulus() {
        super.kuliahDiKampus();
         System.out.println("Aku sudah menyelesaikan SKRIPSI"); 
    }

    @Override
    public void meraihIPKTinggi() {
         System.out.println("IPK-ku lebih darai 3,51"); 
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
