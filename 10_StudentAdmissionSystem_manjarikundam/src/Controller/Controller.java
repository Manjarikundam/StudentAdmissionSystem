package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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



import DAO.Adminlogin;
import DAO.Appilcant_review;
import DAO.Application;
import DAO.Applicationbean;
import DAO.Dbase;
//import database.dbase;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		
			try {
				String name = request.getParameter("name");
				String password = request.getParameter("password");
				
				// HttpSession session = request.getSession();

				String a = new Adminlogin().check(name, password);
				if (a.equals("admin")) {
					rd = request.getRequestDispatcher("functions.jsp");
					rd.forward(request, response);
					out.println("admin");
				} else {
					HttpSession session=request.getSession();
					session.setAttribute("status", "wrong inputs");
					response.sendRedirect("login.jsp");
					
				}
			} catch (Exception e) {

			}
		
	}
}
