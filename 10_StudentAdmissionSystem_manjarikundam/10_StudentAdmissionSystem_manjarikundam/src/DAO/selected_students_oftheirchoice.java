package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class selected_students_oftheirchoice {
	public ArrayList<Applicationbean> choice( ) throws SQLException,ClassNotFoundException
	{
		 ArrayList<Applicationbean> al = new ArrayList<>();
		    Applicationbean ab= null;
		
		int flag=0;
		try {
			Dbase d = new Dbase();
			Connection conn = d.db();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select name,percentage,alloted_dept from selected_students where dept_choice=alloted_dept");
			
			   
			 ArrayList<String>  li2=new ArrayList();
				while(rs.next())
				{
					
					li2.add(rs.getString(1));
					
				}
				ab.setlist(li2);
			
			
			return al;
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	return null;
	}

}
