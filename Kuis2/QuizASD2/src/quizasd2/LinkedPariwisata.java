package quizasd2;
public class LinkedPariwisata {
    public Node head;
    public int size;
    public Pariwisata prw;

    public LinkedPariwisata() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addFirst(String bulan, String tahun1, String tahun2, String tahun3) {
        prw = new Pariwisata(bulan, tahun1,tahun2, tahun3);
        Node nd = new Node(prw,head);
        size++;
    }
    
    public void add(String bulan, String tahun1, String tahun2, String tahun3, int index) throws Exception {
        prw = new Pariwisata(bulan, tahun1,tahun2, tahun3);
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(bulan, tahun1, tahun2, tahun3);
        }else{
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp==null)? null: tmp.next;
            tmp.next = new Node(prw, next);
            size++;
        }
    }
    
    public void addLast(String bulan, String tahun1, String tahun2, String tahun3){
        prw = new Pariwisata(bulan, tahun1, tahun2, tahun3);
        if (isEmpty()) {
            addFirst(bulan, tahun1, tahun2, tahun3);
        }else{
            Node tmp = head;
            while (tmp.next != null) {                
                tmp = tmp.next;
            }
            tmp.next = new Node(prw,null);
            size++;
        }
    }
    
    public Pariwisata getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }
    public Pariwisata getLast() throws Exception{
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
    
    public Pariwisata get(int index) throws Exception{
        if (isEmpty() || index >=size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void addKey(String bulan) throws Exception {
        Node tmp = head;
        String tahun1 = "";
        String tahun2 = "";
        String tahun3 = "";
        for (int i = 0; i < size; i++) {

            if (tmp.data.bulan.equalsIgnoreCase(bulan)) {
                tahun1 = tmp.data.tahun1;
                tahun2 = tmp.data.tahun2;
                tahun3 = tmp.data.tahun3;
                prw = new Pariwisata(bulan,tahun1,tahun2,tahun3);
                add(bulan, tahun1,tahun2,tahun3, i + 1);
                break;
            }
            tmp = tmp.next;
        }
    }

    public int getKey(String bulan) throws Exception {
        Node tmp = head;
        int simpan = -1;
        for (int i = 0; i < size; i++) {

            if (tmp.data.bulan.equalsIgnoreCase(bulan)) {
                simpan = i;
                break;
            }
            tmp = tmp.next;
        }
        return simpan;
    }
    public void removeKey(String bulan) throws Exception {
        Node tmp = head;
        for (int i = 0; i < size; i++) {

            if (tmp.data.bulan.equalsIgnoreCase(bulan)) {
                remove(i);
                break;
            }
            tmp = tmp.next;
        }
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
        Pariwisata tmp = getFirst();
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
                System.out.println("Bulan : "+tmp.data.bulan);
                System.out.println("2018 : "+tmp.data.tahun1);
                System.out.println("2019 : "+tmp.data.tahun2);
                System.out.println("2020 : "+tmp.data.tahun3);
                tmp = tmp.next;
            }
            System.out.println("");
        }
        else{ 
            System.out.println("LinkedList kosong");
        }
    }
}
