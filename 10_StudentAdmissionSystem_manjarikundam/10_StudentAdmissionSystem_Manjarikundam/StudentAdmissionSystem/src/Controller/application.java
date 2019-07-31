package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Application;
import DAO.Applicationbean;
import DAO.select_students;
import hi.allotseat;

/**
 * Servlet implementation class application
 */
@WebServlet("/application")
public class application extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public application() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			Applicationbean ab = new Applicationbean();
			String applicant_no = request.getParameter("applicant_no");
			String name = request.getParameter("name");
			String board = request.getParameter("board");
			String p = request.getParameter("percentage");
			int percentage = Integer.parseInt(p) + 0;
			String gpa = request.getParameter("gpa");
			String school_name = request.getParameter("school_name");
			String dept_choice = request.getParameter("dept_choice");

			String a = new Application().insert(applicant_no, name, board, percentage, gpa, school_name, dept_choice);
			out.println(a);
			//ab.set_newapplication(applicant_no, name, board, percentage, gpa, school_name, dept_choice);

			if (percentage > 90)

			{
				out.println("your application in progress");
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

			else {
				System.out.println("else");
				new Application().insert(applicant_no, name, board, percentage, gpa, school_name, dept_choice);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
