
public class ATM {
	
	private BankAccount bankAcc;
	
	public ATM()
	{
		bankAcc = new BankAccount(500);
	}
	
	public void handleTransactions()
	{
		try
		{
			bankAcc.withdraw(600);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try
		{
			bankAcc.quickWithdraw(600);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) 
	{
		ATM atm = new ATM();
		atm.handleTransactions();
	}

}
