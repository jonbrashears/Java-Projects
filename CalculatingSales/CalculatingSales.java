/*Jonathan Brashears
 * 2/8/2017
 * Takes order from user and determines the total
 */
package calculatingsales;
import java.util.Scanner;

public class CalculatingSales {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int counter = 1;    //counter
        int quantity = 0;   //number sold
        int product = 0;    //which product you're buying
        double total = 0;   //total
        
        while(counter < 6)
        {
            System.out.printf("Order #%d\n", counter);  //display how many orders you've placed
            System.out.println("Please enter the product number: "); //gets product number from user
            product = sc.nextInt();
            
            //checks for valid item
            while(product>5||product<1)
            {
                System.out.println("Please enter a valid product number: ");  //gets product number from user
                product = sc.nextInt();
            }
            //asks user for quantity
            System.out.println("Please enter the quanity sold: ");
            quantity = sc.nextInt();
            
            switch(product) 
            {
                case 1: total += (2.98*quantity);   //value of product 1
                        break;
                case 2: total += (4.50*quantity);   //value of product 2
                        break;
                case 3: total += (9.98*quantity);   //value of product 3
                        break;
                case 4: total += (4.49*quantity);   //value of product 4
                        break;
                case 5: total += (6.87*quantity);   //value of product 5
                        break;
            }
            counter++; //increments counter
        }
        System.out.println("Your total: " +total);  //displays total
        
    }
    
}
