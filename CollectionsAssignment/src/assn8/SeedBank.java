package assn8;

public class SeedBank 
{
	public static void main(String args[])
	{
		BankFund seedBankFund=new BankFund(90000000);
		LoanTransaction loanTransactions[]=new LoanTransaction[100];
		for(int i=0;i<loanTransactions.length;i++)
		{
			loanTransactions[i]=new LoanTransaction(seedBankFund,(1000+i),250000);
		}
		
		for(int i=0;i<loanTransactions.length;i++)
		{
			Thread t=new Thread(loanTransactions[i]);
			t.start();
			
		}
	}
}
