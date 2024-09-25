
public class BankAccount {

	
	private double balance;
	
	public BankAccount(double b)
	{
		balance = b;
	}
	
	public void withdraw(double w) throws NegativeBalanceException
	{
		if(w > balance)
		{
			throw new NegativeBalanceException(balance-w);
		}
		else
		{
			balance -= w;
		}
	}
}
