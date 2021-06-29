/* Jonathan Brashears
 * 3/1/17
 * Plays a game of craps and allows the user to place bets
 * 
 */
package crapsmod;
import java.util.Random;
import java.util.Scanner;

public class CrapsMod 
{
    private static final Random randomNumbers = new Random();   //random number generator
    
    private enum Status {CONTINUE, WON, LOST};  //tells program to display winning, losing, or to keep running
    //point values
    private static final int SNAKE_EYES = 2;    
    private static final int TREY = 3;
    private static final int SEVEN= 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    //scanner
        int myPoint = 0;                        //holds the users points
        int bankBalance = 1000;                 //default bank balance
        
        
        Status gameStatus;                      //new status
        System.out.printf("How much would you like to wager? (1 to %d)\n", bankBalance);    //asks the user how much they wish to wager
        int wager = sc.nextInt();               //gets wager from user
        
        //checks to make sure they user inputs a valid wager
        while (wager > bankBalance || wager < 1)
        {
            System.out.printf("Please enter a valid amount to wager. (1 to %d)\n", bankBalance);    //asks for wager again
            wager = sc.nextInt();               //gets wager
        }
        
        int sumOfDice = rollDice();
        
        switch(sumOfDice)
        {
            //winning status
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            //losing status
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            //continue other wise
            default:
                gameStatus = Status.CONTINUE;                   //sets the default game status
                myPoint = sumOfDice;                            //holds number of points earned
                System.out.printf("Point is %d\n", myPoint);    //displays points earned
                break;
        }
        while (gameStatus == Status.CONTINUE)
        {
            sumOfDice = rollDice();         //rolls dice and adds it to sum
            if(sumOfDice == myPoint)        //determines if you win based on points
            {               
                gameStatus = Status.WON;   //sets winning status  
            }
            else
                if(sumOfDice == SEVEN)          //determines if you lose based on rolling a 7
                {                   
                    gameStatus = Status.LOST;   //sets losing status                 
                }
        }
        
        if(gameStatus == Status.WON)
        {
            bankBalance += wager;                   //adds your won bet
            System.out.printf("Your new balance is: %d\n", bankBalance);    //displays new balance
            System.out.println("Player wins");      //lets the player know that they won
        }
        else
        {
            bankBalance -= wager;                           //subtracts wager if you lose
            System.out.printf("Your new balance is: %d\n", bankBalance); //displays balance after losing
            if (bankBalance == 0)                           //checks if players busts          
                System.out.println("Sorry, you busted!");   //tells player they busted
            System.out.println("Player loses");             //tells player they lose
        }
    }
    
    public static int rollDice()
    {
        int die1 = 1 + randomNumbers.nextInt(6);            //rolls 1 die
        int die2 = 1 + randomNumbers.nextInt(6);            //rolls second die
        
        int sum = die1 + die2;                              //finds sum of rolls
        
        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum); //tells the player what they rolled
        Chatter();                                          //calls chatter after each roll
        return(sum);                                        //returns the sum
    }
    public static void Chatter()
    {
        int chatter = 1 + randomNumbers.nextInt(4);         //randomly generates a number 1-4
        
        //switch that takes randomly generated number and displays the corresponding message
        switch(chatter)
        {
            case 1:
                System.out.println("Don't be chicken!");
                break;
            case 2:
                System.out.println("Maybe you should cash in your chips!");
                break;
            case 3:
                System.out.println("C'mon, take a chance!");
                break;
            case 4:
                System.out.println("Just a few more rolls!");
                break;
            
        }
    }
}
