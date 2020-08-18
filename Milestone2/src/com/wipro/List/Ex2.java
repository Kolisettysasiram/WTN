package com.wipro.List;
import com.wipro.List.Employee;
import com.wipro.List.EmployeeDB;

public class Ex2 {

	public static void main(String[] args) {
EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Sai", "sai@gmail.com","M", 25000);
		Employee emp2 = new Employee(102, "Lohith", "lohith@gmail.com","F", 30000);
		Employee emp3 = new Employee(103, "John", "john@gmail.com", "M", 20000);
		Employee emp4 = new Employee(104, "Ram", "ram@gmail.com","M", 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		
		String k=empDb.showPaySlip(103);
		System.out.println(k);
	}

}
