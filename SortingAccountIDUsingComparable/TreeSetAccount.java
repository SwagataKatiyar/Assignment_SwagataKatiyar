package CollectionInterfaceEx;

import java.util.SortedSet;
import java.util.TreeSet;

import customException.Account;

public class TreeSetAccount {

	public static void main(String[] args) {
	  	
		  SortedSet<Account> set = new TreeSet<Account>(); //throws Exception
		     
	  		     
		        Account acc= new Account("Swagata Katiyar",103,34000.8,102);
				set.add(acc);
				
				
				Account acc1= new Account("Tarun Katiyar",101,56000.0,100);	
				set.add(acc1);
				
				Account acc3= new Account("Megha Katiyar",121,76000.0,100);	
				set.add(acc3);
				
				Account acc4= new Account("Shivendra Katiyar",191,90000.8,104);	
				set.add(acc4);
				
				Account acc5= new Account("Tarun Katiyar",101,56000.0,300);	
				set.add(acc5);
				

				Account acc6= new Account("Renu Katiyar",111,89000.6,105);	
				set.add(acc6);
		
			
		        System.out.println(set.size());
		    	System.out.println(set);

	}

}
