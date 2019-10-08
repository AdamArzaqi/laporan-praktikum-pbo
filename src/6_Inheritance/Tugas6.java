package tugas_1841720075Adam;

public class Tugas6 {
        public static void main(String[] args) {
        //Laptop l = new Laptop("ASUS", 3, 8, "AMD Quad Core R5-2500U", 15);
        Pc pc = new Pc("ASUS",3,8,"AMD Quad Core R5-2500U",15);
        pc.tampilPC();
        
        Mac mac= new Mac("Apple",3,10,"intel core i5","Lithium","McAvee");
        mac.tampilMac();

}
}
