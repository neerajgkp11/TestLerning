package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	
	
	public static void main(String[] args) {
		
		HashMap<Employee, String> hashMap=new HashMap<Employee, String>();
		
		hashMap.put(new Employee(1,"neeraj1","nec"), "neeraj1");
		hashMap.put(new Employee(2,"neeraj2","nec"), "neeraj2");
		hashMap.put(new Employee(3,"neeraj3","nec"), "neeraj3");
		hashMap.put(new Employee(4,"neeraj4","nec"), "neeraj4");
		hashMap.put(new Employee(5,"neeraj5","nec"), "neeraj5");
		
		Set<Employee> keySet=hashMap.keySet();
		
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
		//	System.out.println(employee.empId);
			System.out.println(hashMap.get(employee));
			System.out.println(employee);
		}
		
	}
}

