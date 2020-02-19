package Empat;

import java.util.Scanner;

public class MainPacMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PacMan pcm = new PacMan();
        
        System.out.println("Masukkan nilai x :");
        pcm.x = sc.nextInt();
        System.out.println("Masukkan nilai y :");
        pcm.y = sc.nextInt();
        System.out.println("Masukkan nilai width : ");
        pcm.width = sc.nextInt();
        System.out.println("Masukkan nilai height :");
        pcm.height = sc.nextInt();
        
        System.out.println("==========================================================");
        pcm.moveLeft();
        pcm.moveUp();
        pcm.moveRight();
        pcm.moveDown();
        pcm.printPosition();
        System.out.println("==========================================================");
    }
}
