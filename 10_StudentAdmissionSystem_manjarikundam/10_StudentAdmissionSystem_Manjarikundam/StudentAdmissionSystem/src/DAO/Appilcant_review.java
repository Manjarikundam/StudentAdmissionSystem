package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

public class Appilcant_review {
	Dbase d = new Dbase();
	Connection conn;
	public ArrayList<Applicationbean> review( ) throws SQLException,ClassNotFoundException
	{
		
		 ArrayList<Applicationbean> al = new ArrayList<>();
		    Applicationbean ab= null;
		
		int flag=0;
		try {
			conn = d.db();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from applications");
			
			   
			ab =  new Applicationbean();
			 ArrayList<String>  li2=new ArrayList();
				while(rs.next())
				{
					
					li2.add(rs.getString(1));
					li2.add(rs.getString(2));
					li2.add(rs.getString(3));
					li2.add(rs.getString(4));
					li2.add(rs.getString(5));
					li2.add(rs.getString(6));
					li2.add(rs.getString(7));
					
					
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

	public int getCount() {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("select count(*) from applications");
					ResultSet rs = ps.executeQuery();
			rs.next();
			return rs.getInt(1);
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		return 0;
	}

}

