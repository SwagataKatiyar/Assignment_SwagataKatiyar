package customException;
import java.util.Scanner;

public class customExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account ob = new Account("Swagata Katiyar",1001,0);
		
		Scanner sc = new Scanner(System.in);
		String r;
		
		do
		{
			System.out.println("Enter the amt to withdraw in multiples of 1000:");
			double amt = sc.nextDouble();
			double bal;
			
			try
			{
//				bal = ob.getBalance();
			amt = ob.withdraw(amt);
			
			}catch(InsufficientBalanceException| ZeroBalanceException e)
			{
				System.out.println(e);
				break;
			}
			System.out.println("Do you wish to continue:(y/n):");
			 r =  sc.next();
			
			
		}while(r.charAt(0)=='y'||r.charAt(0)=='Y');

		
		sc.close();
		System.out.println("program ends here..");
	}
}


