## Laporan Jobsheet 04 ‑ Relasi Kelas 

## <br>Kompetensi 
<br> Setelah menempuh pokok bahasan ini, mahasiswa mampu: 
1. Memahami konsep relasi kelas; 
2. Mengimplementasikan relasi has‑a dalam program. 

## <br>Percobaan 1 
<br>a. Perhatikan diagram class berikut:
<br> ![RELASI](img/coba1UML.JPG)
<br>b. Buka project baru di Netbeans dan buat package dengan format berikut: 
<br> (identifier).relasiclass.percobaan1 (ganti {identifier} dengan identitas anda atau nama domain), Contoh: ac.id.polinema, jti.polinema, dan sebagainya). 
 
Catatan: Penamaan package dengan tambahan identifier untuk menghindari adanya kemungkinan penamaan class yang bentrok. 
 
c. Buatlah class Processor dalam package tersebut. 
 
public class Processor { 
 
} 
 
d. Tambahkan atribut merk dan cache pada class Processor dengan akses modifier private . 
 
private String merk; private double cache; 
 
e. Buatlah constructor default untuk class Processor. 
 
f. Buatlah constructor untuk class Processor dengan parameter merk dan cache. 
 
g. Implementasikan setter dan getter untuk class Processor. 
 
h. Implementasikan method info() seperti berikut: 
 
public void info() { System.out.printf("Merk Processor = %s\n", merk); System.out.printf("Cache Memory = %.2f\n", cache); } 
<br> ![RELASI](img/coba1.1.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Processor.java)

<br>i. Kemudian buatlah class Laptop di dalam package yang telah anda buat. 
 
j. Tambahkan atribut merk dengan tipe String dan proc dengan tipe Object Processor 
 
private String merk; private Processor proc; 
 
 
k. Buatlah constructor default untuk class Laptop . 
 
l. Buatlah constructor untuk class Laptop dengan parameter merk dan proc . 
 
m. Selanjutnya implementasikan method info() pada class Laptop sebagai berikut 
 
public void info() { System.out.println("Merk Laptop = " + merk); proc.info(); } 

<br> ![RELASI](img/coba1.2.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Laptop.java)

<br>n. Pada package yang sama, buatlah class MainPercobaan1 yang berisi method main(). 
 
o. Deklarasikan Object Processor dengan nama p kemudian instansiasi dengan informasi atribut Intel i5 untuk nilai merk serta 3 untuk nilai cache . 
 
Processor p = new Processor("Intel i5", 3); 
 
p. Kemudian deklarasikan serta instansiasi Objek Laptop dengan nama L dengan informasi atribut Thinkpad dan Objek Processor yang telah dibuat. 
 
q. Panggil method info() dari Objek L. 
 
L.info(); 
 
r. Tambahkan baris kode berikut 
 
Processor p1 = new Processor(); p1.setMerk("Intel i5"); p1.setCache(4); Laptop L1 = new Laptop(); L1.setMerk("Thinkpad"); L1.setProc(p1); L1.info(); 

<br> ![RELASI](img/coba1.3.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Mainpercobaan1.java)

<br>s. Compile kemudian run class MainPercobaan1, akan didapatkan hasil seperti berikut: 

<br> ![RELASI](img/coba1Out.JPG)

## <br> Pertanyaan 
<br>1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
<br><br>Jawab : Jadi fungsinya sesuai dengan namanya yaitu untu menge-set (memberi nilai) dan menge-get (mendapatkan/melihat nilai) pada suatu variabel atau class dengan contructor default

<br>2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?
<br><br>Jawab : Bila konstruktor default, untuk memberi nilai menggunakan setter, tetapi jika kita menggunakan konstruktor berparameter, kita hanya perlu memberi nilai di parameter pada objek di class main.

<br>3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?
<br><br>Jawab : Proc, karena inisiasi tipe variabel ditandai dengan nama object.

<br>4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ?
<br><br>Jawab : Terlihat jelas pada constructor, terdapat parameter yang menggunakan object Processor yang telah diinisiasi sebelumnya.

