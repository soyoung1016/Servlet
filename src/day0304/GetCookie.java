package day0304;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class GetCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ ����
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
	      out.println("#non_cookie(color:#FF0000; font-size:15px; font-weight:bold)");
	      
	      out.write("</style>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	/////////////////////////////////////////////////////////////////////////////
	      
	      //�����ڿ� �ɾ��� ��Ű �б�
	      Cookie[] cookies = request.getCookies();
	      
	      if(cookies != null) {
	    	  Cookie temp = null;
	    	  out.println("<ul>");
	    	  for(int i=0; i<cookies.length; i++) {
	    		  temp = cookies[i];
	    		  out.print("<li>��Ű �̸� : <strong>");
	    		  out.print(temp.getName());
	    		  out.print("</strong> ��Ű �� : ");
	    		  out.print(temp.getValue());
	    		  out.print("</li>");
	    	  }//end for
	    	  out.println("</ul><br/>");
	    	  out.println("<a href='remove_cookie'>��Ű����</a>");
	      } else {
	    	  out.println("<div id='non_cookie'>��Ű�� �������� �ʽ��ϴ�.</div>");
	    	  out.println("<div><a href='add_cookie'>��Ű �ɱ�</a></div>");
	      }//end else


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
