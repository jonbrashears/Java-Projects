/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxpractice;
import java.util.Scanner;


public class MaxPractice {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //User instructions
        System.out.println("Enter 3 integers seperated by spaces.");
        double number1 = sc.nextDouble(); //first number
        double number2 = sc.nextDouble(); //second number
        double number3 = sc.nextDouble(); //third number
        
        //finds the maximum
        double Maximum = Math.max(number1, Math.max(number2, number3));
        
        //displays the maximum
        System.out.print("The maximum is: " + Maximum);
        
    }
    
}
