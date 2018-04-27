/* Jonathan Brashears
 * 2/8/17
 * This program will calculate Pythagorean triples up to 500
 */
package pythagorean;

public class Pythagorean 
{

    public static void main(String[] args) 
    {
        int a = 0;  //holds first side
        int b = 0;  //holds second side
        int c = 0;  //holds hypotenuse
        
        for(int i = 0; i <= 500; i++)
        {
            checkTriple(a++, b, c);
            for(int j = 0; j <= 500; j++)       //checks for triple while incrementing side a
            {
                checkTriple(a, b++, c);
                
                for(int k = 0; k <= 500; k++)   //checks for triple while incrementing side b
                {
                    checkTriple(a, b, c++);     //checks for triple while incrementing the hypotenuse
                }
                c = 0;      //resets the hypotenuse so it cannot go higher than 500  
            }
            b = 0;          //resets side b so it cannot go higher than 500
        }
    }
    
    //function for checking if a triple exists
    public static void checkTriple(int a, int b, int c)
    {
        //checks if a pythagorean triple exists
        if (Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2))
        {
            System.out.printf("%d\t\t%d\t\t%d\n", a,b,c); //prints sides if triple is found
        }
    }
}
