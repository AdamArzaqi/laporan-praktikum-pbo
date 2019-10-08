package tugas_1841720075Adam;

public class Pc extends Komputer {

    public int ukuranMonitor;

    public Pc() {
    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC() {
        System.out.println("============= PC ============");
        super.tampilData();
        System.out.println("Ukuran Monitor : " + ukuranMonitor);
    }
}
