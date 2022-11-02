package CollectionInterfaceEx;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

import Array.Employee;
import customException.Account;


public class TreeMapAccountComparator {
	public static void main(String[] args) {
		
		    Comparator<Account> com = new ComparatorAccountName();	
		    SortedMap<Account,Integer> map = new TreeMap<Account,Integer>(com); //throws Exception
			
		     //Can't sort the Object Type by using equals() so we have to use comparable
		  
		    Account acc= new Account("Swagata Katiyar",103,34000.8,102);
			map.put(acc,acc.getAccId());
		
			 
			Account acc1= new Account("Tarun Katiyar",101,56000.0,100);	
			map.put(acc1,acc1.getAccId());
			
			Account acc2= new Account("Megha Katiyar",121,76000.0,100);	
			map.put(acc2,acc2.getAccId());
			
			Account acc3= new Account("Shivendra Katiyar",191,90000.8,104);	
			map.put(acc3,acc3.getAccId());
			
			Account acc4= new Account("Tarun Katiyar",101,56000.0,300);	
			map.put(acc4,acc4.getAccId());;
			

			Account acc5= new Account("Renu Katiyar",111,89000.6,105);	
			map.put(acc5,acc5.getAccId());
		
		    System.out.println("Sort names in ascending order of account names");			
			    
			System.out.println(map);
			
		     
		   
	  
      }
	

}