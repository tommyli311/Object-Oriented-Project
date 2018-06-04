
//generates objects of the concrete class based on the information provided.
public class checkEmploymentStatus {
 
	public EmploymentStatus getEmploymentStatus(String employmentStatus){
	if(employmentStatus==null) {
		return null;
	}
	if(employmentStatus.equalsIgnoreCase("EMPLOYEE FIRED")){
	   return new employeeFired();
	}
	else if(employmentStatus.equalsIgnoreCase("EMPLOYEE KEEPS JOB")) {
		return new employeeKeepsJob();
	}
	return null;
}
}