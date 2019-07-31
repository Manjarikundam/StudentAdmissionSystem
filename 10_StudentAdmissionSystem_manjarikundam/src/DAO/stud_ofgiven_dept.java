package DAO;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class stud_ofgiven_dept {
	public ArrayList<Applicationbean> dept(String alloted_dept) throws SQLException,ClassNotFoundException
	{
		 ArrayList<Applicationbean> al = new ArrayList<>();
		    Applicationbean ab= null;
		    PreparedStatement pstmt =null;
		    ResultSet rs=null;
		   int flag=0;
		try {
			Dbase d = new Dbase();
			Connection conn = d.db();
			Statement stmt = conn.createStatement();
			
			 pstmt = (PreparedStatement) conn.prepareStatement(
					"select name,percentage,alloted_dept from selected_students where alloted_dept=?");

			
			pstmt.setString(1, alloted_dept);
			System.out.println("hi");
			 rs=pstmt.executeQuery();   
			 ArrayList<String>  li2=new ArrayList();
			while(rs.next())
			{
				
				li2.add(rs.getString(1));
				
			}
			ab.setlist(li2);
			System.out.println("print");
			return al;
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("null");
	return null;
	}

}
