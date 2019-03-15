package day0226;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//1. HttpServlet ���
public class TestCall extends HttpServlet {
    //2. ��û����� ó���� �� �ִ� method Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. ������ ����
		response.setContentType("text/html;charset=UTF-8");
		//4. ��� ��Ʈ�� ���
		PrintWriter out = response.getWriter();
		//5. ��� ���� ����
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>GET ����� ��ûó��</title>");
		out.println("<style type='text/css'>");
		out.println("span{font-weight:bold; font-size:20px; color=#0000FF}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<span>GET��� ��ûó��</span><br/>");
		out.println("<a href='day0226/call_servlet.html'>�ڷ�</a>");
		
		out.println("</body>");
		out.println("</html>");
	}//doGet

	//2. ��û����� ó���� �� �ִ� method Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. ������ ����
		response.setContentType("text/html;charset=UTF-8");
		//4. ��� ��Ʈ�� ���
		PrintWriter out = response.getWriter();
		//5. ��� ���� ����
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>POST ����� ��ûó��</title>");
		out.println("<style type='text/css'>");
		out.println("span{font-weight:bold; font-size:20px; color=#FF0000}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
				
		out.println("<span>POST��� ��ûó��</span><br/>");
		out.println("<a href='javascript:history.back();'>�ڷ�</a>");
				
		out.println("</body>");
		out.println("</html>");
	}//doPost

}//class
