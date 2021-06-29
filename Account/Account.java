/*Author: Jonathan Brashears
 * 
 * 
 * 
 */
package account;

public class Account {
    private double balance; //Stores balance
    
    //Constructor
    public Account(double initialBalance)
    {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }
    
   public void credit(double amount)
   {
       balance = balance + amount;
   }
   
   public void debit(double amount)
   {
       if (amount > balance)
           System.out.println("Debit amount exceeded account balance.");
       else
           balance = balance - amount;
   }        
   public double getBalance()
   {
       return balance;
   }
    
}
