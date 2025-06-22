import java.util.Scanner;

/*This program takes two inputs from the user, the first is a starting tempurature
 * for a kilogram of water, the next is the target temperature for a Kilogram of
 * water. The program will output how many joules of heat it will take to reach
 * the target temperature from the initial temperature. The program does not
 * take into account any specifc heat of phase change.
 */

 //Declare the main class
public class WaterTempHeatCalc{
    public static void main(String[] args) {
        //initialize the scanner object 
        Scanner input = new Scanner(System.in);
        input.close();
        
        //Provide the User a Welcome Message
        String companyName = "Acme Random Things Calculators Inc.";
        String welcomeMsg = "You have initiated the SuperWamodyne Kilogram "
        + "of Water Heat Calculator (SWKGWHC)! \n This application is brought "
        + "to you by " + companyName + "!\n It will calculate the joules "
        + "required to raise a mass of water from one temperature to a target "
        + "temperature!...\n";
        System.out.println(welcomeMsg);

        //Get the starting temp
        String startTempMsg = "Enter a starting temperature in Degrees Celsius: ";
        System.out.print(startTempMsg);
        double startTemp = input.nextDouble();

        //Get the target temp
        String targetTempMsg = "Enter a target temperature in Degrees Celsius: ";
        System.out.print(targetTempMsg);
        double targetTemp = input.nextDouble();
        
        //Get the water mass
        String waterMassMsg = "Enter the mass of the water in Kilograms: ";
        System.out.print(waterMassMsg);
        double waterMass = input.nextDouble();

        //Calculate the heat required
        System.out.println("calculating...");
        double heat = waterMass*(targetTemp - startTemp)*4184;

        //Tell the user
        String returnMsg = "The Heat in Joules Required to bring " 
        + Double.toString(waterMass) + " of water from " 
        + Double.toString(startTemp) + " Degrees Celsius to " 
        + Double.toString(startTemp) + " Degrees Celsius is: "
        + Double.toString(heat) + " Joules";
        System.out.println(returnMsg);
    }
}