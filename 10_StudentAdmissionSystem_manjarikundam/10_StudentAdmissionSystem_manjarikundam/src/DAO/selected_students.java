package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class selected_students {
	public ArrayList<Applicationbean> select( ) throws SQLException,ClassNotFoundException
	{
		 ArrayList<Applicationbean> al = new ArrayList<Applicationbean>();
		    Applicationbean ab= null;
		    ArrayList<String> li1=new ArrayList();
		
		int flag=0;
		try {
			Dbase d = new Dbase();
			Connection conn = d.db();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select name,percentage,alloted_dept from selected_students");
			
			   
			
			while(rs.next())
			{
				li1.add(rs.getString(1));
				li1.add(rs.getString(2));
				li1.add(rs.getString(3));
				ab =  new Applicationbean();
				System.out.println(rs.getString(1));
				ab.setName(rs.getString(1));
				System.out.println(al.add(ab));
				System.out.println(ab.getName());
			}
			ab.setlist(li1);
			return al;
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	return null;
	}

}
