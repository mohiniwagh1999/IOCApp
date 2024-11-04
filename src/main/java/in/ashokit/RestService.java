package in.ashokit;

public class RestService {
	public IPayment payment;
	public RestService()
	{
		System.out.println("rest service constructor");
	}
	
	public RestService(IPayment payment)
	{
		// <constructor-arg name="payment" ref="debit"></constructor-arg>
		System.out.println("rest constr service constructor");
		this.payment=payment;
	}
	
	public void setPayment(IPayment payment)
	{
		// <property name="payment" ref="credit"/>
		System.out.println("setter called");
		this.payment=payment;
	}
	
	public void makepayment(long amt)
	{
		boolean status=payment.paybill(amt);
		if(status==true)
		{
			System.out.println("payment success");
		}
		else
		{
			System.out.println("card declined!...");
		}
	}

}
