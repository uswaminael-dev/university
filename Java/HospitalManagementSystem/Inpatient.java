package HospitalManagementSystem;

import java.util.Date;

public class Inpatient extends Patient {
    private int roomNumber;
    private double dailyRoomCharge;

    public Inpatient(String name, int age, String disease, Date admissionDate, int roomNumber, double dailyRoomCharge) {
        super(name, age, disease, admissionDate);
        this.roomNumber = roomNumber;
        this.dailyRoomCharge = dailyRoomCharge;
    }

    @Override
    public double generateBill() {
        long currentTime = System.currentTimeMillis();
        long admissionTime = admissionDate.getTime();
        long daysAdmitted = (currentTime - admissionTime) / (1000 * 60 * 60 * 24) + 1; 
        double baseBill = daysAdmitted * dailyRoomCharge;

        
        if (isSeniorCitizen()) {
            baseBill *= 0.9; 
        }
        if (isLongTermPatient()) {
            baseBill *= 0.95; 
        }

        return baseBill;
    }

    public int getRoomNumber() { return roomNumber; }
    public double getDailyRoomCharge() { return dailyRoomCharge; }

    @Override
    public String toString() {
        return "Inpatient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", admissionDate=" + admissionDate +
                ", roomNumber=" + roomNumber +
                ", dailyRoomCharge=" + dailyRoomCharge +
                '}';
    }
}


