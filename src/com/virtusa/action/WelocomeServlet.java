package com.virtusa.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.entity.RegistratioDetails;
import com.virtusa.service.RegistrationService;

@WebServlet("/servlet1")public class WelocomeServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String ph = request.getParameter("phoneNumber");
		String email=request.getParameter("email");
		try {			
			RegistratioDetails rd = new RegistratioDetails();
			rd.setFirstName(fname);
			rd.setLastName(lname);
			rd.setPhoneNumber(Long.parseLong(ph));
			rd.setEmail(email);
			RegistrationService rs = new RegistrationService();
			rs.register(rd);
			ServletContext sc = getServletContext();
			sc.getRequestDispatcher("/index.html").forward(request, response);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	
}
