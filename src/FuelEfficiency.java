// CSC262 Programming in Java
// Mark Langston      5/9/2024
class FuelEfficiency {

    public static void main(String[] args) {
        // Display that tells user what the program does
        System.out.println("This program will allow you to input how many gallons");
        System.out.println("your fuel tank can hold, your mpg, and the price per gallon and tell");
        System.out.println("you the price for driving 100 miles and how far the car can");
        System.out.println("travel with a full tank of gas.");
        // line skip for cosmetics
        System.out.println();

        // Inputs with clear instructions
        double fuelTankSize = Double.parseDouble(System.console().readLine("Enter size of gas tank (numerical input only (floating point/double)): "));
        double milesPerGallon = Double.parseDouble(System.console().readLine("Enter miles per gallon (numerical input only (floating point/double)): "));
        double pricePerGallon = Double.parseDouble(System.console().readLine("Enter price per gallon (numerical input only (floating point/double)): "));
        // line skip for cosmetics
        System.out.println();

        // Calculations
        double costPer100Miles = (100 / milesPerGallon) * pricePerGallon;
        double distanceWithFullTank = fuelTankSize * milesPerGallon;

        // Outputs (monetary data formatted with dollar sign with two decimal places)
        System.out.printf("Cost per 100 miles: $%.2f\n", costPer100Miles);
        System.out.println("Distance with a full tank: " + distanceWithFullTank + " miles");
    }
}