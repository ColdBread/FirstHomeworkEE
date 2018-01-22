package net.codejava;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		try {

			out.println("<html>");

			out.println("<head>");

			out.println("<title>Homework1 Symonenko</title>");

			out.println("</head>");

			out.println("<body>");

			out.println("<form action=\"MyServlet\" method=\"POST\"><p>Enter name:  <input type=\"text\" name=\"username\"></p><p>Enter password:  <input type=\"password\" name=\"pass\"></p><input type=\"submit\" value=\"Submit\" /></form>");

			out.println("</body>");

			out.println("</html>");

		} finally {

			out.close();

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("username"));
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("username");
		String password = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if (name.equals("Dima") && password.equals("1234")) {
			try {
				out.println("<html>");

				out.println("<head>");

				out.println("<title>Homework1 Symonenko</title>");

				out.println("</head>");

				out.println("<body>");
				out.println("<p>");
				out.println("You are welcome " + name + "!");
				out.println("</p>");
				out.println("</body>");

				out.println("</html>");
			} finally {
				out.close();
			}
		} else {
			try {
				out.println("<html>");

				out.println("<head>");

				out.println("<title>Homework1 Symonenko</title>");

				out.println("</head>");

				out.println("<body>");
				out.println("<p>");
				out.println("Access denied " + name + "!");
				out.println("</p>");
				out.println("</body>");

				out.println("</html>");
			} finally {
				out.close();

			}
		}
	}
}