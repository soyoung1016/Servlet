package day0225;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. HttpServlet ���
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//2. ��û����� ó���� �� �ִ� �߻� method �� Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//3. �������� ����(MIME-TYPES) : Ŭ���̾�Ʈ���� ������ ����
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		
		//4. ���������� ������ ���Ͽ� �����Ͽ� �����ڿ��� ������ ������ �����ϱ� ���� Stream�� ��´�.
		PrintWriter out= response.getWriter();
		
		//5. ��³����� ��Ʈ���� ����Ѵ�.
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>�ȳ� Servelet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>�ȳ� Servlet!!!</strong><br/>");
		out.println("�� ����ö �̶����<br/>");
		
		out.println("</body>");
		out.println("</html>");
	}
	
	

}
