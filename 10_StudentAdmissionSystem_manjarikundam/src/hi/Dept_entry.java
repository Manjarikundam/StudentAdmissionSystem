package hi;

import java.sql.SQLException;

import DAO.Applicationbean;
import DAO.select_students;

public class Dept_entry {
public void entry(String applicant_no, String name, String board, int percentage, String gpa, String school_name,
		String dept_choice) throws ClassNotFoundException, SQLException{
	System.out.println("dept entry");
	Applicationbean ab = new Applicationbean();
	System.out.println("your application in progress");
	char li[] = { 'c', 'e', 'i', 'm' };
	char[] li1 = new char[5];
	System.out.println(dept_choice);

	switch (dept_choice) {
	case "cse":
		li1[0] = 'c';
		break;
	case "ece":
		li1[0] = 'e';
		break;
	case "it":
		li1[0] = 'i';
		break;
	case "mechanical":

		li1[0] = 'm';
		break;

	}
	for (int j = 1, k = 0; k < 4; k++) {

		if (li1[0] != li[k]) {
			li1[j++] = li[k];
		}
	}
	li1[4] = 'd';

	System.out.println(li1);
	String t = new allotseat().get_seat(name, percentage, li1);
	if (t != null) {
		ab.setalloted_dept(t);
		new select_students().insert_data(applicant_no, name, board, percentage, gpa, school_name,
				dept_choice, t);
		System.out.println("entered into selected");

	}

	
}


}
