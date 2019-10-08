package tugas_1841720075Adam;

public class Mac extends Laptop{
    public String security;
    public Mac() {
    }
    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrai, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrai);
        this.security = security;
    }
    public void tampilMac(){
        System.out.println("============= MAC ============");
        super.tampilLaptop();
        System.out.println("Security : "+security);
    }
}

    
