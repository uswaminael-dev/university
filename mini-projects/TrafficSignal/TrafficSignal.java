package TrafficSignal;

public class TrafficSignal {
    String color;
    int timer;


    public TrafficSignal(){
        color = "Red";
        timer = 60;
    }

    public TrafficSignal(String new_color, int new_timer){
        color = new_color;
        timer = new_timer;
    }
    public void changeColor(String new_color){
        color = new_color;
    }

    public void resetTimer(int new_timer){
        timer = new_timer;
    }

    public void showStatus(){
        System.out.println("Color: " + color);
        System.out.println("Timer: " + timer);
    }
}
