package Tugas.NomorSatu;

public class LinkedListMhs {
    public Node head;
    public int size;
    public Mahasiswa mhs;

    public LinkedListMhs() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(String nim, String nama, String alamat) {
        mhs = new Mahasiswa(nim, nama,alamat);
        Node nd = new Node(mhs, head);
        size++;
    }
    
    public void add(String nim, String nama, String alamat, int index) throws Exception {
        mhs = new Mahasiswa(nim, nama, alamat);
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(nim,nama,alamat);
        }else{
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp==null)? null: tmp.next;
            tmp.next = new Node(mhs, next);
            size++;
        }
    }
    public void addLast(String nim, String nama, String alamat){
        mhs = new Mahasiswa(nim, nama, alamat);
        if (isEmpty()) {
            addFirst(nim,nama, alamat);
        }else{
            Node tmp = head;
            while (tmp.next != null) {                
                tmp = tmp.next;
            }
            tmp.next = new Node(mhs,null);
            size++;
        }
    }
    public Mahasiswa getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }
    public Mahasiswa getLast() throws Exception{
        if (isEmpty()) 
        {
            throw new Exception("LinkedList kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {            
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public Mahasiswa get(int index) throws Exception{
        if (isEmpty() || index >=size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >=size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            removeFirst();
        }else{
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void removeFirst() throws Exception{
        Mahasiswa tmp = getFirst();
        head = head.next;
        size--;
    }
    public void clear(){
        head= null;
        size=0;
    }
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {                
                System.out.println("Nim : "+tmp.data.nim);
                System.out.println("Nama : "+tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println("");
        }
        else{ 
            System.out.println("LinkedList kosong");
        }
    }

}
