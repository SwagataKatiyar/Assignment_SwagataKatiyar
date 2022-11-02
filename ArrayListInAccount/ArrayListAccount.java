package CollectionInterfaceEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ClassesObjects.Employee;
import customException.Account;
import customException.InsufficientBalanceException;
import customException.ZeroBalanceException;

public class ArrayListAccount {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		List<Account> Accountlist = new ArrayList<Account>();
		
		
		Account acc= new Account("Swagata Katiyar",103,34000.8);
		Accountlist.add(acc);
		
		
		Account acc1= new Account("Tarun Katiyar",101,56000.0);	
		Accountlist.add(acc1);
		
		Accountlist.add( new Account("Megha Katiyar",121,76000.0));
		Accountlist.add( new Account("Shivendra Katiyar",191,90000.8));
		Accountlist.add( new Account("Renu Katiyar",111,89000.6));
		System.out.println(Accountlist);
		
		System.out.println("The account holder name is: " +acc.getAccountHolder());
		System.out.println("The account number is: " +acc.getAccNo());
		System.out.println("The account balance is: " +acc.getBalance());

		
		System.out.println("Enter the correct name:");
		String name= sc.next();
		acc.setAccountHolder(name);
		
		
		System.out.println("Enter the deposit money:");
		double dep = sc.nextDouble();
		acc.deposit(dep);
		
		System.out.println("Enter the money for withdraw:");
		double wdr = sc.nextDouble();
		
		
		try {
			acc.withdraw(wdr);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		} catch (ZeroBalanceException e) {
			e.printStackTrace();
		}
		

		
        // Contains
		boolean isPresent = Accountlist.contains(new Account("Tarun Katiyar",101,56000.0));
		System.out.println("Account with Account number 101 is present or not??? =  "+isPresent);
		
		//
        System.out.println(acc==acc1);
        
        //Equals
		
		System.out.println(acc.equals(acc1));
	}

}

