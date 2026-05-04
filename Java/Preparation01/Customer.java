package Preparation01;

public class Customer {
    private String name;
    private int age;
    private String custID;
    private String pswd;

    Customer(String name , int age , String custID, String pswd){
        this.name = name;
        this.custID = custID;
        this.age = age;
        this.pswd = pswd;}

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setID(String ID){
        this.custID = custID;
    }
    public void setPswd(String pswd){
        this.pswd = pswd ;
    }

    public String getPswd(){
        return pswd;
    }
    public String getID(){
        return custID;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
}
