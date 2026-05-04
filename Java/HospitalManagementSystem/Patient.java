package HospitalManagementSystem;

import java.util.Date;

public abstract class Patient {
    protected String name;
    protected int age;
    protected String disease;
    protected Date admissionDate;

    public Patient(String name, int age, String disease, Date admissionDate) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.admissionDate = admissionDate;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDisease() { return disease; }
    public Date getAdmissionDate() { return admissionDate; }

    
    public abstract double generateBill();

    
    public boolean isSeniorCitizen() {
        return age > 65;
    }

    public boolean isLongTermPatient() {
        long currentTime = System.currentTimeMillis();
        long admissionTime = admissionDate.getTime();
        long daysDiff = (currentTime - admissionTime) / (1000 * 60 * 60 * 24);
        return daysDiff > 30;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", admissionDate=" + admissionDate +
                '}';
    }
}

