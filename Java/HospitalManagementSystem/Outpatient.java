package HospitalManagementSystem;

import java.util.Date;

public class Outpatient extends Patient {
    private int visitCount;
    private double visitCharge;

    public Outpatient(String name, int age, String disease, Date admissionDate, double visitCharge) {
        super(name, age, disease, admissionDate);
        this.visitCount = 1; 
        this.visitCharge = visitCharge;
    }


    public void addVisit() {
        visitCount++;
    }

    @Override
    public double generateBill() {
        double baseBill = visitCount * visitCharge;

        // Apply discounts
        if (isSeniorCitizen()) {
            baseBill *= 0.9; 
        }
        if (isLongTermPatient()) {
            baseBill *= 0.95; 
        }

        return baseBill;
    }

    public int getVisitCount() { return visitCount; }
    public double getVisitCharge() { return visitCharge; }

    @Override
    public String toString() {
        return "Outpatient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", admissionDate=" + admissionDate +
                ", visitCount=" + visitCount +
                ", visitCharge=" + visitCharge +
                '}';
    }
}



