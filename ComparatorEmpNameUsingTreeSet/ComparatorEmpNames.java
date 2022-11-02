package CollectionInterfaceEx;

import java.util.Comparator;

import Array.Employee;

public class ComparatorEmpNames implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		System.out.println("Comparing e1 name " + e1.getEmpname() + "and e2 name "+ e2.getEmpname());
		return e1.getEmpname().compareTo(e2.getEmpname());
	}
	
}
