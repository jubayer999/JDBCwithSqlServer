package io.riad.DAOImplementation;

import static org.junit.Assert.*;

import org.junit.Test;

import io.riad.model.Employee;

public class EmployeeDAOImpTest {

	EmployeeDAOImp empDao=new EmployeeDAOImp();
	
	@Test
	public void testAddEmployee() {
		
		Employee e=new Employee(1,"Riad",50000,"Uttara","jubayer@gmail.com");
		
		
		assertTrue(empDao.addEmployee(e));
		
		
	}

	@Test
	public void testDeleteEmployee() {
		
		
		assertTrue(empDao.deleteEmployee(1));
		
	}

	@Test
	public void testUpdateEmployee() {
		
		Employee e=new Employee(2,"Rahat",15000,"Uttara","jubayer999@gmail.com");
		
		assertTrue(empDao.updateEmployee(e));
		
		
	}

	@Test
	public void testShowEmployee() {
		assertTrue(empDao.showEmployee(2));
	}

	@Test
	public void testShowAllEmploies() {
		assertTrue(empDao.showAllEmploies());
	}
	
	@Test
	public void testFindMaxSalary() {
		
		
		assertTrue(empDao.findMaxSalary());
	}
	
	@Test
	public void testFindMinSalary() {
		
		
		assertTrue(empDao.findMinSalary());
	}
	
	@Test
	public void testFindSecondMaxSalary() {
		
		
		assertTrue(empDao.findSecondMaxSalary());
	}
	
	

}
