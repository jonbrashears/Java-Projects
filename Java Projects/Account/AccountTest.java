/*@author Jonathan Brashears
 *
 * 
 *
 */
package account;
import java.util.Scanner;

public class AccountTest {
    public static void main( String[] args )
    {
        Account account1 = new Account( 50.00 );
        Account account2 = new Account( -7.53 );
        
        System.out.printf( "account1 balance: %.2f\n",
                account1.getBalance());
        System.out.printf( "account2 balance: %.2f\n",
                account2.getBalance());
        
        Scanner input = new Scanner( System.in );
        double depositAmount;
        
        System.out.print( "Enter debit amount for account1: " );
        depositAmount = input.nextDouble();
        System.out.printf( "\nsubtracting %.2f account1 balance\n\n",
                depositAmount);
        account1.debit( depositAmount );
        
        System.out.printf( "account1 balance: %.2f\n",
                account1.getBalance() );
        System.out.printf( "account2 balance: %.2f\n",
                account2.getBalance() );
        
        System.out.print( "Enter debit amount for account2: " );
        depositAmount = input.nextDouble();
        System.out.printf("\nsubtracting %.2f to account2 balance\n\n",
                depositAmount);
        account2.debit(depositAmount);
        
        System.out.printf( "account1 balance: %.2f\n",
                account1.getBalance() );
        System.out.printf( "account2 balance: %.2f\n",
                account2.getBalance() );
        
    }
}
