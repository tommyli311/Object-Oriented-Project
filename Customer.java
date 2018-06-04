package customer;

import carInventory.carInventory;

//customer class, inherits from carInventory
public class Customer extends carInventory{

	String customerName;// customer's name
	int customerBudget;// customer's budget for the vehicle
	int customerCreditScore;// customer's credit score
	
//constructor, takes parameters of the customer's name, budget, and credit score
public Customer(String customerName, int customerBudget,int creditScore) {
	this.customerName=customerName;
	this.customerBudget=customerBudget;
	this.customerCreditScore=creditScore;
}
//getters and setters
public String getcustomerName() {
	return customerName;
}
public void setcustomerName(String name) {
	this.customerName=name;
}
public int getcustomerBudget() {
	return customerBudget;
}
public void setcustomerBudget(int amount) {
	this.customerBudget=amount;
}
public int getcustomerCreditScore() {
	return customerCreditScore;
}
public void setcustomerCreditScore(int score) {
	this.customerCreditScore=score;
}

//this method checks the customer to see if they can afford the vehicle with or with financing. 
public String checkCustomerBudget(){
	//loops through the available inventory for each car make
	 for(int i=0;i<(HondaInventory.length|TeslaInventory.length);i++) {
		/*checks if the vehicle chosen is greater than the customer budget, and their credit score is greater than 700
		 * they can afford the vehicle with financing
		 */
      if((HondaInventory[i]|TeslaInventory[i])>=getcustomerBudget() && getcustomerCreditScore()>700) {
   	  return "Customer can afford the vehicle, Loan has been approved.";
      }
      // if the vehicle is less than or equal to the customer budget, they can afford the vehicle without financing
      else if((HondaInventory[i]|TeslaInventory[i])<=getcustomerBudget()) {
    	  return "Congrulations on your new car purchase";
      }
      //otherwise if the customer can afford the vehicle with or without financing, notifies them that the financing was denied
      else {
   	   return "Sorry loan is been denied, Please choose another vehicle";
      }}
	return null;
}}
	

	 

