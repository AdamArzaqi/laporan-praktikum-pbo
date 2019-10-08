package tugas_1841720075Adam;

public class Komputer {
    public String merk,jnsProsesor;
    public int kecProsesor,sizeMemory;
    public Komputer() {
        
    }
    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    public void tampilData(){
        System.out.println("Merk : "+merk);
        System.out.println("kecepatan processor : "+kecProsesor);
        System.out.println("size memory : "+sizeMemory);
        System.out.println("jenis processor : "+jnsProsesor);
    }
}
