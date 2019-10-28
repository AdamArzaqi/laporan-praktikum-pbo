package interfacelatihan_1841720075Adam;

public class Program2 
{
    public static void main(String[] args) 
    {
    Rektor pakRektor = new Rektor();

    //Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
    Sarjana sarjanaCumlaude = new Sarjana("Dini");
    PascaSarjana masterCumlaude = new PascaSarjana("masterCumlaude");

   // pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
   //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
   //pakRektor.beriSertifikatCumlaude(masterCumlaude);
    
   pakRektor.beriSertifikatMawapres((IBerprestasi) sarjanaCumlaude);
   pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
       
}