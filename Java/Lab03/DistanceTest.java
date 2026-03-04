package Lab03;

class Distance {
    double feet;
    double inches;

    public Distance() {
        feet = 4.5;
        inches = 24;
    }

    public Distance(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public void display() {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }

    public Distance add(Distance d1) {
        return new Distance(feet + d1.feet, inches + d1.inches);
    }
}

public class DistanceTest {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(10.5, 34);
        Distance d3 = d1.add(d2);
        d3.display();
    }
}
