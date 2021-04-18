package edu.web.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete.do")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static MemberDAO dao;

    public deleteServlet() {
    	dao=MemberDAOImple.getInstance();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		memberdelete(request,response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	private void memberdelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userid = request.getParameter("userid");
		
		System.out.println(userid);
		if(userid != null) {
		int result = dao.delete(userid);
		System.out.println(result);
		if(result == 1) {
			response.sendRedirect("/Homepage/login.jsp");
		}
	}
	}
}
