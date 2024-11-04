package in.ashokit;

class Creditcard  implements IPayment{

	public  Creditcard()
	{
		System.out.println("debitcard constructor");
	}
	
	@Override
	public boolean paybill(long amt) {
		// TODO Auto-generated method stub
		System.out.println("credit card called");
		return true;
		
	}

}
