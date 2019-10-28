package pbominggu9.abstractclass_1841720075Adam;

public class Orang 
{
    private String nama;
    private Hewan hewanPeliharaan;
    
    public Orang(String nama)
    {
        this.nama = nama;
    }
    public void peliharaHewan(Hewan hewanPeliharaan)
    {
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan()
    {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara :");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
    }
}
