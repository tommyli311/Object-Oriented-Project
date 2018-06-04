package employeeRaise;
import employee.Employee;

//this class inherits from the employee class
public class EmployeeRaise extends Employee {
     
	
//constructor, along with super() that calls the parent constructor
	public EmployeeRaise(String employeeName, int employeeSalary, int employeeCommission) {
		super(employeeName, employeeSalary, employeeCommission);

	}

	//this method calculates the employee raise, if the employee salary was less than 50000, then get a 15% raise, other they are not eligible for a raise.
	public String calculateEmployeeRaise() {
		  if(getemployeeSalary()<50000)  {
		   	  return "Your previous salary was: " + getemployeeSalary()+ " new Salary with the raise is "+ (getemployeeSalary()*1.15+ " dollars");
		      }
		    
		      else {
		    	  return "You make to much, sorry you are not eligible for a raise";
		      }
		      

	}
}