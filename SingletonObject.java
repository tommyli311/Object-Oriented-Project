//use of the singleton design pattern
public class SingletonObject {
    
	//creation of an object of Singleton object
	private static SingletonObject objectInstance= new SingletonObject();
	
	//constructor, it is set to private so that the class can't be instantiated.
	private SingletonObject() {}
	
	//get the only object available
	public static SingletonObject getobjectInstance() {
		return objectInstance;
	}
	
	public void printMessage() {
		System.out.println("Hi everyone, My is Tommy and I'm the owner of the largest car dealer, in New York City");
	}
}
