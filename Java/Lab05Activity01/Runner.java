package Lab05Activity01;

public class Runner {
public static void main(String args[]) {
    studentRecord s = new studentRecord();
    s.setDegree("MBA");
    employeeRecord e = new employeeRecord();
    e.setEmp_id(1);
    e.setSalary(25000);
    Manager m1 = new
    Manager("financeManager", 5000, e, s);
    m1.display();
    }

}
