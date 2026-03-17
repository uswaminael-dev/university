package Lab05Task1;

public class Address {
   private String street;
   private String city;
   private String code;
   private String house;
   //constructors
    public Address() {
    }
    public Address(String st, String c, String cd, String h) {
         street = st;
         city = c;
         code = cd;
         house = h;
    }   
    //getters
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getCode() {
        return code;
    }
    public String getHouse() {
        return house;
    }
    //setters
    public void setStreet(String st) {
        street = st;
    }
    public void setCity(String c) {
        city = c;
    }
    public void setCode(String cd) {
        code = cd;
    }
    public void setHouse(String h) {
        house = h;
    }

    //instance methods
    public void display() {
        System.out.println("Street: " + street + "\nCity: " + city + "\nCode: " + code + "\nHouse: " + house);
    }


}
