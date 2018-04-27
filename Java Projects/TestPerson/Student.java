package testperson;

public class Student extends Person
{
    private final String status;    //holds status, is constant
    
    //constructor
    public Student(String name, String address, String phone, String email, String status)
    {
        super(name, address, phone, email); //superclass constructor
        this.status = status;
    }
    
    //getters
    public String getStatus()
    {
        return this.status;
    }
    
    //returns formatted student information
    @Override
    public String toString()
    {
        return String.format("Student:\nName: %s\t\tAddress: %s\t Phone: %s\t Email: %s\t Status: %s\n", 
                this.getName(), this.getAddress(), this.getPhone(), this.getEmail(), this.status);
    }
}