<br>5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
<br><br>Jawab : proc.Info(), merupakan syntax yang digunakan untuk menjalankan method Info() pada class Processor.

<br>6. Pada class MainPercobaan1, terdapat baris kode: Laptop l = new Laptop("Thinkpad", p);. Apakah p tersebut ? 
Dan apakah yang terjadi jika baris kode tersebut diubah menjadi: Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3)); 
Bagaimanakah hasil program saat dijalankan,apakah ada perubahan ?
<br><br>Jawab : p merupakan object dari class Processor yang tadi telah diinstansiasi, Lalu kode program yang baru hasilnya sama saja, kode program tersebut memiliki perbedaan pada instansiasi dalam bentuk variabel object, bila pada kode program tersebut object tidak perlu diinstansiasi kedalam variabel lain tetapi ter nested atau bisa dibilang melakukan instansiasi objek dialam instansiasi object.

## <br>Percobaan 2 

<br>Perhatikan diagram class berikut yang menggambarkan sistem rental mobil. Pelanggan bisa menyewa mobil sekaligus sopir. Biaya sopir dan biaya sewa mobil dihitung per hari:
<br><br>![RELASI](img/coba2UML.JPG)

<br>a. Tambahkan package (identifier).relasiclass.percobaan2.
<br>b. Buatlah class Mobil di dalam package tersebut. 
<br>c. Tambahkan atribut merk tipe String dan biaya tipe int dengan akses modifier private. 
<br>d. Tambahkan constructor default serta setter dan getter. 
<br>e. Implementasikan method hitungBiayaMobil 
<br>public int hitungBiayaMobil(int hari) { return biaya * hari; } 
<br><br>![RELASI](img/coba2E.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Mobil.java)
<br><br>f. Tambahkan class Sopir dengan atribut nama tipe String dan biaya tipe int dengan akses modifier private berikut dengan constructor default. 
<br>g. Implementasikan method hitungBiayaSopir 
<br>public int hitungBiayaSopir(int hari) { return biaya * hari; } 
<br><br>![RELASI](img/coba2G.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Sopir.java)
<br><br>h. Tambahkan class Pelanggan dengan constructor default. 
<br>i. Tambahkan atribut‑atribut dengan akses modifier private berikut: 
<br><br>![RELASI](img/coba2I.JPG)
<br><br>j. Implementasikan setter dan getter
<br>k. Tambahkan method hitungBiayaTotal 
public int hitungBiayaTotal() { return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari); } 
<br><br>![RELASI](img/coba2K.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/pelanggan.java)
<br><br>l. Buatlah class MainPercobaan2 yang berisi method main(). Tambahkan baris kode berikut:  
<br>Mobil m = new Mobil(); m.setMerk("Avanza"); m.setBiaya(350000); Sopir s = new Sopir(); s.setNama("John Doe"); s.setBiaya(200000); Pelanggan p = new Pelanggan(); p.setNama("Jane Doe"); p.setMobil(m); p.setSopir(s); p.setHari(2); System.out.println("Biaya Total = " +  p.hitungBiayaTotal()); 
<br><br>![RELASI](img/coba2J.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/mainpercobaan2.java)
<br><br>m. Compile dan jalankan class MainPercobaan2, dan perhatikan hasilnya!
<br><br>![RELASI](img/coba2Out.JPG)

## <br>Pertanyaan

<br>1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
<br><br>Jawab : Dapat dilihat pada inisiasi  variabel object di class pelanggan

<br>2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ?
<br><br>Jawab : Argumen tersebut nantinya digunakan untuk diisi dengan variabel int hari pada class Pelanggan

<br>3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
<br><br>Jawab : Kode program tersebut digunakan untuk menjumlahkan biaya mobil yang diambil dari harga sopir dikali dengan hari lalu yang dijumlahkan dengan biaya sopir yang diambil dari harga sopir dikali hari.

<br>4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ?
<br><br>Jawab : Kode program tersebut digunakan untuk memberi atau mengisi nilai dari namaMobil dan namaSopir yang ada pada objek pelanggan

