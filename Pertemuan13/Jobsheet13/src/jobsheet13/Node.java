package jobsheet13;

public class Node {
    int data;
    Node next, prev;
    
    public Node(Node prev, int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
