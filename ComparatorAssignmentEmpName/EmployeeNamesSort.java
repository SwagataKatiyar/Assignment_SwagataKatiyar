package CollectionInterfaceEx;
import java.util.Comparator;

import java.util.SortedSet;
import java.util.TreeSet;

import Array.Employee;

public class EmployeeNamesSort {
	public static void main(String[] args) {
		
	  	
		  Comparator<Employee> c= new ComparatorEmpNames();	
		  SortedSet<Employee> list = new TreeSet<Employee>(c); 
		  
		     Employee e1 = new Employee(11,"Swagata",12000,10);
		     Employee e2 = new Employee(2,"Megha",15000,10);
		     Employee e3 = new Employee(2,"Tarun",15000,10);
		     Employee e4 = new Employee(7,"Renu",13000,20);
		     Employee e5 = new Employee(11,"Swagata",12000,10);
		     
		     list.add(e1);
		     list.add(e2);
		     list.add(e3);
		     list.add(e4);
		     list.add(e5);
		     
		     System.out.println(list);
		     
		     
	}
}
