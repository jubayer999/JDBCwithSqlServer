package io.riad.DAO;

import java.sql.SQLException;

import io.riad.model.Employee;

public interface EmployeeDAO {
	
	public boolean addEmployee(Employee e);
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(Employee e);
	public  boolean showEmployee(int id);
	public boolean showAllEmploies();
	public boolean findMaxSalary();
	public boolean findMinSalary();
	
	public boolean findSecondMaxSalary();
	
		

}
