/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commission.calculator;
import java.util.Scanner;


public class CommissionCalculator {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int count = 1;
        double itemValue = 0;
        double totalSales = 0;
        double totalPay = 0;
        double commission = 0;
        int numberSold;
        
        
        System.out.print ("How many items did the employ sell? ");
        numberSold = input.nextInt();
        
        while (count <= numberSold)
        {
            System.out.print (count + ". Item price: $");
            itemValue = input.nextDouble();
            totalSales = totalSales + itemValue;
            count++;
        }
        commission = totalSales * 0.09;
        totalPay = commission + 200;
        
        System.out.println ("The total sold is: $" + totalSales);
        System.out.println ("The total commission is: $" + commission);
        System.out.println ("The employees pay is: $" + totalPay);
        
    }
    
}
