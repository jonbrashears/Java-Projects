/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testperson;

public class myDate 
{
    private String month;   //holds month hired
    private int day;        //holds day hired
    private int year;       //holds year hired
    
    //constructor
    public myDate (String month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    //setters
    public void setMonth(String month)
    {
        this.month = month;
    }
    
    public void setDay(int day)
    {
        this.day = day;
    }
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    //getters
    public String getMonth()
    {
        return this.month;
    }
    
    public int getDay()
    {
        return this.day;
    }
    
    public int getYear()
    {
        return this.year;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %d, %d", this.month, this.day, this.year);
    }
}
