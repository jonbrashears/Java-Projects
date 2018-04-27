/*
 * Author: Jonathan Brashears
 * Homework 2.28
 * A program that asks the user to imput a radius and then uses that radius
 * to calculate the diameter, area and circumference of a circle with that 
 * radius
*/
package circlecalculations;
import java.util.Scanner;

public class CircleCalculations 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Ask user to imput the radius
        System.out.print("Please enter the radius: ");
        double radius = sc.nextDouble();
        
        //prints the diameter, 2 multiplied by the radius
        System.out.println("The diameter of the circle is: " +2*radius);
        
        //prints the area, pi multiplied by the radius squared
        System.out.println("The area of the circle is: " +Math.PI * (radius * radius));
        
        //prints the circumference, 2 multiplied by pi, multiplied by the radius
        System.out.println("The circumference of the circle is: " +Math.PI*2*radius);
    }
    
}
