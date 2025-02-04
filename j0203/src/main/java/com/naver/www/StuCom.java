package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StuCom")
public class StuCom extends HttpServlet {
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("stuNo");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String mat = request.getParameter("mat");
		int skor = Integer.parseInt(kor);
		int seng = Integer.parseInt(eng);
		int smat = Integer.parseInt(mat);
		int total = skor+seng+smat;
		double avg = total/3.0;
		System.out.println(no + " " + name + " " + kor + " " + eng + " " + mat  + " " +  total + " " + avg);
		
		response.setContentType("text/html;charset=utf-8"); //html
		request.setCharacterEncoding("utf-8"); // 한글인코딩
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>서블릿페이지</title></head>");
		writer.println("<body>");
		writer.println("<h2>학생성적 정보</h2>");
		writer.printf("<h4>번호 : %s </h4>",no);
		writer.printf("<h4>이름 : %s </h4>",name);
		writer.printf("<h4>국어 : %s </h4>",kor);
		writer.printf("<h4>영어 : %s </h4>",eng);
		writer.printf("<h4>수학 : %s </h4>",mat);
		writer.printf("<h4>합계 : %d </h4>",total);
		writer.printf("<h4>평균 : %.2f </h4>",avg);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request,response);
	}

}
