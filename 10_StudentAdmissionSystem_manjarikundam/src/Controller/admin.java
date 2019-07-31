package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Appilcant_review;
import DAO.Applicationbean;
import DAO.applicant_list;
import DAO.selected_students;
import DAO.selected_students_oftheirchoice;
import DAO.stud_ofgiven_dept;
import DAO.top10;
import hi.Dept_entry;

/**
 * Servlet implementation class admin
 */
@WebServlet("/admin")
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public admin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;
		PrintWriter out = response.getWriter();
		String varname = request.getParameter("varname");
		//String status=request.getParameter("status");
		//String username=(String) session.getAttribute("username");
		//System.out.println(varname);
		if(varname.equals("applicant_review"))
		{
			try {
				ArrayList<Applicationbean> ab = new Appilcant_review().review();
				HttpSession session = request.getSession();
				session.setAttribute("arrayList", ab);
				rd = request.getRequestDispatcher("applicant_review.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}
		}
		else if(varname.equals("selected_students"))
		{
			try {
				ArrayList<Applicationbean> ab = new selected_students().select();
				HttpSession session = request.getSession(false);
				session.setAttribute("arrayList", ab);
				rd = request.getRequestDispatcher("selected_students.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		}

		else if(varname.equals("selected_oftheirchoice"))
		{
			try {
				ArrayList<Applicationbean> ab = new selected_students_oftheirchoice().choice();
				HttpSession session = request.getSession();
				session.setAttribute("arrayList", ab);
				rd = request.getRequestDispatcher("selected_student_ofchoice.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		}
		else if(varname.equals("stud_ofgiven_dept"))
		{
			try {

				rd = request.getRequestDispatcher("name.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		}
		else if(varname.equals("getnames"))
		{
			System.out.print("asdasd");
			String alloted = request.getParameter("alloted");
			ArrayList<Applicationbean> ab;
			try {
				ab = new stud_ofgiven_dept().dept(alloted);
				HttpSession session = request.getSession();
				session.setAttribute("arrayList", ab);
				session.setAttribute("depart",alloted);
				rd = request.getRequestDispatcher("stud_ofgiven_dept.jsp");
				rd.forward(request, response);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		else if(varname.equals("top10"))
		{
			try {
				ArrayList<Applicationbean> ab = new Appilcant_review().review();
				Appilcant_review ap = new Appilcant_review();
				int count = ap.getCount();
				HttpSession session = request.getSession();
				session.setAttribute("arrayList", ab);
				request.setAttribute("count", count);
				rd = request.getRequestDispatcher("top.jsp");
				rd.forward(request, response);

			} catch (Exception e) {

			}

		}
		
		else if(varname.equals("confirm"))
		{
			try {
				
				System.out.println("applicantlistad");
				ResultSet rs=new applicant_list().getList();
				
				while(rs.next())
				{   for(int k=1;k<=7;k++)
					System.out.println(rs.getString(k));
					String applicant_no = rs.getString(1);
					String name = rs.getString(2);
					String board =rs.getString(3);
					String p = rs.getString(4);
					int percentage=Integer.parseInt(p)+0;
					String gpa = rs.getString(5);
					String school_name = rs.getString(6);
					String dept_choice =rs.getString(7);

					new Dept_entry().entry(applicant_no,name,board, percentage,gpa,school_name, dept_choice);
				
				}
				out.println("confirmed all the hold students");

			} catch (Exception e) {
				e.printStackTrace();

			}

		}
		


	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
