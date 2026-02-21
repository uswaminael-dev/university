package TrafficSignal;

public class Runner {
    public static void main(String [] args){
        TrafficSignal signal1 = new TrafficSignal();
        signal1.showStatus();
        signal1.changeColor("Green");
        signal1.resetTimer(45);
        signal1.showStatus();
        TrafficSignal signal2 = new TrafficSignal("Yellow", 5);
        signal2.showStatus();
    }
}
