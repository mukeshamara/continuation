package com.service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.model.Employee;

public class EmployeeDAO {
      private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee emp)
	{
		String query="insert into employee values('"+emp.getEmpno()+"','"+emp.getName()+"','"+emp.getAddress()+"');";
		return jdbcTemplate.update(query);
	}
	
	public int delete(Employee emp)
	{
		String query="delete from employee where empno='"+emp.getEmpno()+"';";
		return jdbcTemplate.update(query);
	}
	
	public int update(Employee emp)
	{
		String query="update employee set empno='7' where empno='"+emp.getEmpno()+"';";
		return jdbcTemplate.update(query);
	}
	public void createTable()
	{
		String query="create table employee(empno int(11),name varchar(50),address varchar(50));";
		jdbcTemplate.execute(query);
		System.out.println("table created");
	}

	public boolean saveEmployee1(final Employee e){  
	    String query="insert into employee values(?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,e.getEmpno());  
	        ps.setString(2,e.getName());  
	        ps.setString(3,e.getAddress());  	              
	        return ps.execute();  
	              
	    }  
	    });  
	}

	public List<Employee> show()
	{
		List<Employee> l=new ArrayList<Employee>();		
		return l;
	}
}
