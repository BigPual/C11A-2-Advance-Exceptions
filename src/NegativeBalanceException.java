
public class NegativeBalanceException extends Exception{
	
	private double negativeBalance;
	
	public NegativeBalanceException()
	{
		super();
		
	}
	
	public NegativeBalanceException(double d)
	{
		super();
		negativeBalance = d;
	}

}
