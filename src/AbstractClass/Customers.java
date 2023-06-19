package AbstractClass;

public class Customers {

	public static void main(String[] args) {
		
		
		ICICchennai chennaibranch = new ICICchennai(); //Creating object for the SubClass so that all functions can be accessed
		
		chennaibranch.aadharRequired(); //Calling the Interface Function
		
		boolean Custlicense = chennaibranch.licenseRequired(); //Calling the Interface function
		System.out.println("Custlicense = " + Custlicense );
		
		boolean licensecustA = chennaibranch.licenseRequiredA(false); //SubClass function
		System.out.println("booleancustA = " + licensecustA);
		
		
		RBI myRBI = new ICICchennai(); //Creating object for default and static direct interface function
		
		myRBI.pancardrequired(); //Calling for default interface function with object
		
		boolean staticoutput = RBI.MedicalRequired();  //Calling for static interface function with class
		System.out.println("StaticInterface = " + staticoutput);
					

	}

}
