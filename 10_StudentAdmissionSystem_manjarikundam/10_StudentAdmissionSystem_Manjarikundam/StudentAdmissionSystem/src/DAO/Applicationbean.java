package DAO;

import java.util.ArrayList;

import Controller.*;

public class Applicationbean {
	static ArrayList<String> list1;
	String applicant_no;
	 static String name;
	String board;
	String percentage;
	String gpa;
	String school_name;
	String dept_choice;
	static String alloted_dept;
	
	public String getApplicant_no() {
		return applicant_no;
	}
	public void setApplicant_no(String applicant_no) {
		this.applicant_no = applicant_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Applicationbean.name = name;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getDept_choice() {
		return dept_choice;
	}
	public void setDept_choice(String dept_choice) {
		this.dept_choice = dept_choice;
	}
	
	public void setalloted_dept(String t) {
		this.alloted_dept=t;
		
	}
	public static String getalloted_dept() {
		return Applicationbean.alloted_dept;
		
	}
	public void setlist(ArrayList<String> list) {
		this.list1=list;
		
	}
	public ArrayList getlist() {
		
		return this.list1;
		
	}
	
}
