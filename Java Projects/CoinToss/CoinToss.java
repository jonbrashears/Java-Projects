/*Author: Jonathan Brashears
* 6.29 Coin Tossing
* This program asks the user if they want to toss a coin. The program then
* displays how many times the coin has been flipped and how many of each side
* of the coin has come up.
 */
package cointoss;

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    
    
    private static final Random coinFlips = new Random();

    //Coin enum
    private enum Coin {HEADS, TAILS};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;  //counts number of flips
        int heads = 0;    //counts number of heads
        int tails = 0;    //counts number of tails
        
        //loop to keep playing
        while (true) {
            System.out.println("Would you like to toss the coin? Type 1 for yes or type 0 for no:");
            if (sc.nextInt() == 0) {
                break;
            }
            
            //keeps track of counters
            switch (flip()) {
                case HEADS:  //counts heads
                    heads++; 
                    counter++;
                    break;
                case TAILS:  //counts tails
                    tails++;
                    counter++;
                    break;
                default:
                    break;
            }
            
            //displays number of flips and how many of each side
            System.out.println(counter + "flips.");
            System.out.println("Heads: " + heads);
            System.out.println("Tails: " + tails);
        }

    }

    //Randomly flips coin
    public static Coin flip() {
        return (coinFlips.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
    }
}
