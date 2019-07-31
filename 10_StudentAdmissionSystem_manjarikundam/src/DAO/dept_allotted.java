package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class dept_allotted  {
public ResultSet ece() throws SQLException, ClassNotFoundException
{
	Dbase d = new Dbase();
	Connection conn = d.db();
	Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select count(name) from cse");

	return rs;
	
}
public ResultSet cse() throws SQLException, ClassNotFoundException
{
	Dbase d = new Dbase();
	Connection conn = d.db();
	Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select count(name) from ece");

	return rs;
	
}

public ResultSet it() throws SQLException, ClassNotFoundException
{
	Dbase d = new Dbase();
	Connection conn = d.db();
	Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select count(name) from it");

	return rs;
	
}
public ResultSet mech() throws SQLException, ClassNotFoundException
{
	Dbase d = new Dbase();
	Connection conn = d.db();
	Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select count(name) from mech");

	return rs;
	
}
}
