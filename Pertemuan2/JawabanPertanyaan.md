# Jawaban 2.3.3
1. Sebutkan 2 karakteristik class/objek!
Jawab :
karakteristik Class dan Objek
Class : diawalai dengan huruf besar
Objek : harus instansiasi di method main
2. Kata kunci apakah yang digunakan untuk mendeklarasikan class?
Jawab :
kata kunci untuk mendeklarasikan class adalah diawali dengan "class" baru nama class. 
ex = <modifier> Class <nama_Class>
3. Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class 
tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
Jawab: 
ada 4 atribut, yaitu : namaBarang, jenisBarang, stok, hargaBarang. deklarasi atribut terdapat pada baris 2 dan 3
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi 
method dilakukan?
Jawab :
ada 4 method, Yaitu : tampilBarang(), tambahStok(int n), kurangiStok(int n), hitunghatgaTotal(int jumlah). deklarasi atribut terdapat pada baris  5, 12, 15, 18
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut 
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
jawab :
public void kurangStok(int n){
        if(stok>0){
        stok = stok-n;            
        }else{
         stok = 0;
        }
    }
6. Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa 
bilangan int?
Jawab :
karena parameter yang digunakan untuk menyimpan nilai pada method tambahStok hanya 1 nilai
7. Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int?
Jawab :
karena method hitungHargaTotal() membutuhkan pengembalian nilai dari hasil hitung jumlah*hargaSatuan
8. Menurut Anda, mengapa method tambahStok() memiliki tipe data void?
Jawab :
karena method tambahStok tidak membutuhkan nilai pengembalian dari method tersebut


# Jawaban 2.4.3
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek
yang dihasilkan? 
Jawab :
pada baris ke 3. objek yang dihasilkan adalah b1
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
Jawab :
dengan cara menuliskan objek yg diinstasiasi baru ditliskan nilai atribut ingin diakses. 
ex = b1.namaBarang = "Corsiar 2 GB"


# Jawaban 2.5.3
1. Perhatikan class Barang yang ada di Praktikum 1.5, pada baris berapakah deklarasi konstruktor
berparameter dilakukan?
Jawab :
konstraktor berparameter terdapat pada baris 7
2. Perhatikan class BarangMain di Praktikum 1.5, apa sebenarnya yang dilakukan pada baris
program dibawah ini? 
Jawab :
menginstansiasi objek Barang dengan objek b2 dan mengisi nilai dari instansiasi 
3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class 
Barang.
Jawab :
Barang b3 = new Barang("Intel", "Processor", 500000, 10);
        b3.tampilBarang();


# Jawaban 2.6.3
1. Apa yang dimaksud dengan kode berikut ini: 
Jawab:
menginstansiasi objek berupa ppArray dari class Persegipanjang dalam bentuk array
2. Apa yang dimaksud dengan kode berikut ini: 
Jawab :
menambahkan nilai array dari objek ppArray beruppa nilai panjang dan lebar


# Jawaban 2.7.3
1. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah
ini akan memunculkan error saat dijalankan. Mengapa?
Jawab:
karena  ppArray[5] belum diinstansiasi dengan objek pesergi


# Jawaban 2.8.3
1. Apa yang dimaksud dengan konstruktor?
Jawab 
Constaktor adalah sebuah medhod yang sama dengan nama class yang bertujuan untuk mengisi nilai instansiasi objek pada kelas main
2. Jika diketahui terdapat class Segitiga seperti berikut ini:  
Bagaimana kode untuk membuat array Segitiga tersebut yang berisi 15 elemen?
Jawab :
Segitiga[] tigaArray = new Segitiga[15];
3. Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang 
masing-masing digunakan untuk mengisikan atribut alas dan tinggi
Jawab :
 public Segitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }
4. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut.
Jawab :
public double hitungLuas(){
        return 0.5 * alas* tinggi;
    }
    
    public double hitungKeliling(){
        double c = (alas*alas)+(tinggi*tinggi);
        return alas + tinggi + Math.sqrt(c);
    }
5. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya 
sebagai berikut:
Jawab :
Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10,4);
        sgArray[1] = new Segitiga(20,10);
        sgArray[2] = new Segitiga(15,6);
        sgArray[3] = new Segitiga(25,10);
        for(int i=0; i<4; i++){
            System.out.println("Luas Segitiga ke "+i+": "+sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga ke"+i+": "+sgArray[i].hitungKeliling());
        }