package tugas_1841720075Adam;

public class Laptop extends Komputer{
    public String jnsBatrai;
    public Laptop() {
        
    }
    public Laptop(String merk,int kecProsesor,int sizeMemory,String jnsProsesor, String jnsBatrai){
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrai = jnsBatrai;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai : "+jnsBatrai);
    }
}