<br>5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ? 
<br><br>Jawab : Digunakan untuk menghitung biaya total dari penjumlahan antara biaya sopir dan biaya mobil.
 
<br>6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run! 
 
System.out.println(p.getMobil().getMerk()); 
 
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut?
<br><br>Jawab : Perintah tersebut digunakan untuk menggembalikan atau me return nilai atribut dari method  getMerk() pada class Mobil melalui objek pelanggan, atau setelah me return object Mobil pada class pelanggan, object mobil akan me return String getMerk() pada class mobil

## <br>Percobaan 3 

<br>Pada percobaan‑percobaan sebelumnya, relasi dalam class dinyatakan dalam one‑to‑one. Tetapi ada kalanya relasi class melibatkan lebih dari satu. Hal ini disebut dengan multiplicity. Untuk relasi lebih rinci mengenai multiplicity, dapat dilihat pada tabel berikut.
<br><br>![RELASI](img/coba3.JPG)

<br>a. Sebuah Kereta Api dioperasikan oleh Masinis serta seorang Asisten Masinis. Baik Masinis maupun Asisten Masinis keduanya merupakan Pegawai PT. Kereta Api Indonesia. Dari ilustrasi cerita tersebut, dapat digambarkan dalam diagram kelas sebagai berikut:
<br><br>![RELASI](img/coba3A.JPG)
<br><br>b. Perhatikan dan pahami diagram kelas tersebut, kemudian bukalah IDE anda! 
<br>c. Buatlah package (identifier).relasiclass.percobaan3, kemudian tambahkan class Pegawai. 
<br>d. Tambahkan atribut‑atribut ke dalam class Pegawai private String nip; private String nama; 
<br>e. Buatlah constructor untuk class Pegawai dengan parameter nip dan nama. 
<br>f. Tambahkan setter dan getter untuk masing‑masing atribut. 
<br>g. Implementasikan method info() dengan menuliskan baris kode berikut: 
public String info() { String info = ""; info += "Nip: " + this.nip + "\n"; info += "Nama: " + this.nama + "\n"; return info; } 
<br><br>![RELASI](img/coba3G.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Pegawai.java)
<br><br>h. Buatlah class KeretaApi berdasarkan diagram class. 
<br>i. Tambahkan atribut‑atribut pada class KeretaApi berupa nama, kelas, masinis, dan asisten. 
private String nama; private String kelas; private Pegawai masinis; private Pegawai asisten; 
<br>j. Tambahkan constructor 3 parameter (nama, kelas, masinis) serta 4 parameter (nama, kelas, masinis, asisten). 
<br>k. Tambahkan setter dan getter untuk atribut‑atribut yang ada pada class KeretaApi . 
<br>l. Kemudian implementasikan method info() 
public String info() { String info = ""; info += "Nama: " + this.nama + "\n"; info += "Kelas: " + this.kelas + "\n"; info += "Masinis: " + this.masinis.info() + "\n"; info += "Asisten: " + this.asisten.info() + "\n"; return info; } 
<br><br>![RELASI](img/coba3L.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/KeretaApi.java)
<br><br>m. Buatlah sebuah class MainPercobaan3 dalam package yang sama.
<br><br>![RELASI](img/coba3M.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Mainpercobaan3.java)
<br>n. Tambahkan method main() kemudian tuliskan baris kode berikut. Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); Pegawai asisten = new Pegawai("4567", "Patrick Star"); KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten); 
System.out.println(keretaApi.info());

## <br>Pertanyaan

<br>1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ? 
<br><br>Jawab : Digunakan untuk memanggil method Info yang berada di class Pegawai melalui object masinis dan asisten

<br>2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() !
Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); 
System.out.println(keretaApi.info()); 
<br><br>Jawab :

<br>3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ? 4. Perbaiki class KeretaApi sehingga program dapat berjalan !
<br><br>Jawab :

<br>4.	Perbaiki class KeretaApi sehingga program dapat berjalan
<br><br>Jawab :

