package Interface;

public class Axis implements SBI{

	@Override
	public void aadharMandatory() {
		System.out.println("aadhar added");
		
	}

	@Override
	public Boolean PanCardMandatory() {
		return true;
	}
	
	void LoanInterest() {
		System.out.println("Loan Approved");
	}


}
