/* Jonathan Brashears
 * 2/8/2017
 *Creates a class for employees that gives each employee a first and last name,
 * a monthly salary, a yearly salary, and calculates a 10% raise
 */
package employee;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    //Constructor
    public Employee(String fName, String lName, double mSalary) {
        firstName = fName;
        lastName = lName;
        monthlySalary = mSalary;
    }
    
    //Setters
    public void setFirst(String firstName){
        firstName = firstName;
    }
    
    public void setLast(String lName){
        lastName = lName;
    }
    
    public void setMonthlySalary(double mSalary) {
        if(mSalary > 0.0)
            monthlySalary = mSalary;
        else
            monthlySalary = 0.0;
    }
    
    public void setRaise(){
        setMonthlySalary(monthlySalary = monthlySalary * 1.10);
    }
    
    //Getters
    public String getFirst(){
        return firstName;
    }
    public String getLast(){
        return lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    public double getYearlySalary(){
        return getMonthlySalary() * 12;
    }

    
}
