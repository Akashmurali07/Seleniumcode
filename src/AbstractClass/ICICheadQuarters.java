package AbstractClass;

public abstract class ICICheadQuarters implements RBI{  //Changed to abstract class so that we can run without an interface func too

	@Override
	public void aadharRequired() {
		
		System.out.println("AADHAR ADDED");
	}

	@Override
	public boolean licenseRequired() {
		
		return true;
	}

}
