package customException;

public class Account {
	private String AccountHolder;
	private int AccNo;
	private double balance;
	
	
	
	public Account(String accountHolder, int accNo, double balance) {
		super();
		AccountHolder = accountHolder;
		AccNo = accNo;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
		System.out.println("The account name was edited!");
	}
	
	
	public int getAccNo() {
		return AccNo;
	}

	public double getBalance() {
		return balance;
		
	}
	
	
	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}
	
	
	public double withdraw(double amt) throws InsufficientBalanceException,ZeroBalanceException {
		
		if(balance!=0) {
			if(amt <= this.balance )
		{
			this.balance = this.balance - amt;
			System.out.println("Current Balance is"+ this.balance+" after withdrawing amt:"+amt);
		}
		
		else
		{
			//System.out.println("Insufficient Balance: amt:"+amt+" is greater than your balance:"+this.balance);
			
			throw new InsufficientBalanceException(this.balance,amt,this.AccNo);
		}
	}
		else {
			throw new ZeroBalanceException(balance ,this.AccNo);
			
		}
		return amt;
	}
		

@override
	public String toString()
{
	return "Details:"+this.AccountHolder+","+this.AccNo+","+this.balance;
}
	
	
}
	


