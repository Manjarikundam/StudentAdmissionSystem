package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class select_students {

	public void insert_data(String applicant_no,String name,String board,int percentage,String gpa,String school_name,String dept_choice,String alloted_dept) throws SQLException {
		
		System.out.println("entered");
		int i=0;
		try {
			Dbase d = new Dbase();
			Connection conn = d.db();
		PreparedStatement ps=conn.prepareStatement("insert into selected_students(applicant_no,name,board,percentage,gpa,school_name,dept_choice,alloted_dept) values(?,?,?,?,?,?,?,?)");
		ps.setString(1,applicant_no);
		ps.setString(2,name);
		ps.setString(3,board);
		ps.setInt(4,percentage);
		ps.setString(5,gpa);
		ps.setString(6,school_name);
		ps.setString(7,dept_choice);
		ps.setString(8,alloted_dept);
		i=ps.executeUpdate();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	
	
		
		
	}

}
