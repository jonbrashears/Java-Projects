package testperson;

public class Employee extends Person
{
    private String office;      //holds officer
    private myDate dateHired;   //holds date hired
    private double salary;      //holds salary
    
    //constructor
    public Employee(String name, String address, String phone, String email, String office, double salary, myDate date)
    {
        super(name, address, phone, email); //superclass constructor
        this.office = office;
        this.dateHired = date;
        this.salary = salary;
    }
    
    //setters
    public void setOffice(String office)
    {
        this.office = office;
    }
    
    public void setDate(myDate date)
    {
        this.dateHired = date;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    //getters
    public String getOffice()
    {
        return this.office;
    }
    
    public String getDate()
    {
        return dateHired.toString();
    }
    
    public double getSalary()
    {
        return this.salary;
    }
}
