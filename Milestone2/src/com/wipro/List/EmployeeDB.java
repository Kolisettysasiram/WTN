package com.wipro.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.wipro.List.Employee;

public class EmployeeDB {
   ArrayList<Employee> EmployeeDB=new ArrayList<Employee> ();
   boolean addEmployee(Employee e)
   {
	  return EmployeeDB.add(e);
   }
   boolean deleteEmployee(int empId)
   {
	   boolean isRemoved = false;
		
		Iterator<Employee> it = EmployeeDB.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
   }
   String showPaySlip(int empId)
   {
	   Iterator<Employee> it = EmployeeDB.iterator();
		String s="";
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				s=s+"Pay slip of "+emp.empId+" "+emp.getEmpName()+" "+emp.getSalary();
			}
		}
		return s;
   }
   public Employee[] listAll() {
		Employee[] empArray = new Employee[EmployeeDB.size()];
		for (int i = 0; i < EmployeeDB.size(); i++)
			empArray[i] = EmployeeDB.get(i);
		return empArray;
	}
   
}
