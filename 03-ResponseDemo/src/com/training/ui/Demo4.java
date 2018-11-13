package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo4
 */
@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String [] subjects = {"English" ,"Physics", "Maths"};
		double[] marks = {70.0,75.0,81.0};
		double total =0.0;
		PrintWriter out = response.getWriter();
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>");
		out.println("Subjects");
		out.println("Marks");
		out.println("</th>");
		out.println("</tr>");
		out.println("<table>");
		
		
		
         for (int i = 0; i < subjects.length; i++) {
        
			out.println("<tr>");
			
			out.println("<td>");
			out.println(subjects[i]);
			out.println("</td>");
			out.println("<td>");
			out.println(marks[i]);
			out.println("</td>");
			out.println("</tr>");
			total = total+marks[i];

			
		}
			
			out.println("</table>");
			
		
	}

}

