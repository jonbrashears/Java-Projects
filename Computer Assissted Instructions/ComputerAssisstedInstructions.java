/*Author: Jonathan Brashears
* 6.35/6.36: Computer Assissted Instructions.
* Asks user a randomly generated multiplication question and then tells them if
* the answer they entered was correct
 */
package computer.assissted.instructions;

import java.util.Scanner;
import java.util.Random;

public class ComputerAssisstedInstructions {

    private static Random randomNumbers = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] digits = new int[2];  //Stores the random values
        char cont = 'y';  //Stores the user's preference to continue playing
        
        //Loops while the user wants to keep playing
        while(cont == 'y'){
            
            //Generates the random numbers used in each question
            digits[0] = (randomNumbers.nextInt(9));
            digits[1] = (randomNumbers.nextInt(9));
            
            while (true) {
            
                int flavorResponse = (randomNumbers.nextInt(4));
                System.out.printf("What is the product of %d times %d ", digits[0], digits[1]);
                
                //Runs if the response was correct.  Sends the random numbers the respsonse to the checkAnswer method
                if (checkAnswer(digits[0], digits[1], sc.nextInt())) {
                    
                    //Switch to randomly select a different response
                    switch (flavorResponse) {
                        case 0:
                            System.out.println("Very good!");
                            break;                            
                        case 1:
                            System.out.println("You're doing great!");
                            break;
                        case 2:
                            System.out.println("Fantastic!");
                            break;
                        case 3:
                            System.out.println("Awesome!");
                            break;
                    }

                } 
                //Else for if the answer is incorrect
                else {
                    
                    //Switch to randomly select a different response
                    switch (flavorResponse) {
                        case 0:
                            System.out.println("Incorrect. Please try again.");
                            continue;
                        case 1:
                            System.out.println("Nope. Try again.");
                            continue;
                        case 2:
                            System.out.println("Sorry. Give it another shot.");
                            continue;
                        case 3:
                            System.out.println("You'll get it next time.");
                            continue;
                    }
                }
                //Asks the user if they would like to keep playing
                System.out.print("Continue? (y/n) ");
                cont = sc.next().charAt(0);
                break;
            }
        }
    }
    
    //Determines if the answer entered was correct.  The 
    public static boolean checkAnswer(int x, int y, int answer) {
        return (answer == x * y) ? true : false;
    }

}
