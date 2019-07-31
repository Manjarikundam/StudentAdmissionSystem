package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class applicant_list {
public ResultSet getList() throws ClassNotFoundException, SQLException
{
	Dbase d = new Dbase();
	Connection conn = d.db();
	
	
Statement ps=conn.createStatement();
System.out.println("applicantlistdb");
 return ps.executeQuery("select * from applications order by  percentage desc");


}
}
