# Jawaban pertanyaan 10.3.3
1. Perhatikan class Queue, apakah fungsi dari atribut Q?
Jawab :
fungsi dari atribut Q adalah untuk mendeklaraasikan tipe data string integer dan digunakan untuk membuat antrian
2. Jelaskan fungsi atribut max, size, front, dan rear pada class Queue!
Jawab :
Max untuk jumlah antrian, ukuran untuk menyimpan jumlah data di antrian, depan untuk menyimpan nilai indeks array di mana sebagian besar data depan, belakang untuk menyimpan berapa banyak data yang di antrian
3. Pada method Create, mengapa atribut front dan rear diinisialisasi dengan nilai -1, tidak 0? 
Jelaskan!
Jawab :
Karena setiap data dimulai dari 0, dan -1 adalah data kosong
4. Perhatikan method IsFull, jika kondisi IF diubah menjadi size == max-1, apa yang terjadi? 
Mengapa demikian?
Jawab: 
Jadi jika antrian adalah nilai maks -1, jika maks adalah 6 maka ukurannya hanya bisa mencapai 5 antrian saja
5. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
Jawab :
Jika posisi belakang adalah array terakhir maka posisi belakang berikutnya adalah 0
6. Perhatikan kembali method Enqueue, baris kode program manakah yang menunjukkan bahwa 
data baru disimpan pada posisi terakhir di dalam queue?
Jawab :
Q[rear] = data;
            size++;

7. Mengapa method Dequeue mempunyai tipe kembalian int, tidak bertipe void?
Jawab: 
Karena dequeue adalah untuk mendapatkan data depan, dan harus mendapatkan data sebelumnya bergerak maju

8. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa 
data yang dikeluarkan adalah data pada posisi paling depan di dalam queue?
Jawab :
pada: data = Q[front];
            size--;
9. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
Jawab :
Jika nilai front berada pada indeks array terakhir, maka posisi front berikutnya adalah posisi front sebelumnya ditambah 1
10. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa 
data terlebih dahulu disimpan variabel lain sebelum diambil/dihapus?
Jawab: 
data = Q[front];
        size--;
11. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?
Jawab: 
karena nilai atribut front adalah data pertama di dalam antrian
12. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! 
Jawab :
untuk mengisi nilai i

13. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear yang 
digunakan memeriksa data yang berada di posisi belakang! Tambahkan pula daftar menu class
QueueMain sehingga method peekRear dapat dipanggil!
