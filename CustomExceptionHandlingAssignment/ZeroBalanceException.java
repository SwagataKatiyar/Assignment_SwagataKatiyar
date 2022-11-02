package customException;


public class ZeroBalanceException extends Exception {

	private double curBal;
	private double accNo;
	
	public ZeroBalanceException(double curBal,double accNo) {
		super();
		this.curBal = curBal;
		this.accNo = accNo;
	}
	
	@Override
	public String toString() {
	
		return "ZeroBalanceException [currBal=" + curBal + ", acctno=" + accNo + "]";
	}
	
}
