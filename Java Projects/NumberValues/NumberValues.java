/*
 * Author: Jonathan Brashears
 * This program will ask the user to input 5 numbers, then display the number of
 * positive, negative, and zero values.
 */
package numbervalues;
import java.util.Scanner;

public class NumberValues {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, //first number entered
               number2, //secdon number entered
               number3, //third number entered
               number4, //fourth number entered
               number5; //fifth number entered
        int positive = 0,
            negative = 0,
            zeros = 0;
        System.out.print("Enter the first number: "); //prompt
        number1 = input.nextDouble();  //get first number from user
        
        System.out.print("Enter the second number: "); //prompt
        number2 = input.nextDouble(); //get second number from user
        
        System.out.print("Enter the third number: "); //prompt
        number3 = input.nextDouble(); //get third number from user
        
        System.out.print("Enter the fourth number: "); //prompt
        number4 = input.nextDouble(); //get fourth number from user
        
        System.out.print("Enter the fifth number: "); //prompt
        number5 = input.nextDouble();  //get fifth number from user
        
        //Comparison for first number
        if (number1 > 0)
            positive++;
        if (number1 < 0)
            negative++;
        if (number1 == 0)
            zeros++;
        
        //comparison for second number
        if (number2 > 0)
            positive++;
        if (number2 < 0)
            negative++;
        if (number2 == 0)
            zeros++;
        
        //comparison for third number
        if (number3 > 0)
            positive++;
        if (number3 < 0)
            negative++;
        if (number3 == 0)
            zeros++;
        
        //comparison for fourth number
        if (number4 > 0)
            positive++;
        if (number4 < 0)
            negative++;
        if (number4 == 0)
            zeros++;
        
        //comparison for fifth number
        if (number5 > 0)
            positive++;
        if (number5 < 0)
            negative++;
        if (number5 == 0)
            zeros++;
        
        System.out.println("Positives: " +positive); //displays positives
        System.out.println("Negaives: " +negative); //displays negatives
        System.out.println("Zeros: " +zeros);       //displays zeros
    }
    
}
