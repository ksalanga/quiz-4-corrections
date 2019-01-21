import java.util.Scanner;

public class Fluid {
    @SuppressWarnings("null")
    public String fluidOunces(double ounces) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of pennies: ");
        pennies = s.nextDouble();
        double dollar = pennies / 100;
		    double quarter = pennies / 25;
		    double dime = pennies / 10;
		    double nickel = pennies / 5;
        
        if (ounces != Math.round(ounces)) {
            ounces = (Double) null;
        }
        
        String converted = dollar + " dollars, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels, and " + pennies + " pennies;
        System.out.println(converted);
        s.close();
        return converted;
    }

}
