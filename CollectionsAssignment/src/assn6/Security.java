package assn6;

import assn4.Customer;

public class Security 
{
	public void authorization(Account account, Customer customer) throws UnauthroizedWithdrawTransactionException{
		if(account.getCustomer().getCustomerId()!=customer.getCustomerId())
		{
			throw new UnauthroizedWithdrawTransactionException();
		}
	}
}
