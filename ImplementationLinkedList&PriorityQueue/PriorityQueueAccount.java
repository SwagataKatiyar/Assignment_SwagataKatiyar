package CollectionInterfaceEx;
import java.util.PriorityQueue;
import java.util.Queue;
import customException.Account;

public class PriorityQueueAccount {
	public static void main(String[] args) {
	  	
		  Queue<Account> q = new PriorityQueue<Account>();
		     
	  		     
		        Account acc= new Account("Swagata Katiyar",103,34000.8,102);
				q.offer(acc);
				
				
				Account acc1= new Account("Tarun Katiyar",101,56000.0,100);	
				q.offer(acc1);
				
				Account acc3= new Account("Megha Katiyar",121,76000.0,100);	
				q.offer(acc3);
				
				Account acc4= new Account("Shivendra Katiyar",191,90000.8,104);	
				q.offer(acc4);
				
				Account acc5= new Account("Tarun Katiyar",101,56000.0,300);	
				q.offer(acc5);
				

				Account acc6= new Account("Renu Katiyar",111,89000.6,105);	
				q.offer(acc6);
				
				    System.out.println("----Current size:----");
				    System.out.println(q.size()); 
				    System.out.println("----Element at top:----");
			        System.out.println(q.peek());
			        System.out.println("----The removed element----");
			        System.out.println(q.poll());
			        System.out.println("----After removing 1 element----");
			        System.out.println(q.size());
			        System.out.println("----The removed element----");
			        System.out.println(q.poll());
			        System.out.println("----After removing 2 element----");
			        System.out.println(q.size());

	}
}
