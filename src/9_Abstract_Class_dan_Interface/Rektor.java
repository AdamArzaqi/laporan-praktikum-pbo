package interfacelatihan_1841720075Adam;

public class Rektor 
{
    public void beriSertifikatCumlaude(ICumlaude mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selesai silahkan perkenalkan diri Anda.");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa)
    {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------");
    }
}
