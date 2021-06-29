/*Author: Jonathan Brashears
 *Tests Truck class
 *
 *
 */
package truck;
public class TruckTest {
    public static void main(String[] args){
        
        //sets year, speed, and make of 1st truck
        Truck truck1 = new Truck(1985, 45.0, "Toyota");
        printTruck(truck1); //prints truck 1's information
        
        //sets year, speed, and make of 2nd truck
        Truck truck2 = new Truck(1970, 50.0, "Ford");
        printTruck(truck2); //prints truck 2's information
        
        //Both trucks accelerate
        truck1.acceleration();
        truck2.acceleration();
        
        //displays change in speed after accelerating
        System.out.println("\nAfter accelerating:\n");
        printTruck(truck1);
        printTruck(truck2);
    }
    
    //format for display
    private static void printTruck(Truck truck){
        System.out.println("Year: " + truck.getYear() + " Speed: " + truck.getSpeed() + " Make: " + 
                truck.getMake());
    }
}
