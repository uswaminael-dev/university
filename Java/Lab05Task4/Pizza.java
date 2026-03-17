package Lab05Task4;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    //constructors
    public Pizza() {
        size = "small";
        cheeseToppings = 0;
        pepperoniToppings = 0;
        hamToppings = 0;
    }
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        setSize(size);
        setCheeseToppings(cheeseToppings);
        setPepperoniToppings(pepperoniToppings);
        setHamToppings(hamToppings);
    }

    //setters
    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.out.println("Invalid size. Size must be small, medium, or large.");
        }
    }
    public void setCheeseToppings(int cheeseToppings) {
        if (cheeseToppings >= 0) {
            this.cheeseToppings = cheeseToppings;
        } else {
            System.out.println("Invalid number of cheese toppings. Please enter a non-negative value.");
        }
    }
    public void setPepperoniToppings(int pepperoniToppings) {
        if (pepperoniToppings >= 0) {
            this.pepperoniToppings = pepperoniToppings;
        } else {
            System.out.println("Invalid number of pepperoni toppings. Please enter a non-negative value.");
        }
    }
    public void setHamToppings(int hamToppings) {
        if (hamToppings >= 0) {
            this.hamToppings = hamToppings;
        } else {
            System.out.println("Invalid number of ham toppings. Please enter a non-negative value.");
        }
    }

    //getters
    public String getSize() {
        return size;
    }
    public int getCheeseToppings() {
        return cheeseToppings;
    }
    public int getPepperoniToppings() {
        return pepperoniToppings;
    }
    public int getHamToppings() {
        return hamToppings;
    }

    //instance methods
    public double calcCost() {
        double cost = 0;
        switch (size.toLowerCase()) {
            case "small":
                cost = 10;
                break;
            case "medium":
                cost = 12;
                break;
            case "large":
                cost = 14;
                break;
            default:
                System.out.println("Invalid size. Defaulting to small.");
                cost = 10;
        }
        cost += (cheeseToppings + pepperoniToppings + hamToppings) * 2;
        return cost;
    }

    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheeseToppings + ", Pepperoni Toppings: " + pepperoniToppings + ", Ham Toppings: " + hamToppings;
    }
}
