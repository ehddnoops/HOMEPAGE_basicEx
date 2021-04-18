package edu.web.member;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login_auth.do")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private static MemberDAO dao;

    public LoginServlet() {
    	dao=MemberDAOImple.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		response.sendRedirect("/Homepage/login.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		membercheck(request,response);
	}

	private void membercheck(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		PrintWriter out= response.getWriter();
		System.out.println("LoginServlet_doPost 호출");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");	

		MemberVO result = dao.select(userid,password);
		System.out.println(result);
		
		if(result != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login_result.jsp");

			System.out.println("if문 들어옴");
			session.setAttribute("useridKey", result.getUserid());
			session.setAttribute("passwordKey", result.getPassword());
			System.out.println("키값저장");
			session.setMaxInactiveInterval(60);
			dispatcher.forward(request, response);
		} else {
			System.out.println("else문 들어옴");
			response.sendRedirect("/Homepage/login.jsp");
		}
	}
}
	
	
	