## <br>Percobaan 4

<br>![RELASI](img/coba4.JPG)
<br><br>a. Perhatikan dan pahami diagram class tersebut.
<br>b. Buatlah masing‑masing class Penumpang, Kursi dan Gerbong sesuai rancangan tersebut pada package (identifier).relasiclass.percobaan4. 
<br>c. Tambahkan method info() pada class Penumpang 
public String info() { String info = ""; info += "Ktp: " + ktp + "\n"; info += "Nama: " + nama + "\n"; return info; }
<br><br>![RELASI](img/coba4C.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Penumpang.java)
<br><br>d. Tambahkan method info() pada class Kursi 
public String info() { String info = ""; info += "Nomor: " + nomor + "\n"; if (this.penumpang != null){ info += "Penumpang: " + penumpang.info() + "\n"; } return info; }
<br><br>![RELASI](img/coba4D.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Kursi.java)
<br><br>e. Pada class Gerbong buatlah method initKursi() dengan akses private. private void initKursi() { for (int i = 0; i < arrayKursi.length; i++) { this.arrayKursi[i] = new Kursi(String.valueOf(i + 1)); } } 
<br>f. Panggil method initKursi() dalam constructor Gerbong sehingga baris kode menjadi berikut: 
<br>public Gerbong(String kode, int jumlah) { this.kode = kode; this.arrayKursi = new Kursi[jumlah]; this.initKursi(); } 
<br>g. Tambahkan method info() pada class Gerbong 
public String info() { String info = ""; info += "Kode: " + kode + "\n"; for (Kursi kursi : arrayKursi) { info += kursi.info(); } return info; } 
<br>h. Implementasikan method untuk memasukkan penumpang sesuai dengan nomor kursi. 
public void setPenumpang(Penumpang penumpang, int nomor) { this.arrayKursi[nomor - 1].setPenumpang(penumpang); }
<br><br>![RELASI](img/coba4H.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Gerbong.java)
<br><br>i. Buatlah class MainPercobaan4 yang berisi method main(). Kemudian tambahkan baris berikut! 
<br>Penumpang p = new Penumpang("12345", "Mr. Krab");Gerbong gerbong = new Gerbong("A", 10); gerbong.setPenumpang(p, 1); System.out.println(gerbong.info());
<br><br>![RELASI](img/coba4I.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Mainpercobaan4.java)
<br><br>![RELASI](img/coba4Out.JPG)

## <br>Pertanyaan

<br>1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?
<br><br>Jawab : 10, dapat dilihat pada instansiasi new Gerbong atau pada output bisa dilihat perulangan “Nomer : 10”

<br>2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut ? 
 
... if (this.penumpang != null) { info += "Penumpang: " + penumpang.info() + "\n"; } ...
<br><br>Jawab : Potongan kode program tersebut digunakan untuk menampilkan kursi yang terisi oleh penumpang, tetapi bila penumpang tidak bernilai atau null, maka kode program yang terdapat pada if tidak dijalankan atau berarti kursi tersebut masih kosong

<br>3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ?
<br><br>Jawab : karena index array selalu dimulai dari 0, oleh karena itu nilai nomer harus dikurangi 1 agar array di index 0 atau di index pertama dapat terisi

<br>4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ?
<br><br>Jawab :

<br>5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain !
<br><br>

## <br>Tugas

Buatlah sebuah studi kasus, rancang dengan class diagram, kemudian implementasikan ke dalam program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah dilakukan pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak dihitung). 
<br><br>![RELASI](img/tugas1.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Pelanggan.java)
<br><br>![RELASI](img/tugas2.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Pengajar.java)
<br><br>![RELASI](img/tugas3.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Mobil.java)
<br><br>![RELASI](img/tugas4.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/JenisMobil.java)
<br><br>![RELASI](img/tugasMain.JPG)
<br>Link kode program : [RELASI](../../src/4_Relasi_Class/Mainpercobaan2.java)
<br><br>![RELASI](img/tugasOut.JPG)
