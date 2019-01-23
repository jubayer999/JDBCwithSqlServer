package io.riad.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.riad.model.Employee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBEmployeeOperation {

	
	public static boolean addEmployeetoDB(Employee e) throws SQLException {
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		String sql = "INSERT INTO dbo.Employee_Riad VALUES (?, ?,?,?,?)";
		
		
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, e.getEmployee_id());
		statement.setString(2,e.getEmployee_name());
		statement.setInt(3, e.getEmployee_salary());
		statement.setString(4, e.getEmployee_address());
		statement.setString(5, e.getEmployee_email());
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			
			con.close();
		    log.info("A new user was inserted successfully!");
		    return true;
		}
		else 
			return false;
		
	}
	
	public static boolean getEmployeefromDB(int id) throws SQLException {
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		Employee e=new Employee();
		
		String sql = "SELECT * FROM dbo.Employee_riad where employee_id="+id;
		 
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		if (result.next()){
			e.setEmployee_id(result.getInt(1));
			e.setEmployee_name(result.getString(2));
			e.setEmployee_salary(result.getInt(3));
			e.setEmployee_address(result.getString(4));
			e.setEmployee_email(result.getString(5));
			
			System.out.println(e);
			
			con.close();
			return true;
		}
		
		else return false;
		
		//return e;
		
	}
	
	
	public static boolean  updateEmployeetoDB(Employee e) throws SQLException {
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		
		String sql = "UPDATE dbo.Employee_riad SET employee_name=?,employee_salary=?,employee_address=? ,employee_email=? WHERE employee_id=?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, e.getEmployee_name());
		statement.setInt(2, e.getEmployee_salary());
		statement.setString(3, e.getEmployee_address());
		statement.setString(4, e.getEmployee_email());
		
		statement.setInt(5, e.getEmployee_id());
		
		int  rowsUpdated = statement.executeUpdate();
		if (rowsUpdated >0) {
		    System.out.println("An existing user was updated successfully!");
		    con.close();
		    
		    return true;
		}
		else 
			return false;
		
	}
	
	
	
	public static boolean deleteEmployeetoDB(int id) throws SQLException {
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		
		String sql = "DELETE FROM dbo.Employee_riad WHERE employee_id=?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1,id );
		 
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A user was deleted successfully!");
		    con.close();
		    return true;
		}
		
		else return false;
		
	
		
	}
	
	public static boolean showAllEmploies () throws SQLException{
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		Employee e=new Employee();
		String sql = "SELECT * FROM dbo.Employee_riad";
		 
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(sql);
		//int check=statement.executeUpdate(sql);
		 int check=0;
		while (result.next()){
		   
			e.setEmployee_id(result.getInt(1));
			e.setEmployee_name(result.getString(2));
			e.setEmployee_salary(result.getInt(3));
			e.setEmployee_address(result.getString(4));
			e.setEmployee_email(result.getString(5));
			
			System.out.println(e);
			System.out.println("\n");
			check++;
		}
		con.close();
		
		if (check>0) {
				return true;
			
		}
		
		else 
			return false;

	}
	

	public static boolean findMaxsal() throws SQLException {
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		Employee e=new Employee();
		String sql = "SELECT max(employee_salary) FROM dbo.Employee_riad";
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		 int check=0;
			while (result.next()){
			   
			
				e.setEmployee_salary(result.getInt(1));
				
				
				System.out.println(e.getEmployee_salary());
				System.out.println("\n");
				check++;
			}
			con.close();
		
			if (check>0) {
				return true;
			}
			else 
			return false;
	}
	
	
public static boolean findMinsal() throws SQLException {
		
		DBConnection.getInstance();
		Connection con=DBConnection.getConnection();
		Employee e=new Employee();
		String sql = "SELECT min(employee_salary) FROM dbo.Employee_riad";
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		 int check=0;
			while (result.next()){
			   
			
				e.setEmployee_salary(result.getInt(1));
				
				
				System.out.println(e.getEmployee_salary());
				System.out.println("\n");
				check++;
			}
			con.close();
		
			if (check>0) {
				return true;
			}
			else 
			return false;
	}
	
public static boolean findSecondMaxsal() throws SQLException {
	
	DBConnection.getInstance();
	Connection con=DBConnection.getConnection();
	Employee e=new Employee();
	String sql = "SELECT max(employee_salary) FROM dbo.Employee_riad where employee_salary<(SELECT max(employee_salary) FROM dbo.Employee_riad)";
	
	Statement statement = con.createStatement();
	ResultSet result = statement.executeQuery(sql);
	
	 int check=0;
		while (result.next()){
		   
		
			e.setEmployee_salary(result.getInt(1));
			
			
			System.out.println(e.getEmployee_salary());
			System.out.println("\n");
			check++;
		}
		con.close();
	
		if (check>0) {
			return true;
		}
		else 
		return false;
}
	
	
	
}
