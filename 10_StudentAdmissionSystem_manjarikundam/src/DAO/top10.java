package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

public class top10 {
	

	public ArrayList<Applicationbean> top() throws SQLException,ClassNotFoundException
	{

		 ArrayList<Applicationbean> al = new ArrayList<>();
		    Applicationbean ab= null;
		
		int flag=0;
		try {
			applicant_list ap=new applicant_list();
			ResultSet rs=ap.getList();
			Statement stmt = rs.getStatement();
			ResultSet rs1 = stmt.executeQuery("select count(*) from applications");
			   rs1.next();
			   int i=rs1.getInt(1)/10;
			   
			int count=0;
			while(rs.next()) {
				System.out.println(rs);
				if(count==i)
				{
					break;
				}
				else
				{
					ab =  new Applicationbean();
					ab.setApplicant_no(rs.getString(1));
					ab.setName(rs.getString(2));
		            ab.setBoard(rs.getString(3));
					ab.setPercentage(rs.getString(4));
					ab.setGpa(rs.getString(5));
					ab.setSchool_name(rs.getString(6));
					ab.setDept_choice(rs.getString(7));
					al.add(ab);
							
				}
				count++;
			}
					
					
			
			return al;
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
	return null;
}}
