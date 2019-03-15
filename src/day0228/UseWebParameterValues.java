package day0228;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UseWebParameterValues extends HttpServlet {
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
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	      
	      //HTML Form Control�� �� �ޱ�
	      //�̸��� ���� input type="text"
	      String name = request.getParameter("name");
	      
	      //�̸��� �ߺ� input type="checkbox"
	      String[] hobby = request.getParameterValues("hobby");
	      
	      out.print("\t<strong>");
	      out.print(name);
	      out.println("</strong>�� ���� �Է��Ͻ� ��̴� �Ʒ��� �����ϴ�.<br/>");
	      
	      out.println("\t<ul>");
	      try { //üũ�ڽ��� ���õ� ���� ���ٸ� hobby �迭���� null�� �Ҵ޵ǹǷ� length Ű���带 ����ϰ� �Ǹ� NullPointerException�� �߻��Ѵ�.
	    	  for(int i=0; i<hobby.length; i++) {
	    		  out.print("\t\t<li>");
	    		  out.print(hobby[i]);
	    		  out.println("</li>");
	    	  }//end for
	      } catch(NullPointerException npe) {
	    	  out.println("<li>��̾���</li>");
	      }//end catch
	      out.println("\t</ul>");
	      
	      out.println("\t<a href='day0228/test_param_value.html'>�ڷ�</a>");
	      
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"footer\">\r\n");
	      out.write("\t\t<div id=\"footerTitle\">copyright&copy; all right reserved. class 4 </div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>\r\n");
		
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		
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
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	      
	      //HTML Form Control�� �� �ޱ�
	      //�̸��� ���� input type="text"
	      String name = request.getParameter("name");
	      
	      //�̸��� �ߺ� input type="checkbox"
	      String[] hobby = request.getParameterValues("hobby");
	      
	      out.print("\t<h2>POST����� ��û ó��</h2>");
	      out.print("\t<strong>");
	      out.print(name);
	      out.println("</strong>�� ���� �Է��Ͻ� ��̴� �Ʒ��� �����ϴ�.<br/>");
	      
	      out.println("\t<ul>");
	      if(hobby != null) { //üũ�ڽ��� ���õ� ���� ���ٸ� hobby �迭���� null�� �Ҵ޵ǹǷ� length Ű���带 ����ϰ� �Ǹ� NullPointerException�� �߻��Ѵ�.
	    	  for(int i=0; i<hobby.length; i++) {
	    		  out.print("\t\t<li>");
	    		  out.print(hobby[i]);
	    		  out.println("</li>");
	    	  }//end for
	      } else {
	    	  out.println("<li>��̾���</li>");
	      }//end catch
	      out.println("\t</ul>");
	      
	      out.println("\t<a href='day0228/test_param_value.html'>�ڷ�</a>");
	      
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"footer\">\r\n");
	      out.write("\t\t<div id=\"footerTitle\">copyright&copy; all right reserved. class 4 </div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("</div>\r\n");
	      out.write("\r\n");
	      out.write("</body>\r\n");
	      out.write("</html>\r\n");
		
	}//doPost

}//class
