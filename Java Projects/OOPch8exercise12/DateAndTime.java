/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopch8exercise12;

import static java.lang.System.*;

/**
 *
 * @author Dean Dixon 3/22/2017
 */

public class DateAndTime {
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    private int month;
    private int day;
    private int year;
    
    private int hour;
    private int minute;
    private int second;
    
    //constructors
    public DateAndTime(int theMonth, int theDay, int theYear)
    {   
        this(theMonth, theDay, theYear, 0, 0, 0);
        
    }
    public DateAndTime(int theMonth, int theDay, int theYear, int h)
    {
        this(theMonth, theDay, theYear, h, 0, 0);
    }
    public DateAndTime(int theMonth, int theDay, int theYear, int h, int m)
    {
        this(theMonth, theDay, theYear, h, m, 0);
    }
    public DateAndTime(int theMonth, int theDay, int theYear, int h, int m, int s)
    {
        month = checkMonth(theMonth);
        year = checkYear(theYear);
        day = checkDay(theDay);
        setTime(h,m,s);
    }
    public DateAndTime(int theMonth, int theDay, int theYear, DateAndTime calendar)
    {
        this(calendar.getHour(),calendar.getMinute(),calendar.getSecond());
    }
    
    //setters
    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h)
    {
        if(h >= 0 && h < 24)
            hour = h;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }
    public void setMinute(int m)
    {
        if(m >= 0 && m < 60)
            minute = m;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    public void setSecond(int s)
    {
        if(s >= 0 && s < 60)
            second = ((s >= 0 && s < 60)?s:0);
        else
            throw new IllegalArgumentException("second must be 0-59");
    }
    
    //Getters
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d",getHour(), getMinute(), getSecond());
    }
    public String toString()
    {
        return String.format("%d/%d/%d::%d:%02d:%02d %s",month, day, year,((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
                getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
    }
     
    public void tick()
    {
        if(second == 59)
        {           
            incrementMinute();
            
            second = 0;
        }
        else
            second++;
        out.printf("The next day is: %s\n", this);
    }
    
    public void incrementMinute()
    {
        if(minute == 59)
        {
            incrementHour();
            minute = 0;
        }
        else
            minute++;
    }
    
    public void incrementHour()
    {
        if(hour == 23)
        {
            nextDay();
            hour = 0;
        }
        else
            hour++;
    }
    
    private int checkMonth(int testMonth)
    {
        if(testMonth > 0 && testMonth <= 12)
            return testMonth;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }
    private int checkDay(int testDay)
    {
        if(testDay > 0 && testDay <= daysPerMonth[month])
            return testDay;
        
        if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            return testDay;
        
        throw new IllegalArgumentException("day out-of-range for the specified month and year");
    }
    private int checkYear(int testYear)
    {
        if(testYear > 0)
            return testYear;
        else
            throw new IllegalArgumentException("year must be a postive value");
    }

    
    public void nextDay()
    {
        if(month == 12 && day == 31)
        {
            month = 1;
            day = 1;
            year++;
        }
        else
        {
            day++;
        }
        out.printf("The next day is: %s\n", this);
    }
}
