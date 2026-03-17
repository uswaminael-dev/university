package Lab05Task3;

public class Point {
    private int x;
    private int y;
    
    public Point() {
        x = 9;
        y = 6;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getY() {
        return y;
    }
    
    public void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
