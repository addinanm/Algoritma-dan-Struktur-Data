# Jawaban Pertanyaan Percobaan 11.3.3 :
1. Mengapa pada proses traverse nilai head perlu disimpan terlebih dahulu dalam variabel tmp ?
Jawab :
karena agar nilai dari head tidak berubah ketika menginput data yang baru. Namun, jika tidak menggunakan variabel tmp, nilai head akan berubah

2. Apa kekurangan implementasi single LinkedLists tanpa penunjuk tail ?
Jawab :
Ketika mengecheck data terakhir menjadi lebih lama karena sistem sedang mengecek tiap tiap node
satu persatu karena tidak terdeteksi/terbaca

3. Tambahkan implementasi method addByValue berdasarkan nilai yang dicari! Node baru akan 
ditambahkan setelah node yang dicari ditemukan.
Jawab :
	public void addByValue(int item) throws Exception {
        if (isEmpty()){
            throw new Exception(" -> Data Kosong! ");            
        }
        Node tmp=head;
        while (tmp!=null){
            if (item == tmp.data){
                while(tmp.next!=null){
                    tmp=tmp.next;
                }
                tmp.next = new  Node(item, null);
                size++;
                break;
            }
            tmp=tmp.next;
        }
    }

4. Tambahkan implementasi method removeByValue berdasarkan nilai yang dicari!
Jawab: 
	public void removeByValue(int item) throws Exception {
        int index = -1, i = 0;
        Node tmp=head;
        while(tmp!=null){
            if (item == tmp.data){
                index = i;
            }
            tmp = tmp.next;
            i++;
        }
        Node prev = head;
        Node cur = head.next;
        for(int j = 1; j < index; j++){
            prev = cur;
            cur = prev.next;
        }
        prev.next = cur.next;
        size--;
    }


5. Tambahkan menu serta submenu dan inputan dinamis (semua tipe data) pada program percobaan tersebut ! 
Jawab :

