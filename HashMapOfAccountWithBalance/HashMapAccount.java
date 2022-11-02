package CollectionInterfaceEx;
import java.util.HashMap;
import java.util.Map;
import customException.Account;

public class HashMapAccount {
	 public static void main(String[] args) {
	        Map<Account,Double> map = new HashMap<Account,Double>();
	              
	        Account acc1= new Account("Swagata Katiyar",103,34000.8,102);
	        map.put(acc1,acc1.getBalance());
			Account acc2= new Account("Tarun Katiyar",101,56000.0,100);	
			 map.put(acc2,acc2.getBalance());
			Account acc3= new Account("Megha Katiyar",121,76000.0,100);
			 map.put(acc3,acc3.getBalance());
			Account acc4= new Account("Shivendra Katiyar",191,90000.8,104);
			 map.put(acc4,acc4.getBalance());
			Account acc5= new Account("Tarun Katiyar",101,56000.0,300);
			 map.put(acc5,acc5.getBalance());
			Account acc6= new Account("Renu Katiyar",111,89000.6,105);	
			 map.put(acc6,acc6.getBalance());
		
			 System.out.println("Contains Key :"+map.containsKey(new Account("Swagata Katiyar",103,34000.8,102)));
		     System.out.println("Contains Value of 76000.0:"+map.containsValue(76000.0));
		     System.out.println("The map is:");
		     System.out.println(map);

	        
	 }
}
