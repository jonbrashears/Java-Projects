/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package truck;
public class Truck {
    private int year; //Holds truck's year
    private double speed; //Holds truck's speed
    private String make; //holds truck's make
    
    //Contructor
    public Truck(int truckYear, double beginningSpeed, String companyName){
        year = truckYear;  //initializes year
        speed = beginningSpeed;  //initializes speed
        make = companyName; //initializes make
    }
    
    //Getters
    public int getYear(){
        return year;
    }
    
    public double getSpeed(){
        return speed;
    }
    
    public String getMake(){
        return make;
    }
    //Calculates acceleration
    public double acceleration(){
          return speed++;
    }
}
