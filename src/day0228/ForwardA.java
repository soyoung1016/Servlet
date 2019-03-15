package day0228;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardA extends HttpServlet {
	//������ ó���ڵ忡 ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//ó���� ������
		String[] nameArr = {"������", "�ڿ���", "������", "������", "����ö", "�ڼҿ�", "������"};
		
		List<String> list = new ArrayList<String>();
		list.add("PC�� ���� ���α׷�");
		list.add("��ȭ�� ���� ���α׷�");
		list.add("������ ���α��� ���α׷�");
		
		//1.ó���� �����͸� �̵��� �������� ������ ���� ��û��ü�� �Ӽ����� �����Ѵ�.
		request.setAttribute("member", nameArr);
		request.setAttribute("project_list", list);
		
		//2. �̵��� ������ ����
		RequestDispatcher rd = request.getRequestDispatcher("forward_b");
		
		//3. �̵�
		rd.forward(request, response);
		out.println("<h1>������ ���</h1>");
		
	}//doGet

}//class
