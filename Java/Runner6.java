class Distance{
    double feet;
    double inches;

    public Distance(){
        feet = 7;
        inches = 5.6;
    }

    public Distance(int f , int i){
        feet = f;
        inches = i;
    }
    
    public void display(){
        System.out.print("Feet: " + feet);
        System.out.println("    Inches: " + inches);
    }


}

public class Runner6 {
    public static void main(String [] args){
    System.out.println("-----1-----");
    Distance d1 =  new Distance();
    d1.display();
    System.out.println("-----2-----");
    Distance d2 =  new Distance(3 , 4);
    d2.display();
}

}
