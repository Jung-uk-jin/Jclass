package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/FormSend")
public class FormSend extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction호출");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String major = request.getParameter("major");
		String[] hobby = request.getParameterValues("hobby");
		System.out.println(id+ " " + pw + " " + name);
		
		response.setContentType("text/html;charset=utf-8"); //html
		request.setCharacterEncoding("utf-8"); // 한글인코딩
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>서블릿페이지</title></head>");
		writer.println("<body>");
		writer.println("<h2>회원가입 정보</h2>");
		writer.printf("<h4>아이디 : %s </h4>",id);
		writer.printf("<h4>비밀번호 : %s </h4>",pw);
		writer.printf("<h4>이름 : %s </h4>",name);
		writer.printf("<h4>성별 : %s </h4>",gender);
		writer.printf("<h4>학과 : %s </h4>",major);
		String hobbys="";
		for(int i=0 ; i<hobby.length ; i++) {
			if(i==0) hobbys += hobby[i];
			hobbys += "," +hobby[i];
			writer.printf("<h4>취미 : %s </h4>",hobby[i]);			
		}
		writer.println("취미 : "+ hobbys);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost호출");
		doAction(request, response);
	}

}
