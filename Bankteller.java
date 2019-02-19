
package ATM;

/**
 *
 * @author James F. Gibson Jr
 */
import java.util.Scanner;
public class Bankteller {

   
    public static void main(String[] args) {
        //Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);
        
        //Display options to the screen
       System.out.println("1.  Deposit");
        System.out.println("2.  Withdrawal");
        System.out.println("3.  Check Balance");
        System.out.println("4.  Exit");
        System.out.println();
       
        //Prompt for user input
        System.out.println("Please make a selection from the menu:");
        int selection =input.nextInt();

        //Display selection to screen
        System.out.println("You have chosen numer " + selection);
        
      //Close the scanner - Free resources and prevent memory leak
        input.close();
        
    }
}
