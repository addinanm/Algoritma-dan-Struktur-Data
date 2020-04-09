package Tugas.Nomor2;

public class Queue {
    public int max;
    public int front;
    public int rear;
    public int size;
    public Nasabah[] q;

    public Queue(int max) {
        this.max = max;
        Create();
    }
    
    public void Create(){
        q = new Nasabah [max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean isEmpty(){
        if (size==0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void enqueue(Nasabah nas) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = nas;
            size++;
        }
    }
    
    Nasabah dequeue() {
        Nasabah nas = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            nas = q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max-1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return nas;
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(q[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        }
    }
    
    void printFront(){
        int i = front;
        System.out.println("Data depan : " + q[i].nama + " " + q[i].noRekening);
    }
    
    void printRear(){
        int i = rear;
        System.out.println("Data Belakang : " + q[i].nama + " " + q[i].noRekening);
    }
    
    public void printPosition(String data){
        int nilai = 0;
        if(isEmpty()){
            System.out.println("Antrian masih kosong!"); 
        }else{
            int n = front;
            while(n!=rear){
                nilai++;
                if (data.equalsIgnoreCase(q[n].nama)){
                    System.out.println("Posisi data di: " + nilai);
                    break;
                }
                n = (n+1)%max;
            }
        }
    }
    
    public void printNasabah(int position) {
        int nilai = 0;
        if(isEmpty()){
            System.out.println("Antrian masih kosong!"); 
        }else{
            int a = front;
            while(a!=rear){
                nilai++;
                if (position == nilai){
                    System.out.println("Posisi antrian " + (a+1) + " : " + q[a]);
                    break;
                }
                a = (a+1)%max;
            }
            System.out.println(q[a].nama +" " + q[a].noRekening);
        }
    }
}
