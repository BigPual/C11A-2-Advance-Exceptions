import java.io.PrintWriter;

public class NegativeBalanceException extends Exception{
	
	private double negativeBalance;
	
	public NegativeBalanceException()
	{
		super("Error: negative balance");
		
	}
	
	public NegativeBalanceException(double d)
	{
		super("Amount exceeds balance by " + d);
		negativeBalance = d;
		try
		{
			PrintWriter writer = new PrintWriter("logfile.txt");
			writer.println("Amount exceeds balance by " + d);
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Log file failed to open");		}
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}

}
