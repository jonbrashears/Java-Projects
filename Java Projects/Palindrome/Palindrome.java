/* Jonathan Brashears
 * 2/8/2017
 * Takes a 5 digit number and checks if it is palindrome. 
 */
package palindrome;

import java.util.Scanner;

public class Palindrome {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
       
        
        //Asks the user to input the number
        System.out.print("Please enter a five digit number to check: ");
        int fiveDigits = sc.nextInt();
        
        //Checks to see if a 5 didit number was entered
        while(fiveDigits>99999||fiveDigits<10000)
        {
            System.out.println("You did not enter a five didit number. Please enter a 5 digit number.");
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
        
        //Checks for palindrome
        System.out.println(firstNum==fifthNum&&secondNum==fourthNum ? fiveDigits + " is a palindrome" : fiveDigits + " is not a palindrome");
    }
}   
