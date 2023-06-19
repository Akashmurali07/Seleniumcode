package Interface;

public class Customer {

	public static void main(String[] args) {
		
		Axis myaxis = new Axis();  //Created Object and class(Axis) is main for all functions working
		
		myaxis.aadharMandatory();  //calling interface function
		
		Boolean Panresult = myaxis.PanCardMandatory();
		System.out.println(Panresult);  //calling and printing boolean value interface function
	
		myaxis.LoanInterest(); //Calling class function
		
		System.out.println(Axis.UPIlimit); //Printing the variable value in Interface
		
		
	}

}
