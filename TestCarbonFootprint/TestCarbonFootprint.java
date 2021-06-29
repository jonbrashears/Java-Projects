/* Author: Jonathan Brashears
 * 4/28/2017
 *
 * This program connects three objects, Building, Car, and Bicycle, and connects
 * them with the interface CarbonFootprint. The objects each take 2 variables
 * and use them to calculate a carbon footprint.  The objects are created in
 * an object array and displayed polymorphically to the user.
 */
package testcarbonfootprint;

public class TestCarbonFootprint {

    public static void main(String[] args) 
    {
        //Create 3 element CarbonFootprint array
        CarbonFootprint[] carbonProducer = new CarbonFootprint[3];
        
        carbonProducer[0] = new Building(40.0, 1.22);   //new building
        carbonProducer[1] = new Car(100, 0.9);          //new car
        carbonProducer[2] = new Bicycle(100, .05);      //new bicycle
        
        System.out.print("Carbon footprint processed polymorphically: \n\n");
        
        //loop for printing tostring of carbonProducer array members
        for(CarbonFootprint currentFootprint : carbonProducer)
        {
           System.out.print(currentFootprint.toString());
           System.out.print("\n");
        }
    }
    
}
