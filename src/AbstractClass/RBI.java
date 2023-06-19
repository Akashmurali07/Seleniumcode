package AbstractClass;

public interface RBI {
	
	public void aadharRequired();
	
	public boolean licenseRequired();
	
	boolean licenseRequiredA(boolean a);
	
	
	default void pancardrequired() {   //default interface function
		
		System.out.println("PAN ADDED");
	}
	
	
	static boolean MedicalRequired() {  //static interface function
		
		return false;			
	}

}
