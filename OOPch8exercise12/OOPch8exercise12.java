/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopch8exercise12;

/**
 *
 * @author Dean Dixon 3/22/2017
 */

public class OOPch8exercise12 {

    public static void main(String[] args) {
        //creates Date object, instantiated to December 30, 2017
        DateAndTime calendar = new DateAndTime(12,31,2017,23,59,58);
        
        //increments the date by 1 week
        for(int i = 0;i<65;i++)
        {
            calendar.tick();
        }
        
    }
    
}
