package Lab03;
class Fraction {
    int num1;
    int num2;
    double ratio;
    public Fraction() {
        num1 = 17;
        num2 = 3;
        ratio = (double) num1 / num2;   }

    public Fraction(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        ratio = (double) this.num1 / this.num2;   
    }

    public void setNum1(int a) {
        num1 = a;
        ratio = (double) num1 / num2; 
    }

    public void setNum2(int b) {
        num2 = b;
        ratio = (double) num1 / num2;  
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void display() {
        System.out.println("Fraction: " + num1 + "/" + num2);
        System.out.println("Ratio: " + ratio);
    }

    public boolean equals(Fraction f1) {
        if (this.num1 * f1.num2 == this.num2 * f1.num1) {
            return true;
        }
        return false;
    }
}

public class FractionTest {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(1, 2);

        boolean equal = f1.equals(f2);

        System.out.println("Are fractions equal? " + equal);

        f1.display();
        f2.display();
    }
}