package Lab06;

class Person{
    private String name;
    private String address;
    private String phone_number;
    private String e_mail;

    Person(){
        name = "Ali Haider";
        address = "Sector H , Street 12";
        phone_number = "0333908765";
        e_mail = "alih@gmail.come";
    }

    Person(String name , String address ,  String e_mail, String phone_number){
        if(name.length()>2)this.name = name;
        else return;
        if(address.length()>=3)this.address = address;
        else return;
        if (phone_number.length()==10)this.phone_number = phone_number;
        else return;
        if(e_mail.contains(".") && e_mail.contains(".com"))this.e_mail = e_mail;
        else return;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNo(){
        return phone_number;
    }
    public String getEmail(){
        return e_mail;
    }

    public void setName(String name){
        if(name.length()>2)this.name = name;
        else System.out.println("Invalid name!"); return;
    }
    public void setAddress(String address){
        if(address.length()>=3)this.address = address;
        else System.out.println("Invalid address!"); return;
    }
    public void setPhoneNo(String phone_number){
        if (phone_number.length()==10)this.phone_number = phone_number;
        else System.out.println("Invalid Phone Number!"); return;
    }
    public void setEmail(String e_mail){
        if(e_mail.contains(".") && e_mail.contains(".com"))this.e_mail = e_mail;
        else System.out.println("Invalid Email!"); return;
    }

    public void display(){
        System.out.println("Name: " + name + "\nAddress: " + address + "\nContact No. " + phone_number + "\nE-mail: " + e_mail);
    }
}

//"----------------------------------------------------------------------------------------------"
class Student extends Person{
    private String regNo;
    private String status;
    
    Student(){
        super();
        regNo = "FA25-BDS-078";
        status = "Active";
    }
    Student(String name , String address ,  String e_mail, String phone_number,String regNo,String status){
        super(name , address, e_mail, phone_number);
        this.regNo = regNo;
        this.status = status;
    }


    public void display(){
        super.display();
        System.out.println("Reg No. " + regNo + "\nStatus: " + status);
    }
}
//"----------------------------------------------------------------------------------------------"
class Date{
    int day;
    int month;
    int year;

    Date(){
        day =00;
        month = 00;
        year = 00;
    }

    Date(int day , int month , int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display(){
        System.out.println(day + "/" + month + "/" + year);
    }
}
//"----------------------------------------------------------------------------------------------"
class Employee extends Person{
    private String office;
    private double salary;
    Date date_hired;

    Employee(){
        super();
        office = "HSA Finance Department, Room 302";
        salary = 456000.0;
        date_hired = new Date (03 , 04 , 2008);

    }
    Employee(String name , String address ,  String e_mail, String phone_number, String office , double salary ){
        super(name , address, e_mail, phone_number);
        this.office = office;
        this.salary = salary;
        this.date_hired = new Date (04 , 12 , 2002);

    }

    public void display(){
        super.display();
        System.out.println("Office: " + office + "\nSalary: " + salary + "\nHiring Date: "); 
        date_hired.display();
    }

}
//"----------------------------------------------------------------------------------------------"
class Faculty extends Employee{
    private int office_hours;
    private String rank;

    Faculty(){
        super();
        office_hours = 12;
        rank = "Manager";
    }

    public void display(){
        super.display();
        System.out.println("Office Hours: " + office_hours + "\nRank: " + rank ); }
}

//"----------------------------------------------------------------------------------------------"
class Staff extends Employee{
    private String title;

    Staff(){
        super();
        title = "Dean";
    }

    public void display(){
        super.display();
        System.out.println("Title: " + title); }
}
//"----------------------------------------------------------------------------------------------"
public class Task1 {
    public static void main(String[] args) {
        System.out.println("-----Person Class Running-----");
        Person p1 = new Person();
        p1.display();
        System.out.println("-----Student Class Running-----");
        Student s1 = new Student();
        s1.display();
        System.out.println("-----Employee Class Running-----");
        Employee e1 = new Employee("John Doe", "123567890", "123 Main St", "john.doe@gmail.com", "Sales", 50000.0);
        e1.display();
        System.out.println("-----Faculty Class Running-----");
        Faculty f1 = new Faculty();
        f1.display();
        System.out.println("-----Staff Class Running-----");
        Staff S1 = new Staff();
        S1.display();
;

    }
}
