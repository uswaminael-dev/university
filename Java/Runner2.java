class MyRectangle{
    public int length , width;
    public MyRectangle(){
        length = 5;
        width = 2;
    }

    public MyRectangle(int l , int w){
        length = l;
        width = w;
    }

    public int CalculateArea(){
        return(length * width);
    }

}

public class Runner2 {
    public static void main (String [] args){
        MyRectangle rect = new MyRectangle();
        System.out.println(rect.CalculateArea());
        MyRectangle rect1 = new MyRectangle (10, 20);
        System.out.println(rect1.CalculateArea());
    }
}
