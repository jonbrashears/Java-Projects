/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;
import java.util.Scanner;

public class AirlineTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Airline flight = new Airline();
        String section = "economy";
        
        //Calls opening introdcution
        flight.printStart();

        while(flight.seatsAvailable()){
            flight.printMenu();
            int choice = sc.nextInt();

            if(choice == 1 || choice == 2)
                section = (choice == 1) ? "economy" : "first";
            else
                continue;

            flight.assignSeat(section);
        }
        System.out.println("\tThere are no available seats on this fight\n");
    }
}
