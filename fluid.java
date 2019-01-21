public class Fluid {
	
	public static void main(String args[]) {
		System.out.print(fluidOunces(0));
	}
	
	public static String fluidOunces(double ounces) {
		if (ounces < 0) {
			return null;
		}
		double gallon = ounces/128;
		double quart = ounces/32;
		double pint = ounces/16;
		double cup = ounces/8;
		
		String message = gallon + " gallons, " + quart + " quarts, " + pint + " pints, and " + cup + " cups.";
		return message; 
	}
}

//ounces is guaranteed to be a double greater than or equal to 0. You method should calculate and return the number of gallons, quarts, pints, and cups than can be made from the original number of ounces. Fractional ounces should be ignored, but you cannot use typecasting.

//Return a String in the following format: "W gallons, X quarts, Y pints, and Z cups." W, X, Y, and Z should represent the values your method computed.
