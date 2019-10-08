package tugas_1841720075Adam;

public class Windows extends Laptop{
    public String fitur;
    public Windows() {
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrai,String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrai);
        this.fitur = fitur;
    }
    public void tampilWindows(){
        System.out.println("============= WINDOWS ============");
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }
}

    

