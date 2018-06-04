
//creation of concrete classes that implement the same interface
public class employeeKeepsJob implements EmploymentStatus {
	
	@Override
	public void printEmploymentStatus() {
		System.out.println("Because of your great performance, You get to keep your job.");
	}
}
