package day0305;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class PopupClose extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//checkbox�� value�� ���� ��, üũ�ڽ��� �����ϰ� submit�� �Ǹ� "on"�� ������
		//üũ�ڽ��� �������� �ʰ� submit�Ǹ� null�� �Էµȴ�
		String popupFlag = request.getParameter("popupFlag");
		
		if(popupFlag != null) { //���� on�� ���
			//��Ű �ɱ� : ��¥�� ���� ��Ű�� �ɾ �˾�â�� �������� ���� ����
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			//1. ��Ű ����
			Cookie popupCookie = new Cookie("popup_date", sdf.format(new Date()));
			//2. ��Ű�� �����ð�
			popupCookie.setMaxAge(60*60*24);
			//3. ��Ű �ɱ�
			response.addCookie(popupCookie);
			
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>");
			out.println("window.onload=function(){");
			out.println("\tself.close();");
			out.println("}//function");
			out.println("</script>");
			
		}//end if
	}//doGet
}//class
