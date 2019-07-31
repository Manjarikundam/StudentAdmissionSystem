package hi;

import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.Cse_entry;
import DAO.Dbase;
import DAO.Ece_entry;
import DAO.It_entry;
import DAO.dept_allotted;
import DAO.mechanical_entry;

public class allotseat {
	  int cse, ece, it, mechanical, p = 1;
	String name;
	int percent;
	char[] li;

	public String get_seat(String name, int percentage, char[] li1) throws SQLException, ClassNotFoundException {
		System.out.println("alloteseats");
		this.li = li1;
		this.name = name;
		//this.percent = percentage;
		char department_choice = li1[0];
		//String s = null;
		dept_allotted depart = new dept_allotted();
		ResultSet rs = depart.cse();
		rs.next();
			this.cse = rs.getInt(1);

		ResultSet rs1 = depart.ece();
		rs1.next();
			this.ece = rs1.getInt(1);

		ResultSet rs2 = depart.it();
		rs2.next();
			this.it = rs2.getInt(1);

		ResultSet rs3 = depart.mech();
		rs3.next();
			this.mechanical = rs3.getInt(1);

		System.out.println(cse + ece + it + mechanical);

		String i = meth(department_choice);
		switch (i) {
		case "cse":
			return "cse";

		case "ece":
			return "ece";
			
		case "it":
			return "it";
			
		case "mechanical":
			return "mechanical";
	
		}
		return null;
	}
	public String meth(char department_choice) throws SQLException, ClassNotFoundException {

		switch (department_choice) {
		case 'c': {
			if (this.cse < 5) {
				boolean k = new Cse_entry().allot(name, percent);
				if (k) {
					System.out.println("you are alloted to cse department");
					return "cse";
				}
				break;
			} else {
				department_choice = li[p++];
				meth(department_choice);
			}
		}
		case 'e': {
			if (this.ece < 5) {
				System.out.println("ece");
				boolean k = new Ece_entry().allot(name, percent);
				if (k) {

					System.out.println("you are alloted to ece department");
					return "ece";
				}

				break;
			} else {
				department_choice = li[p++];// try all other
				meth(department_choice);

			}
		}
		case 'i': {
			if (this.it < 5) {
				System.out.println("it");
				boolean k = new It_entry().allot(name, percent);
				if (k) {
					System.out.println("you are alloted to it department");
					return "it";
				}

				break;
			} else {
				department_choice = li[p++];// try all other
				meth(department_choice);
			}
		}
		case 'm': {
			if (this.mechanical < 5) {
				System.out.println("mech");
				boolean k = new mechanical_entry().allot(name, percent);
				if (k) {
					System.out.println("you are alloted to mechanical department");
					return "mechanical";
				}

				break;
			} else {
				department_choice = li[p++];// try all other
				meth(department_choice);
			}
		}
		case 'd':
			break;

		default:
				
		}
		return "t";
		
	
	}
}
