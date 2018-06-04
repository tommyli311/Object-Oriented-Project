package employee;
//employee class
public class Employee {
    
	
	String employeeName;//employee's name
	int employeeSalary;// salary of employee
	private int employeeCommission;// amount of commission earned per a vehicle sold


//constructor, takes parameters of the employeeName, employeeSalary, employeeCommission
public Employee(String employeeName, int employeeSalary, int employeeCommission) {
	this.employeeName=employeeName;
	this.employeeSalary=employeeSalary;
	this.setEmployeeCommission(employeeCommission);

}

//getters and setters
public String getemployeeName() {
	return employeeName;
}
public String getemployeeName(String name, String Address) {
	return name + " I currently live at: "+ Address;
}
public void setemployeeName(String name) {
	this.employeeName=name;
}
public int getemployeeSalary() {
	return employeeSalary;
}
public void setemployeeSalary(int amount) {
	this.employeeSalary=amount;
}
public int getemployeeCommission() {
	return getEmployeeCommission();
}
public void setemployeeCommission(int amount) {
	this.setEmployeeCommission(amount);
}

public int getEmployeeCommission() {
	return employeeCommission;
}

public void setEmployeeCommission(int employeeCommission) {
	this.employeeCommission = employeeCommission;
}


}
