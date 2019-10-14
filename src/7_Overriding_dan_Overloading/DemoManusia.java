package TugasOverriding_1841720075Adam;

public class DemoManusia {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        Manusia m = new Dosen();
        Manusia m1 = new Manusia();
        d.makan();
        mhs.makan();
        m.makan();
        m1.makan();
        m1.bernafas();
        d.lembur();
        mhs.tidur();
    }
}