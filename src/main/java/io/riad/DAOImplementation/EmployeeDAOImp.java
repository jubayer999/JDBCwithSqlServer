package io.riad.DAOImplementation;

import java.sql.SQLException;

import io.riad.DAO.EmployeeDAO;
import io.riad.DBUtil.DBEmployeeOperation;
import io.riad.model.Employee;

public class EmployeeDAOImp implements EmployeeDAO{
	
	public boolean addEmployee(Employee e){
		
		boolean flag=false;
		try {
			flag=DBEmployeeOperation.addEmployeetoDB(e);
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return flag;
	}
	
	
	
	public boolean deleteEmployee(int id) {
		 boolean flag=false;
		try {
			flag=DBEmployeeOperation.deleteEmployeetoDB(id);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
	}
	
	
	
	
	public boolean updateEmployee(Employee e) {
		
		boolean flag=false;
		try {
			flag=DBEmployeeOperation.updateEmployeetoDB(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return flag;
	}
	
	
	
	public boolean showEmployee(int id) {
		
		 boolean flag=false;
		 
		 try {
			flag=DBEmployeeOperation.getEmployeefromDB(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return flag;
	}
	
	
	
	
	public boolean showAllEmploies() {
		boolean flag=false;
		
			try {
				
				flag=DBEmployeeOperation.showAllEmploies();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return flag;
		
		
	}
	
	public boolean findMaxSalary() {
		
		boolean flag=false;
		
		try {
			flag=DBEmployeeOperation.findMaxsal();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
		
		
	}
	
	public boolean findMinSalary() {
		
		boolean flag=false;
		
		try {
			flag=DBEmployeeOperation.findMinsal();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
		
		
	}

	public boolean findSecondMaxSalary(){
	
	boolean flag=false;
	
	try {
		flag=DBEmployeeOperation.findSecondMaxsal();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return flag;
	
	
}
	
	
	

	
	

}
