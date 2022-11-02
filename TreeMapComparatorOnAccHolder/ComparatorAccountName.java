package CollectionInterfaceEx;

import java.util.Comparator;

import customException.Account;

public class ComparatorAccountName implements Comparator<Account> {

@Override
public int compare(Account acc1, Account acc2) {

System.out.println("The comparison between account holder 1: " + acc1.getAccountHolder()+ " & account holder 2: "+acc2.getAccountHolder());


return (acc1.getAccountHolder().compareTo(acc2.getAccountHolder()));
		
	}

}
