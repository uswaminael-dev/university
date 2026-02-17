class time {
    int hour;
    int minutes;
    int seconds;

    public time(){
        hour = 2;
        minutes = 30;
        seconds = 45;
    }

    public time(int hr , int min , int sec){
        if((hr>0) && (hr<25)){
            hour = hr;
        }
        else if((min>=0) && (hr<=60)){
            minutes = min;
        }
        else if((sec>=0) && (sec<=60)){
            seconds = sec;
        }
        else{
            System.out.println("Invalid Input!");
        }
        
        
    } 



    public void display(){
        System.out.print("Hours : " + hour);
        System.out.print("   Minutes : " + minutes);
        System.out.println("   Seconds : " + seconds);
    }
    
}

public class Runner8 {
    public static void main(String [] args){
        System.out.println("----1----");
        time t1 =  new time();
        t1.display();
        System.out.println("----2----");
        time t2 =  new time(23 , 45 , 00);
        t2.display();
    }
}
