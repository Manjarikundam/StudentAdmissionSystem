package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mechanical_entry  {

	public boolean allot(String name, int percent) throws SQLException, ClassNotFoundException {
		int i=0;
		Dbase d = new Dbase();
		Connection conn = d.db();
		PreparedStatement ps=conn.prepareStatement("insert into cse values(?,?)");
		ps.setString(1, name);
		ps.setInt(2, percent);
		i=ps.executeUpdate();
		System.out.println("mechsegot");
		if(i==1) {
			return true;
		}
		else
		return false;
		
	}

}
