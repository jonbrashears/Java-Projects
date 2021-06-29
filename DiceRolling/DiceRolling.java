/*Author: Jonathan Brashears

 */
package dicerolling;

import java.util.Random;

public class DiceRolling {

    private static final Random randomNumbers = new Random();

    public static void main(String[] args) {
        int face; //most recently rolled value
        int[] table = new int[12]; //array to hold values

        for (int counter = 1; counter <= 36000; counter++) {
            //adds 2 dice rolls together
            face = (1 + randomNumbers.nextInt(6)) + (1 + randomNumbers.nextInt(6));
            //tracks number of rolls
            table[11] = counter;
            //switch to count each time a number is rolled
            switch (face) {
                case 2:
                    table[0]++;
                    break;
                case 3:
                    table[1]++;
                    break;
                case 4:
                    table[2]++;
                    break;
                case 5:
                    table[3]++;
                    break;
                case 6:
                    table[4]++;
                    break;
                case 7:
                    table[5]++;
                    break;
                case 8:
                    table[6]++;
                    break;
                case 9:
                    table[7]++;
                    break;
                case 10:
                    table[8]++;
                    break;
                case 11:
                    table[9]++;
                    break;
                case 12:
                    table[10]++;
                    break;

            }
        }
        
        //prints the array
        for ( int i = 0; i < 11; i++ )
            System.out.printf( "Number of%5d's rolled:%8d\n", i + 2, table[i] ); 
        System.out.printf("Total rolls:%8d\n", table[11]); //prints total number of rolls
        
    }

}
