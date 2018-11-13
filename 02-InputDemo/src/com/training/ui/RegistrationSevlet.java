package com.training.ui;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Customer;

/**
 * Servlet implementation class RegistrationSevlet
 */
@WebServlet("/Reg")
public class RegistrationSevlet extends HttpServlet {
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
		PrintWriter out = response.getWriter();
		Customer customer = new Customer();
		
		
		
		String strId = request.getParameter("txtId");
		if(strId != null)
		{
		int id = Integer.parseInt(strId);
		customer.setId(id);
		}
		
		
		
		String strName = request.getParameter("txtName");
		if(strName != null) {

		customer.setName(strName);
		
	}
		
		
		String strGender = request.getParameter("radGender");
		if(strGender != null) {
			int gender = Integer.parseInt(strGender);
            customer.setGender(gender);
		
	}
		String strIsprivilaged = request.getParameter("chkPrivilaged");
		if(strIsprivilaged == null) {
			customer.setPrevileaged(false);
		}else{
			if(strIsprivilaged.equals("Yes"));
			 customer.setPrevileaged(true);
		
	}
		String strEmailId = request.getParameter("txtEmailId");
		if(strEmailId != null) {

		customer.setEmail(strEmailId);
	}
		

		String strPhoneNum = request.getParameter("txtPhoneNum ");
		if(strPhoneNum != null) {
			customer.setPhone(strPhoneNum);
		}
		
		
		
		String strAddress = request.getParameter("txtAddress");
		if(strAddress != null) {

		customer.setAddress(strAddress);
	}
		String strDoJ = request.getParameter("txtDoJ");
		if(strDoJ != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date doj;
			try {
				doj = sdf.parse(strDoJ);
				customer.setDateOfJoining(doj);
			} 
		catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			String strDesc = request.getParameter("txtDesc");
			if(strDesc != null) {

			customer.setDescription(strDesc);
		}
			String strBalAmt = request.getParameter("txtBalAmt");
			if(strBalAmt != null) {
			int amount = Integer.parseInt(strBalAmt);
			customer.setBalanceAmt(amount);
			}
			String strRating = request.getParameter("txtRating");
			if(strRating != null) {
				int rating = Integer.parseInt(strRating);
	            customer.setGender(rating);
			
			
		}
		out.println(customer.getName());
		out.println(customer.getId());
		out.println(customer.getGender());
		out.println(customer.getEmail());
		out.println(customer.getPhone());
		out.println(customer.isPrevileaged());
		out.println(customer.getPhone());
		out.println(customer.getAddress());
		out.println(customer.getDescription());
		out.println(customer.getBalanceAmt());
		out.println(customer.getCustomerRating());

	}
}
