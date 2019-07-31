package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Adminlogin {
	//public String name;

	

	public String check(String name,String password) throws SQLException,ClassNotFoundException
	{int flag=0;
		try {
			Dbase d = new Dbase();
			Connection conn = d.db();
			Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select name,password from admin");
		
		
		
		while(rs.next())
		{
			if(rs.getString(1).equals(name)&&rs.getString(2).equals(password) )
			{
			    flag = 1;
			   }
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		if(flag==1)
			return "admin";
		else
			return "error";
	
	}
}
