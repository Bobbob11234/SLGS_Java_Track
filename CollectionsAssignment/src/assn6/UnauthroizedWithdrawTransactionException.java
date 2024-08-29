package assn6;

public class UnauthroizedWithdrawTransactionException extends Exception
{
	public UnauthroizedWithdrawTransactionException()
	{
		super("The user is unauthorized for the withdraw");
	}
}
