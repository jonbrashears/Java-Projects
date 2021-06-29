package testperson;

public class Person 
{
    private String name;    //holds person's name
    private String address; //holds address
    private String phone;   //holds phone
    private String email;   //holds email
    
    //Constructor
    public Person (String name, String address, String phone, String email)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    //getters
    public String getName()
    {
        return this.name;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
}
