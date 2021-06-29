package testperson;

public class Faculty extends Employee 
{
    private String rank;        //holds faculty rank
    private String officeDays;  //holds office days
    private String officeTime;  //holds officer hours
    
    //constructor
    public Faculty(String name, String address, String phone, String email, String office, double salary, myDate date, String rank, String days, String time)
    {
        super(name, address, phone, email, office, salary, date); //superclass constructor
        this.rank = rank;
        this.officeDays = days;
        this.officeTime = time;
    }
    
    //setters
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    
    public void setDays(String day)
    {
        this.officeDays = day;
    }
    
    public void setTime(String time)
    {
        this.officeTime = time;
    }
    
    //getters
    public String getRank()
    {
        return this.rank;
    }
    
    public String getDays()
    {
        return this.officeDays;
    }
    
    public String getTimes()
    {
        return this.officeTime;
    }
    
    //returns faculty's formatted information
    @Override
    public String toString()
    {
        return String.format("\nFaculty:\nName:\t%s\tAddress: %s\t Phone:\t%s\t Email: %s\t\nOffice: %s\t\tSalary: $%,2.2f\t Rank: %s\t Office Hours: %s, %s\nDate Hired: %s\n", 
                this.getName(), this.getAddress(), this.getPhone(), this.getEmail(), this.getOffice(), this.getSalary(), this.rank, this.officeDays, this.officeTime, this.getDate());
    }
}
