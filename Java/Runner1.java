class rectangle{
    public int length , width;
    public int CalculateArea(){
        return(length * width);
    }
}

public class Runner1{
    public static void main(String [] args){
        rectangle rect = new rectangle();
        rect.length = 10;
        rect.width = 5;
        System.out.println(rect.CalculateArea());

    }
}
