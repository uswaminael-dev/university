class Time{
    public int hour;
    public int minutes;
    public int seconds;
    public void display(){
        System.out.println("Current Time --> 0" + hour + ":" + minutes + ":" + seconds );
    }
    public void displayHour(){
        System.out.println(hour + " o'clock");
    }
    public void displayMinutes(){
        System.out.println( minutes + " minutes" );
    }
    public void displaySeconds(){
        System.out.println(seconds + " seconds " );
    }
}



public class TimeRun {
    public static void main(String [] args){
        Time t1 = new Time();
        t1.hour = 4;
        t1.minutes = 45;
        t1.seconds = 60;
        t1.display();
        t1.displayHour();
        t1.displayMinutes();
        t1.displaySeconds();
    }

}
