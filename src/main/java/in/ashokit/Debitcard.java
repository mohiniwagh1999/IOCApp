package in.ashokit;

public class Debitcard  implements IPayment {

	
	public  Debitcard()
	{
		System.out.println("debitcard constructor");
	}
	@Override
	public boolean paybill(long amt) {
		System.out.println("debit card called");
		return true;
		
		
		
	}

}
