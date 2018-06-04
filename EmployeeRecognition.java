package employeeRecognition;

//use of generics in this class
public class EmployeeRecognition<T,H>{

	T object1; //an object of type t
	H object2;//an object of type H

	//constructor
	public EmployeeRecognition( T object1, H object2){
		this.object1=object1;
		this.object2=object2;
	}
	
	//prints output of the supplied parameters, 
	public void showRecognition()
	{
	 System.out.println(object1);
	 System.out.println(object2);
	}
}
