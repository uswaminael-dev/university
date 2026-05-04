package LabAssignment;

public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1.0;
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = side;
    }
    public void setLength(double side) {
        this.side = side;
    }
    public String toString() {
        return "Square[side = " + side + ", color = " + getColor() + ", filled = " + isFilled() + "]";
    }
    
}
