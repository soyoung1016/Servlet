package day0304;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class UseSessionB extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
	      out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8080/servlet_prj/common/css/main_v190130.css\"/>\r\n");
	      out.write("<style type=\"text/css\">\r\n");
	      out.write("#wrap{ margin:0px auto; width:800px; height: 860px;  }\r\n");
	      out.write("#header{  width:800px; height: 140px; background: #FFFFFF url(http://localhost:8080/servlet_prj/common/images/header_bg.png) repeat-x;\r\n");
	      out.write("\t\t\tposition: relative; }\r\n");
	      out.write("#headerTitle{ font-family: HY�߰��, ���; font-size: 30px; font-weight: bold;text-align: center;\r\n");
	      out.write("\t\t\t\t\tposition: absolute; top:30px; left:290px}\r\n");
	      out.write("#container{  width:800px; height: 600px; }\r\n");
	      out.write("#footer{  width:800px; height: 120px; }\r\n");
	      out.write("#footerTitle{ float:right; font-size: 15px; padding-top:20px; padding-right: 20px }\r\n");
	      out.write("</style>\r\n");
	      
	      out.println("<script type='text/javascript'>");
	      out.println("window.onload=function(){");
	      out.println("document.getElementById('logout').addEventListener('click',movePage);");
	      out.println("}//onload");
	      out.println("function movePage() {");
	      out.println("\tlocation.replace('use_session_c');");
	      out.println("}//movePage");
	      out.println("</script>");
	      
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	/////////////////////////////////////////////////////////////////////////////
	      
	      //�ٸ� ������(UseSessionA)���� ����� ���� �̵��� ������(UseSessionB)����
	      //����ҷ��� ������ �ʿ��ϴ�.(�񿬰Ἲ�� ���� ����)
	      
	      //1. ���Ǿ��
	      HttpSession session = request.getSession();
	      //2. ���ǿ��� �� ���
	      String id=(String)session.getAttribute("id");
	      String name = (String)session.getAttribute("user_name");
	      
	      
	      if(id == null) {
	    	  //���ǿ� ���� ���ٸ�
	    	  //�� �������� URL�� ���� �ְ� ���Դ°�? - ���������� ��û �߻�
	    	  //�������� ��û�� ������ ������ ���ð��� �ʰ��� ���
	    	  response.sendRedirect("day0304/use_session.html");
	    	  
	      }//end if
	      out.println("<h2>���ǻ��</h2>");
	      
	      out.print(name);
	      out.print("(<strong>");
	      out.print(id);
	      out.print("</strong>)���� �۾� ������ �Դϴ�.<br/>");
	      out.print("<a id='logout'>�α׾ƿ�</a><br/>");
	      out.print("<img src='day0304/images/job.png'/>");
	      
	/////////////////////////////////////////////////////////////////////////////
	      out.write("\t\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"footer\">\r\n");
	      out.write("\t\t<div id=\"footerTitle\">copyright&copy; all right reserved. class 4 </div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>\r\n");
		
	}//doGet

}//class
