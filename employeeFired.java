//creation of concrete classes that implement the same interface
public class employeeFired implements EmploymentStatus{

	@Override
	public void printEmploymentStatus() {
		System.out.println("Sorry because of your negative performance, You have been fired from this dealership.");
	}
}
