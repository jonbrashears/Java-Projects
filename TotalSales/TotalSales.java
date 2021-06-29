/* Author: Jonathan Brashears
 * 7.20 Total Sales:  Randomly generates 5 employees monthly sales and places
 * them into an array.  They are then displayed in tabular format along with each
 * employees total sales and the total sales for each product
 */
package totalsales;
import java.util.Random;

public class TotalSales {
    private static final int SALESPEOPLE = 4;
    private static final int NUM_OF_PRODUCTS = 5;
    private static final Random randomGenerator = new Random();
    // rows for each product
    private static int[][] arrSales = new int[NUM_OF_PRODUCTS][];

    public static void main(String[] args){

        //Creates columns for each salesperson
        for(int i=0; i<arrSales.length; i++){
            arrSales[i] = new int[SALESPEOPLE];
        }

        //Randomly generates last months sales and populates array
        for(int row=0; row<arrSales.length; row++){
            for(int column=0; column<arrSales[row].length; column++){
                arrSales[row][column] = randomGenerator.nextInt(9999);
            }
        }
        printTotals();
    }
    
    //Prints the employees and the array
    public static void printTotals(){
        System.out.printf("\t%7s%9s%9s%9s%8s\n","    Employee 1", "   Employee 2","   Employee 3","   Employee 4", "Total");

        int rowTotal = 0;
        int colTotal = 0;

        for(int row=0; row<arrSales.length; row++){
            System.out.printf("%4d\t", row + 1);
            rowTotal = 0;
            colTotal = 0;

            //Print columns and row totals (product)
            for(int column=0; column<arrSales[row].length; column++){
                System.out.printf("%12d ", arrSales[row][column]);
                rowTotal += arrSales[row][column];
            }
            System.out.printf("%9d", rowTotal);
            System.out.println();
        }

        //Print and calculate column totals (salespeople)
        System.out.printf("\n%8s ", "Total");

        for(int col=0; col<SALESPEOPLE; col++){
            for(int row=0; row<arrSales.length; row++){
                colTotal += arrSales[row][col];
            }
            System.out.printf("%11d  ", colTotal);
            colTotal = 0;
        }
        System.out.println();
    }
}
