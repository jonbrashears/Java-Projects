/* Jonathan Brashears
 * 2/1/2017
 * This program will accept 3 numbers from the user and perfroms various
 * mathematical operations with them
 */
package operations;

import java.util.Scanner;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int largest = 0;    //holds largest
        int smallest = 0;   //holds smallest
        int sum = 0;        //holds sum
        int average = 0;    //holds average
        int product = 0;    //holds product

        System.out.println("This program takes 3 numbers and performs mathematical\noperations with them.");

        //asks for and receives first number from user
        System.out.println("Please enter the fist number: ");
        int first = sc.nextInt();

        //asks for and receives second number from user
        System.out.println("Please enter the second number: ");
        int second = sc.nextInt();

        //asks for a nd receives thrid number from user
        System.out.println("Please enter the third number: ");
        int third = sc.nextInt();
        
        //checks for largest number
        largest = first;
        //compares first to second and updates largest
        if (largest < second) {
            largest = second;
        }
        //compares new largest to third and updates largest
        if (largest < third) {
            largest = third;
        }
        //checks for smallest number
        smallest = first;
        //compares first to second and updates smallest
        if (smallest > second) {
            smallest = second;
        }
        //compares new smallest to third and updates smallest
        if (smallest > third) {
            smallest = third;
        }
        
        sum = first + second + third;       //calculates sum    
        product = first * second * third;   //calculates product
        average = sum / 3;                  //calculates average
        
        //prints information
        System.out.println("The largest number: " + largest);
        System.out.println("The smallest number: " + smallest);
        System.out.println("The sum: " + sum);
        System.out.println("The product: " + product);
        System.out.println("The average: " + average);
    }
}
