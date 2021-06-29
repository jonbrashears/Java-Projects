/*
 * Author: Jonathan Brashears
 * This program will ask the user to input a 5 digit number, then display the
 * number with spaces between each digit.
 */
package seperatingdigits;
import java.util.Scanner;

public class SeperatingDigits {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Asks the user to input the number
        System.out.print("Please enter a five digit number to seperate: ");
        int fiveDigits = sc.nextInt();
        while (fiveDigits < 10000 || fiveDigits > 99999  )
        {
            System.out.print("Your entry was not 5 digits.  Please enter a 5 digit number: ");
            fiveDigits = sc.nextInt();
        }
        //seperates the first digit
        int firstNum = fiveDigits/10000;
        
        //seperates the second digit
        int secondNum = fiveDigits%10000/1000;
        
        //seperates the third digit
        int thirdNum = fiveDigits%1000/100;
        
        //seperates the fourth digit
        int fourthNum = fiveDigits%100/10;
        
        //seperates the fifth digit
        int fifthNum = fiveDigits%10;
        
        //Prints the number with spaces between digits
        System.out.println(firstNum + " " + secondNum + " " + thirdNum + " " + fourthNum + " " +fifthNum);
    }
    
}
