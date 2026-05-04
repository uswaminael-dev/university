interface A{

    //interface takes only FINAL and STATIC variables
    static final int value = 10;

    //by default the variables are FINAL nad STATIC
    int num2 = 4;

    //contain abstarct method (features but no implementation)
    public abstract void detail();

    // Java 8 allows definition of default methods
    public default int Id(){
        return 0;
    }

    //Java 8 allows definition of static methods
    public static String message(){
        return "This is a static method";
    }

    //by default the method is Abstract and Public
    boolean equals(Object O);

}

interface B{
    public void display();
}

class a implements A,B{
    public void detail(){
        System.out.println("This is demo class");
    }

    public void display(){
        System.out.println("This is display method from interface B");
    }
    
}

public class Demo {
    public static void main(String[] args) {
        A a1 = new a();
        A.message();
        System.out.println(A.value); // This will cause a compile-time error because 'value' is final
        a1.detail();
        a1 = (a)a1;
        ((B)a1).display();   
        a a2 = new a();
        a2.detail();
        System.out.println(A.value);
        System.out.println(a.value); 
    }
}