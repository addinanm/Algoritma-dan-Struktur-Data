package jobsheet15;

import java.util.Scanner;

public class GraphArray {
    private final int vertices;
    private final int [][] twoD_array;

    public GraphArray(int v) {
        this.vertices = v;
        this.twoD_array = new int[vertices + 1][vertices + 1];
    }
    public void makeEdge(int to, int from, int edge){
        try {
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
    }
    public int getEdge(int to, int from){
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
        return -1;
    }
    public static void main(String[] args) {
        int v, e , count = 1;
        int to  = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try {
            System.out.println("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edges: ");
            e = sc.nextInt();
            
            graph = new GraphArray(v);
            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {                
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print(" ");
            for (int i = 0; i <= v; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i <= v; i++) {
                System.out.print(i + " ");
                for (int j = 0; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error, silahkan cek kembali" + E.getMessage());
        }
        sc.close();
        
    }
}