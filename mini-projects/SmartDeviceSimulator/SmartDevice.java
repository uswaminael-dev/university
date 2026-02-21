package SmartDeviceSimulator;

import java.util.Scanner;

public class SmartDevice {
    static Scanner sc = new Scanner(System.in);
    String brand = "IPhone";
    boolean isOn = true;
    int volume = 60;
    int batteryLevel = 8;
    boolean charge = true;

    {
        if(batteryLevel>=100){
            charge=false;
        }
    }

    public void powerOn(){
        if(isOn == false){
            isOn = true;}
    }

    public void powerOff(){
        if(isOn){
            isOn = false;}
    }

    public void increaseVolume(){
        if ((volume >=0) && (volume<=100)){
            volume ++;}
        System.out.println("Volume: " + volume);

    }

    public void decreaseVolume(){
        if ((volume >=0) && (volume<=100)){
            volume --;}
        System.out.println("Volume: " + volume);
    }

    public void useApp(){
        if(isOn){
            System.out.println("Opening Apps...");
        
        System.out.println("1 --> Facebook");
        System.out.println("2 --> Instagram");
        System.out.println("3 --> Twitter");
        System.out.println("4 --> Google");
        System.out.println("5 --> YouTube");
        System.out.println("Enter the app you want to use: ");
        sc.nextInt();}
    }

    public void charge(){
        if ((batteryLevel<=10)&&(charge=true)){
            System.out.println("Charging...");
            batteryLevel += 10;
        }
        if (batteryLevel==100){
            System.out.println("100% Charged");
        }
    }

    public void showStatus(){
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + isOn);
        System.out.println("Volume: " + volume);
        System.out.println("Battery Level: " + batteryLevel);
    }

    public void display(){

    }
}
