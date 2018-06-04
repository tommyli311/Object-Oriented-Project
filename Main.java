import employee.Employee;
import carInventory.carInventory;
import customer.Customer;
import employeeRecognition.EmployeeRecognition;
import employeeRaise.EmployeeRaise;

//driver class
public class Main {
	
	//employeeRaise objects
	static EmployeeRaise John = new EmployeeRaise("John",67000,50);
    static EmployeeRaise Peter = new EmployeeRaise("Peter",34000,70);
    //car inventory objects
	static carInventory inventory= new carInventory();
	//employee objects, with parameters of the employee name, salary, and commission amount
	static Employee employee1= new Employee("John",67000,50);
	static Employee employee2= new Employee("Peter",34000,70);
   
	//customer objects, with parameters of customer name, customer budget, and customer credit score
	static Customer customer1= new Customer("Bob",1500, 200);
	static Customer customer2= new Customer("Mary",50000, 760);
	
	//singleton object, 
	static SingletonObject singletonObject= SingletonObject.getobjectInstance();
	//use of generics, takes 2 parameters each of the type string
	static EmployeeRecognition<String, String> employeeRecognition= new EmployeeRecognition<String, String>("I won employee of the month,", "I'm really excited");
	
	 //use of factory design pattern, objects of employeeFired and employeeKeepsJob, and calls the printEmploymentStatus method
	
	  static checkEmploymentStatus checkEmploymentStatus= new checkEmploymentStatus();
      static EmploymentStatus status1= checkEmploymentStatus.getEmploymentStatus("EMPLOYEE FIRED");
      static EmploymentStatus status2= checkEmploymentStatus.getEmploymentStatus("EMPLOYEE KEEPS JOB");
      
	public static void main (String[] args) {
		//call the printMessage method from the singleton design pattern class, output the message from the method
		singletonObject.printMessage();
		System.out.println();
		System.out.println("Hi my name is " + employee1.getemployeeName()+ ",I'm going to be your sales advisor, Welcome to New York Import Vehicles");
		/*static polymorphism, method overloading, first version of getemployeeName takes no parameters, print employee name, second version of it take parameters of name
		and employee address and prints both of them
		*/
		System.out.println("Hi my name again is " + employee1.getemployeeName("John", "33 Western Ave, Albany NY 12222"));
		//prints the customer's name, budget, and credit score
		System.out.println("My name is " + customer1.getcustomerName()+", my budget is "+customer1.getcustomerBudget() + " dollars and my credit score is: "+customer1.getcustomerCreditScore());
		System.out.println();
		//prints the type of vehicle the customer would like to purchase, along the price of the chosen model
		System.out.println("I would like to purchase a honda "+ "the price of the honda you chosen is " + inventory.HondaInventory[4]+ " dollars");
		//notifies the customer if they can afford the vehicle or not with or with financing
	    System.out.println(customer1.checkCustomerBudget());
	    
	    System.out.println();
	    System.out.println("Hi my name is " + employee2.getemployeeName()+ " I'm going to be your sales advisor, Welcome to New York Import Vehicles");
		//prints the customer's name, budget, and credit score
		System.out.println("My name is " + customer2.getcustomerName()+", my budget is "+customer2.getcustomerBudget() + " dollars and my credit score is: "+customer2.getcustomerCreditScore());
		//prints the type of vehicle the customer would like to purchase, along the price of the chosen model
		System.out.println("I would like to purchase a Tesla "+ "the price of the Tesla you chosen is " + inventory.TeslaInventory[3]+ " dollars");
	    System.out.println("Based on your budget "+ customer2.checkCustomerBudget());
	   
	  
	    System.out.println();
	    //prints the name of the employee, how much they made with commission
	    System.out.println(employee1.getemployeeName()+" made a total of "+ (employee1.getemployeeSalary()+employee1.getEmployeeCommission())+ " dollars, including commission");
	    //prints if they are eligible for a raise or not, if eligible, it also returns the new salary with the raise included.
	    //prints the values of the supplied parameters in the employeeRecogition object
	    employeeRecognition.showRecognition();
	    System.out.println(John.calculateEmployeeRaise());
	    //prints the employment of status of the employee using the factory design pattern
	    status2.printEmploymentStatus();
	    System.out.println();
	    //prints the name of the employee, how much they made with commission
	    System.out.println(employee2.getemployeeName()+" made a total of "+ (employee2.getemployeeSalary()+employee2.getEmployeeCommission())+ " dollars, including commission");
	    //prints if they are eligible for a raise or not, if eligible, it also returns the new salary with the raise included.
	    System.out.println(Peter.calculateEmployeeRaise());
	    //prints the employment of status of the employee using the factory design pattern
	    status1.printEmploymentStatus();

	}
	
	}
	

	

