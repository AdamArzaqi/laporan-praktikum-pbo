package TugasOverloading_1841720075Adam;
public class DemoSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        s.SetSudut(180);
        System.out.println(s.getSudut());
        System.out.println(s.totalSudut(80));
        System.out.println(s.totalSudut(60, 40));
        System.out.println(s.keliling(80, 90, 10));
        System.out.println(s.keliling(60, 20));
    }
}