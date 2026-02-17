class DemoCar{
    public String name;
    public String colour;
    public String model;
    public int speed ;
    public void display(){
        System.out.println(model + " model of " + name + " in " + colour + " moving in speed " + speed + " km/h");
    }

    public void accelerate(){
        if ((speed >= 0 )&& (speed <=250)) {
            speed ++;
        }
        System.out.println(speed + "km/h");
    }
    public void decelerate(){
        if ((speed >= 0 )&& (speed <=250)) {
            speed --;
        }
        System.out.println(speed + "km/h");
    }
    public void changeColour(String x){
        colour = x;
    }


}
public class Car {
    public static void main (String [] args){
        DemoCar car1 = new DemoCar();
        car1.name = "Audi";
        car1.colour = "White";
        car1.model = "2017" ;
        car1.speed = 50;
        DemoCar car2 = new DemoCar();
        car2.name = "Bugatti";
        car2.colour = "Black";
        car2.model = "2006";
        car2.speed = 150;
        car1.accelerate();
        car2.decelerate();
        car1.display();
        car2.changeColour("Dark blue");
        car2.display();

    }
}
