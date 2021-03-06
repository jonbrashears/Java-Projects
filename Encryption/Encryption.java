/*Author: Jonathan Brashears
 *Encrypted a 4 digit number and prints the number after it is encrypted
 * 
 * 
 */
package encryption;
import java.util.Scanner;

public class Encryption {
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int number; //4 digit number variable
        
        //asks user to input a 4 digit number
        System.out.print ("Please enter a 4 digit number: ");
        number = sc.nextInt();
        
        //seperates the first digit
        int firstNum = number%10000/1000;
        
        //seperates the second digit
        int secondNum = number%1000/100;
        
        //seperates the third digit
        int thirdNum = number%100/10;
        
        //seperates the fourth digit
        int fourthNum = number%10;
        
        //adds 7 to each number
        firstNum = firstNum + 7;
        secondNum = secondNum + 7;
        thirdNum = thirdNum + 7;
        fourthNum = fourthNum + 7;
        
        //divides by 10 and finds remainder
        firstNum = firstNum % 10;
        secondNum = secondNum % 10;
        thirdNum = thirdNum % 10;
        fourthNum = fourthNum % 10;
        
        //prints numbers in encrypted order
        System.out.println ("Your encrypted number is: " + thirdNum+fourthNum+firstNum+secondNum); 
    }
    
}
