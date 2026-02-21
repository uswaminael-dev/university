package SmartDeviceSimulator;

public class Runner {
    public static void main(String  [] args){
        SmartDevice device1 = new SmartDevice();
        device1.showStatus();
        device1.increaseVolume();
        device1.decreaseVolume();
        device1.useApp();
        device1.charge();
        device1.batteryLevel = 78;
        device1.showStatus();
        device1.useApp();
        

    }
}
