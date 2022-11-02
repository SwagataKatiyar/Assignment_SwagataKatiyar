package CollectionInterfaceEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Array.Employee;

public class HashSetIterator {

	public static void main(String[] args) {
		

		Set<Employee> set = new HashSet<Employee>();
		
		Employee e1 = new Employee(1,"Swagata",50000,10);
		set.add(e1);
	
		set.add(new Employee(2,"Megha",6800,20));
		
		set.add(new Employee(3,"Tarun",7000,20));
		
		Employee e2 = new Employee(4,"Renu",15000,10);
		set.add(e2);
		
		Employee e3 = new Employee(4,"Renu",15000,10);
		set.add(e3);
		
	
		System.out.println("----Calling the Iterator----");
		
		
		   Iterator<Employee> itr = set.iterator();
	         
	         while(itr.hasNext())
	         {
	             Employee ex = itr.next();
	             System.out.println(ex.calcAnnSal());
	             System.out.println(ex);
	         }
	        
	         
	        System.out.println("----Calling the for-each METHOD with lambda function----");  
	
	        set.forEach(ex-> System.out.println(ex));
		
	}

}

