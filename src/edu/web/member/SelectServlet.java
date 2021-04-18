package edu.web.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/select.do")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static MemberDAO dao;

    public SelectServlet() {
    	dao=MemberDAOImple.getInstance();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		memberselect(request,response);
	}

	private void memberselect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		System.out.println(userid);
		MemberVO result = dao.select(userid);
		System.out.println(result);
		if(result != null) {
		request.setAttribute("resultid", result.getUserid());
		request.setAttribute("resultpassword", result.getPassword());
		request.setAttribute("resultemail", result.getEmail());
		request.setAttribute("resultemailagree", result.getEmailAgree());
		request.setAttribute("resultinterest", result.getInterestJoin());
		System.out.println(result.getInterestJoin());
		request.setAttribute("resultphone", result.getPhone());
		request.setAttribute("resultintroduce", result.getIntroduce());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/member_result.jsp");
		dispatcher.forward(request, response);

		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
