/* Author: Jonathan Brashears
 * 5.29 Twelve Days of Christmas
 * Uses switches to print the lyrics to the Twelve Days of Christmas
 * 
 */
package thetwelvedaysofchristmas;

public class TheTwelveDaysOfChristmas{
    public static void main(String[] args){
        //Loop for counter and the beginning of each verse
        for(int counter=1; counter<=12; counter++){
            System.out.print("\nOn the ");
            
            //Switch for the different days
            switch(counter){
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default:
                    break;
            }
            System.out.print("day of christmas my true love sent to me\n");

            //Switch for displaying the different gifts.
            switch(counter){
                case 12:
                    System.out.print("Twelve Drummers Drumming\n");
                case 11:
                    System.out.print("Eleven Pipers Piping\n");
                case 10:
                    System.out.print("Ten Lords a-Leaping\n");
                case 9:
                    System.out.print("Nine Ladies Dancing\n");
                case 8:
                    System.out.print("Eight Maids a-Milking\n");
                case 7:
                    System.out.print("Seven Swans a-Swimming\n");
                case 6:
                    System.out.print("Six Geese a-Laying\n");
                case 5:
                    System.out.print("Five Gold Rings\n");
                case 4:
                    System.out.print("Four Calling Birds\n");
                case 3:
                    System.out.print("Three French Hens\n");
                case 2:
                    System.out.print("Two Turtle Doves\n");
                case 1:
                    System.out.print("And a Partridge in a Pear Tree\n");
            }
        }
    }
}
