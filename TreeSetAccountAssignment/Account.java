package customException;


public class Account implements Comparable<Account>  {
	private String AccountHolder;
	private int AccNo;
	private int AccId;
	private double balance;
	
	
	
	public Account(String accountHolder, int accNo, double balance, int AccId) {
		super();
		AccountHolder = accountHolder;
		AccNo = accNo;
		this.AccId= AccId;
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

	public int getAccId() {
		return AccId;
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
		

	 @Override
	public String toString()
{
	return "Details:"+this.AccountHolder+","+this.AccNo+","+this.balance;
}
	  @Override
	 public boolean equals(Object obj)  //obj = e2
	    {
	        
	        System.out.println("Account's equal method comparing with AccId="+this.AccId+"and AccId="+((Account)obj).AccId);
	        if(obj instanceof Account)
	          return this.AccId== ((Account)obj).AccId;
	        else
	          return false;
	    }
	  
	
	    @Override
	    public int hashCode()
	    {
	        System.out.println("HashCode of this employee with empid:"+this.AccId+" is :"+this.AccId);
	        return this.AccId;
	        
	    }
	    //e1(empid=1)(prev).compareTo(e2(empid=2)(next));
	    
	    @Override
	    
	    public int compareTo(Account acc) {
	    	 System.out.println("CompareTo is called for: "+ this.AccId +"  and  " + acc.AccId);
	    	return this.AccId- acc.AccId; //if 0 it's duplicate 
	    	//reverse for desc
	    	//For string it changes int and compares
	    	
	    	
	    }
	
}
	


