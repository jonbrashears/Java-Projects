/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8.pkg6;

public class Exercise86 {

    public static void main(String[] args) 
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        
        SavingsAccount.modifyInterestRate(0.04f);
        
        System.out.printf("Account 1 initial balance %s\n", String.format("%.2f",saver1.getSavingsBalance()));
        System.out.printf("Account 2 initial balance %s\n", String.format("%.2f",saver2.getSavingsBalance()));
        
        for(int i=0; i<12; i++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        
        System.out.print("Account 1: 12 months at 4% interest: ");
        System.out.println(String.format("%.2f",saver1.getSavingsBalance()));
        System.out.print("Account 2: 12 months at 4% interest: ");
        System.out.println(String.format("%.2f",saver2.getSavingsBalance()));
        
        SavingsAccount.modifyInterestRate(0.05f);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.print("Account 1: 1 month at 5% interest: ");
        System.out.println(String.format("%.2f",saver1.getSavingsBalance()));
        System.out.print("Account 2: 1 month at 5% interest: ");
        System.out.println(String.format("%.2f",saver2.getSavingsBalance()));
    }
    
}
