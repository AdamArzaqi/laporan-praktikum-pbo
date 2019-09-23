package relasiclass_percobaan3_1841720075Adam;

public class Mainpercobaan3 {
    public static void main(String[] args) {
     Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); 
Pegawai asisten = new Pegawai("4567", "Patrick Star"); 
KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten); 
 
System.out.println(keretaApi.info()); 
 
    }
}
