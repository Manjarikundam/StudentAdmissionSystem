package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class List_of_st_dept {
	public String list(String name,String dept_allotted) throws SQLException,ClassNotFoundException
	{
		try {
		Dbase d = new Dbase();
		Connection conn = d.db();
		//Scanner sc = new Scanner(System.in);
		PreparedStatement pst = conn.prepareStatement("select name from selected where dept_allotted=?");  
	    pst.setString(1, name);
		pst.setString(2, dept_allotted);
		pst.executeUpdate();
		
		}
	catch (Exception e) {
		System.out.println(e);
	}
		return name;
			
	 
	 
 }
}
