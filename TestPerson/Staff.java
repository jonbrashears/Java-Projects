
package testperson;


public class Staff extends Employee 
{
    private String title; //holds title
    
    //constructor
    public Staff(String name, String address, String phone, String email, String office, double salary, myDate date, String title)
    {
        super(name, address, phone, email, office, salary, date);   //superclass constructor
        this.title = title;
    }
    
    //setters
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    //getters
    public String getTitle()
    {
        return title;
    }
    
    //returns staff's formatted information
    @Override
    public String toString()
    {
        return String.format("\nStaff:\nName:\t%s\tAddress: %s\t Phone:\t%s\t Email: %s\t\nOffice: %s\t\tSalary: $%,2.2f\t Title: %s\t \nDate Hired: %s\n", 
                this.getName(), this.getAddress(), this.getPhone(), this.getEmail(), this.getOffice(), this.getSalary(), this.title, this.getDate());
    }
}
