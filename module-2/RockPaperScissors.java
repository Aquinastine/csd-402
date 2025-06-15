import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/*This program takes one inputs from the user, a 1, 2, 3. These represent
Rock, Paper, and Scissors respectively. The computer also makes a random 
selection and then produces a message that displays the results of the game.
 */

 //Declare the main class
public class RockPaperScissors{
    public static void main(String[] args) {
        //initialize the scanner object 
        Scanner input = new Scanner(System.in);
        
        //Provide the User a Welcome Message
        String companyName = "Acme Random Games Inc.";
        printWelcomeMessage(companyName);

        //run the game in a loop
        String again = "y";
        while (again.equals("y")) {
            //Get the user input into a variable
            int userChoice = getUserInput(input);

            //Generate the computer choice
            int computerChoice = (int)(Math.random() * 3) + 1; // [1, 10];

            //Return the result to the user

            System.out.println("You chose " + translateChoice(userChoice));
            System.out.println("The Computer chose " + translateChoice(computerChoice));
            System.out.println("You " + scoreGame(userChoice,computerChoice));
            System.out.print("\n\n Do you want to play again (Y or N): ");
            again = input.next().toLowerCase();
            
        }

        




    }

    // Method to print the welcome message with the company name
    public static void printWelcomeMessage(String companyName) {
        String welcomeMsg = "You have initiated the SuperWamodyne Rock, Paper, "
                + "Scissors game (SWRPSG)!\nThis application is brought "
                + "to you by " + companyName + "!\nYou will be entertained for "
                + "hours with dazzling graphics, heart pounding action, and  "
                + "compelling plot lines. Pepare to have your mind blown!!\n";
        System.out.println(welcomeMsg);
    }

    //Get User Choice
    public static int getUserInput(Scanner input){
        //Prompt the user
        String message = "type 1, 2 or 3 for 1(Rock), 2(paper) or "
        + "3(Scissors): ";
        System.out.print(message);
        
        //Save the choice to a variable
        int choice = input.nextInt();

        //Define valid options
        List<Integer> validOption = Arrays.asList(1, 2, 3);

        //if the choice isn't ok run a loop to get a valid choice
        while (!validOption.contains(choice)) {
            String errMsg = "\n\nOops! You didn't enter a 1, 2, or 3!";
            System.out.println(errMsg);
            System.out.print(message);
            choice = input.nextInt();
        }
        
        //Return the choice
        return choice;
    }
    
    //Score the game
    public static String scoreGame(int playerChoice, int computerChoice) {
        // Unique combo (e.g., 1 and 2 → 12)
        int choices = playerChoice * 10 + computerChoice;  

        switch (choices) {
            case 11: return "Tied!";
            
            case 12: return "Lost!";

            case 13: return "Won!";

            case 21: return "Won!";
            
            case 22: return "Tied!";

            case 23: return "Lost!";

            case 31: return "Lost!";
            
            case 32: return "Won!";
        
            default: return "Tied!";
        }

    }

    //Return the correct choice string from an integer input
    public static String translateChoice(int choice) {
        switch (choice) {
            case 1: return "Rock";
            
            case 2: return "Paper";
        
            default: return "Scissors";
        }

    }
}