# Jawaban 2.3.3

1.	jelaskan mengenai base lain Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
Jawab :
Pada algoritma divide conquer akan dilakukan pembagian data secara rekursif sehingga akan menghasilkan sub-sub bagian yang terdiri dari Divide, Solve, Combine dan masing- masing data yang sudah dibagi akan mengalikan data sehingga akan menghasilkan sub bagian tunggal yang bernilai hasil dari data. Dari kedua data yang sudah dibagi akan dikalikan sehingga menghasilkan nilai data dari factorial
2.	Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
Jawab :
Pada sortcode factorial diatas terdiri dari 3 tahapan 
Divide = pembagian dari nilai factorial tersebut (int n)
Conquer = pemanggilan perkalian dari nilai itu (aktorialDF(n-1))
Combine = hasil hitung dari nilai divide dan conquer (return fakto)
3.	Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!
Jawab :
public int faktorialBF(int n){
        int fakto = 1;
        for (int i = 0; i <=n; i++) {
            fakto = fakto *i;
        }
        return fakto;
    }
4.	Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
Jawab :
Pengecekan nilai Brute Force :
	for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));    
    }
5.	Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
Jawab :
ada. jika menngunakan inputan diats 20 maka akan cenderung lama dalam mengeksekusi dibendingkan dengan dengan nilai dibawah 10

# Jawaban 2.4.3
1.	jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
Jawab :
jika menggunakan brute force maka penghitungan nilai pangkat akan langsung dihitung urut, jika menggunakan algoritma divide qonquer maka jika nali n sama dengan 1 maka akan langsung mencetak 1 jika nilai module 2 sama dengan 1 maka nilai n akan dibagi dan dikali dengan nilai pangkat 
2.	Pada method PangkatDC() terdapat potongan program sebagai berikut:
Jelaskan arti potongan kode tersebut
Jawab :
jika nali n module 2 sama dengan 1 maka akan mencetak nilai pangkat, nilai n dibagi 2 dikali nilai pangkat, nilai n bagi 2 kali nilai pangkat jika nilai module 2 sama dengan 0 maka nilai pangkat, nilai n bagi 2 kali pangkat, nilai n bagi 2 kali pangkat
3.	Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
Jawab :
ada. pada nilai 
 return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
   dan 
 return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
4.	Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor
Jawab :
5.	Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!
Jawab :	

# Jawaban 2.5.3
1.	Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()
Jawab :
2.	Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis algoritma tersebut.
Jawab :
3.	Mengapa terdapat formulasi return value berikut?Jelaskan!
Jawab :
4.	Kenapa dibutuhkan variable mid pada method TotalDC()?
Jawab :
untuk mencari nilai dari parameter l ditambah r dibagi 2 atau bisa disebut mencari nilai rata rata
5.	Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!
Jawab :

