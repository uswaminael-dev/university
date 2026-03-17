package Immutable;

class Fraction {
    //fields
    private final int numerator;
    private final int denominator;
    //constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //getters
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    //methods
    public Fraction add(Fraction f) {
        int newNumerator = this.numerator * f.denominator + f.numerator * this.denominator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction subtract(Fraction f) {
        int newNumerator = this.numerator * f.denominator - f.numerator * this.denominator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction multiply(Fraction f) {
        int newNumerator = this.numerator * f.numerator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction divide(Fraction f) {
        int newNumerator = this.numerator * f.denominator;
        int newDenominator = this.denominator * f.numerator;
        return new Fraction(newNumerator, newDenominator);
    }


}

public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction sum = f1.add(f2);
        System.out.println("Fraction1: " + f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println("Fraction2: " + f2.getNumerator() + "/" + f2.getDenominator());
        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
        Fraction difference = f1.subtract(f2);
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());
        Fraction product = f1.multiply(f2);
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
        Fraction quotient = f1.divide(f2);
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());
    }
}
