package day0228;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardB extends HttpServlet {
	//�����ο� �����Ѵ�
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
	      
	      out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>");
	      out.println("<script type='text/javascript'>");
	      out.println("$(function() {");
	      
	      out.println("\t$('.btn').click(function(){");
	      //select�� ��
	      out.println("\tvar output='';");
	      out.println("\tvar prj_name=$('#prj').val();");
	      //checkbox�� ���� �����ͼ�
	      out.println("\toutput='������Ʈ�� ['+prj_name+']<br/>�����ο� : ';");
	      out.println("\t$.each($(\"[name='name']\"),function(i,obj){");
	      out.println("\tif($(obj).is(':checked')){");
	      out.println("\toutput+= $(obj).val()+' ';");
	      out.println("\t};//end if");
	      out.println("\t});//each");
	      //div ���
	      out.println("\t$('#prj_member').html(output);");
	      
	      
	      out.println("\t});//click");
	      
	      out.println("});//ready");
	      out.println("</script>");
	      
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	      
	      //������ ó�� ���������� ó���� ����� �޾ƿͼ� 
	      String[] nameArr = (String[])request.getAttribute("member");
	      List<String> prjList = (List<String>)request.getAttribute("project_list");
	      
	      //��ºκ��� �����
	      out.println("<label>������Ʈ ����</label>");
	      out.print("<select id='prj'>");
	      for(String prj:prjList) {
	    	  out.print("<option value='");
	    	  out.print(prj);
	    	  out.print("'>");
	    	  out.print(prj);
	    	  out.println("</option>");
	      }//end for
	      out.println("</select>");
	      out.println("<div>");
	      out.println("<h3>�����η�</h3>");
	      
	      for(String name:nameArr) {
	    	  out.print("<input type='checkbox' name='name' value='");
	    	  out.print(name);
	    	  out.print("'>");
	    	  out.print(name);
	    	  out.println("&nbsp;");
	      }//end for
	      out.print("<input type='button' value='�߰�' class='btn'/>");
	      out.println("</div>");
	      out.println("<div id='prj_member'></div>");
	      
	      
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
