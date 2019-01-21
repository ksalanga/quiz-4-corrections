import java.util.Scanner;

public class Fluid {
    @SuppressWarnings("null")
    public String fluidOunces(double ounces) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of ounces: ");
        ounces = s.nextDouble();
        double W = 128/ounces;
        double X = 32/ounces;
        double Y = 16/ounces;
        double Z = 8/ounces;
        
        if (ounces != Math.round(ounces)) {
            ounces = (Double) null;
        }
        
        String converted = W + "gallons, " + X + "quarts, " + Y + "pints, " + Z + "cups";
        System.out.println(converted);
        s.close();
        return converted;
    }

}
