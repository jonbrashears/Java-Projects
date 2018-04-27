/* Jonathan Brashears
 * Tests the Employee Class
 * 
 * 
 */
package employee;


public class EmployeeTest{
    public static void main(String[] args){
        //First name, last name, and monthly salary of employee 1
        Employee employee1 = new Employee("Andy", "Dwyer", 200);
        printEmployee(employee1);
        
        //First name, last name, and monthly salary of employee 2
        Employee employee2 = new Employee("April", "Ludgate", 1200);
        printEmployee(employee2);

        System.out.println("\nAfter 10% raises:\n");
        // set raises of 10% and prints again
        employee1.setRaise();
        printEmployee(employee1);

        employee2.setRaise();
        printEmployee(employee2);

    }
    
    //Prints employees and original salary
    private static void printEmployee(Employee employee){
        System.out.printf("%s %s: $%.2f per year\n",
                employee.getFirst(), employee.getLast(),
                employee.getYearlySalary());
    }  
}
