package DAO;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Application{
	public String insert(String applicant_no,String name,String board,int percentage,String gpa,String school_name,String dept_choice) throws SQLException,ClassNotFoundException
	{
		try {
		Dbase d = new Dbase();
		Connection conn = d.db();
		//Scanner sc = new Scanner(System.in);
		PreparedStatement pst = conn.prepareStatement("insert into applications(applicant_no,name,board,percentage,gpa,school_name,dept_choice) values(?,?,?,?,?,?,?)");  
		pst.setString(1, applicant_no);
	    pst.setString(2, name);
		pst.setString(3, board);
		pst.setInt(4, percentage);
		pst.setString(5, gpa);
		pst.setString(6, school_name);
		pst.setString(7, dept_choice);
		pst.executeUpdate();
		
		}
	catch (Exception e) {
		System.out.println(e);
	}
		return name;
			
	 
	 
 }


}
