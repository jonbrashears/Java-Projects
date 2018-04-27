/* Jonathan Brashears
 * 2/8/2017
 * Conversts temperature from Celsius to Fahrenheit and Fahrenheit to Celius
 */
package temperature;
import java.util.Scanner;

public class Temperature {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int sentinel = 0;       //sentinel to see what to do
        int temperature = 0;    //holds temperature
        
        System.out.println("This program will convert temperature.");
        
        //loop to see if user wants to continue
        while(sentinel!=3)
        {
            System.out.println("Press 1 for Fahrenheit to Celsius");
            System.out.println("Press 2 for Celsius to Fahrenheit");
            System.out.println("Press 3 to quit");
            sentinel = sc.nextInt();    //user inputs choice
            
            //Checks if the user had a valid input
            while(sentinel>3||sentinel<1)
            {
                System.out.println("That is not a valid option");
                System.out.println("Press 1 for Fahrenheit to Celsius");
                System.out.println("Press 2 for Celsius to Fahrenheit");
                System.out.println("Press 3 to quit");
                sentinel = sc.nextInt();
            }
            
            //converts Fahrenheit to Celsius
            if(sentinel==1)  //Checks user's input
            {
                int celsius = 0;    //holds value after conversion
                System.out.println("Please enter a Fahrenheit value to convert: "); //asks for user input
                temperature = sc.nextInt(); 
                
                celsius = ((temperature-32)*5)/9; //conversion
                System.out.println("The temperature in Celius is " + celsius); //outputs conversion
            }
            
            //converts Celsius to Fahrenheit
            if(sentinel==2) //Checks user's input
            {
                int fahrenheit = 0; //holds value after conversion
                System.out.println("Please enter a Celius value to convert: "); //asks for user input
                temperature = sc.nextInt();
                
                fahrenheit = (((temperature*9)/5)+32); //conversion
                System.out.println("The temperature in Fahrenheit is " + fahrenheit); //ouputs conversion
            }
        }
    }
    
}
