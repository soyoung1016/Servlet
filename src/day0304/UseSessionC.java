package day0304;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class UseSessionC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� ���� ������
		//1. ���� ���
		HttpSession session = request.getSession();
		//2. ���� �� ����
		session.removeAttribute("id");
		session.removeAttribute("user_name");
		//3. �������� �Ҵ� �� ������ü ��ȿȭ
		session.invalidate();
		
		//�̵��� ������ ����(�ڷΰ��� ����~!~!)
		//response.sendRedirect("day0304/use_session.html");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script type='text/javascript'>");
	      out.println("window.onload=function(){");
	      out.println("\tlocation.replace('day0304/use_session.html');");
	      out.println("}//onload");
	      out.println("</script>");
		
		/*
		 * ������ ��ȿȭ �ǰ� �� ���Ŀ��� ���ǿ��� ���� ���� �� ����.
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("user_name");
		
		System.out.println("���̵� "+id+" �̸� "+name);
		*/
	}//doGet

}//class
