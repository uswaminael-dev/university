class Marks{
    double physics;
    double biology;
    double chemistry;
    double sum;

    public Marks(){
        physics = 30;
        chemistry = 40;
        biology = 50;
    }

    public Marks(double phy , double bio , double chem){
        physics = phy;
        chemistry = chem;
        biology = bio;
    }

    public double sum(){
        sum = physics + chemistry + biology;
        System.out.println("Sum = " + sum);
        return sum;
    }
}
public class Runner7 {
    public static void main (String [] args){
        Marks marks1 = new Marks();
        marks1.sum();
        Marks marks2 = new Marks(50 , 50 , 55);
        marks2.sum();

    }
    
}
