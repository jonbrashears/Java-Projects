/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;
import java.util.Scanner;

public class Airline {
    boolean[] arrSeats = new boolean[10];
    Scanner sc = new Scanner(System.in);

    //SETTERS
    //Assigns each class 5 seats
    public boolean assignSeat(String section){ //First class
        if(section == "first"){
            if(getFreeSeats(section) > 0){
                for(int i=0; i<5; i++){
                    if(arrSeats[i] == false){
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }
            }
        }else if(section == "economy"){
            if(getFreeSeats(section) > 0){ //Economy
                for(int i=5; i<arrSeats.length; i++){
                    if(arrSeats[i] == false){
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }

            }
        }
        //Chosen section is full. Asks for permission to move to other section.
        System.out.printf("All seats in \"%s\" are booked.\n", section);
        System.out.printf("Would you like to be moved to  \"%s\" (y/n)? ",
                (section == "first") ? "economy" : "first");

        if(sc.next().charAt(0) == 'y')
            assignSeat((section == "first") ? "economy" : "first");
        else
            System.out.println("\nNext flight leaves in 3 hours.\n");

        return false;
    }
    
    //GETTERS
    //Returns number of free seats in each section
    private int getFreeSeats(String section){
        int total = 0;
        if(section == "first"){
            //Assigns first class array section
            for(int i=0; i<5; i++){
                if(arrSeats[i] == false)
                    total += 1;
            }
        }else if(section == "economy"){
            //Assigns economy array section
            for(int i=5; i<arrSeats.length; i++){
                if(arrSeats[i] == false)
                    total += 1;
            }
        }
        return total;
    }
    //Checks to see if plane is full
    public boolean seatsAvailable(){
        //If there are empty seats return true
        for(boolean seat : arrSeats)
            if(seat == false)
                return true;

        //False if plane is full
        return false;
    }

    public void printStart(){
        System.out.println("\nWelcome to Java Airlines ticket reservation system.\n");
    }
    //Prints remaining number of seats
    public void printMenu(){
        System.out.printf("1. Economy class %s\n",
                (getFreeSeats("economy") > 0) ?
                "(" + Integer.toString(getFreeSeats("economy")) + ")" : "(full)");
        System.out.printf("2. First class %s\n",
                (getFreeSeats("first") > 0 ?
                 "(" + Integer.toString(getFreeSeats("first")) + ")" : "(full)"));

    }
    
    //Prints the boarding pass
    private void printBoardingPass(int seat){
        System.out.println("\nBoarding pass for Java Airlines.");
        System.out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",
                (seat < 5) ? "first" : "economy", seat + 1);
    }
    
}
