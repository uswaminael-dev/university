package Lab8Activities;

public class CommissionEmployee extends Employee{
    private double grossSales; 
    private double commissionRate; 

    public CommissionEmployee( String first, String last, String ssn,double sales, double rate ){
        super( first, last, ssn );
        grossSales =sales ;
        commissionRate =rate;
    }

    @Override
    public double earnings(){
        return commissionRate * grossSales ;}
}
