/* Author: Jonathan Brashears
 * 4/28/2017
 *
 * This program creates a base class, person, with two subclasses, student and 
 * employee.  Employee is then extended into two subclasses, staff and faculty.
 * There is also an object myDate that holds the date hired of an employee
 * These objects hold information about a person.  This information is then
 * printed to the user.
 */
package testperson;


public class TestPerson {

    public static void main(String[] args) 
    {
        //declares a new Student
        Student student1 = new Student("Tom Jones", "123 Street St", "(123)123-4567", "email@gmail.com", "Junior");
        
        //declares a new date hired for faculty1
        myDate date1 = new myDate("May", 1,2013);
        //creates faculty1
        Faculty faculty1 = new Faculty("John Smith", "321 Avenue Ave", "(987)654-3210", "email@yahoo.com", "E 340", 65000.00, date1 ,"Professor", "M-F", "10:00 AM - 3:00 PM");
        
        //creates date hired for staff1
        myDate date2 = new myDate("June", 30, 2000);  
        
        //creates staff
        Staff staff1 = new Staff("James Madison", "321 Park Ave.", "(123)321-3210", "email@hotmail.com", "J 014", 35000.00, date2 ,"Help Desk Technician");
        
        
        System.out.print(student1.toString());  //displays student1 to user
        System.out.print(faculty1.toString());  //displays faculty1 to user
        System.out.print(staff1.toString());    //displays staff1 to user
    }
    
}
