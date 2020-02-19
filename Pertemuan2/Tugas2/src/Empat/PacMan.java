package Empat;

public class PacMan {
    public int x;
    public int y;
    public int width;
    public int height;

    public PacMan() {
    }
    
    public void moveLeft(){
        if (x<= width || x > 0) {
            x -=1;
        }
        
    }
    
    public void moveRight(){
        if (x<= width || x > 0) {
            x +=1;
        }
    }
    
    public void moveUp(){
        if (y<= height || y > 0) {
            y-=1;
        }
    }
    
    public void moveDown(){
        if (y<= height || y > 0) {
            y += 1;
        }
    }
    
    public void printPosition(){
        System.out.println("Titik Koordinat = x:" + x + ", y :" + y ); 
    }
    
}
