package Tugas.Nomor1;

public class Queue1 {
    public int max;
    public int size;
    public int front;
    public int rear;
    public int Q[];

    public Queue1(int n) {
        this.max = n;
        Create();
    }
    
    public void Create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if (size==0) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + Q[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i+1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah antrian = " + size);
        }
    }
    
    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    
    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max-1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    
    public void peekPosition(int data){
        int nilai = 0;
        if(IsEmpty()){
            System.out.println("Antrian masih kosong!"); 
        } else{
            int n = front;
            while(n!=rear){
                nilai++;
                if (data == Q[n]){
                    System.out.println("Posisi data di: " + nilai);
                    break;
                }
                n = (n+1)%max;
            }
        }
    }
    
    public void peekAt(int position) {
        int nilai = 0;
        if(IsEmpty()){
            System.out.println("Antrian masih kosong!"); 
        }else{
            int a = front;
            while(a!=rear){
                nilai++;
                if (position == nilai){
                    System.out.println("Posisi antrian " + (a+1) + " : " + Q[a]);
                    break;
                }
                a = (a+1)%max;
            }
        }
    }
}
