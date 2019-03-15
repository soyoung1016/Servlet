package day0306;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SelectEmp extends HttpServlet {
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
	      out.println("th{background-color:#141650;}");
	      out.println("span{color:#FFFFFF; font-weight:bold; font-size:14px}");
	      out.println("td{border:1px solid #141650; text-align:center;}");
	      
	      out.write("</style>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      out.write("<div\tid=\"wrap\">\r\n");
	      out.write("\t<div id=\"header\">\r\n");
	      out.write("\t\t<div id=\"headerTitle\">SIST Class4</div>\r\n");
	      out.write("\t</div>\r\n");
	      out.write("\t<div id=\"container\">\r\n");
	/////////////////////////////////////////////////////////////////////////////
	      
	      out.println("<table>");
	      
	      out.println("<tr>");
	      out.println("<th width='80'><span>��ȣ</span></th>");
	      out.println("<th width='120'><span>�����ȣ</span></th>");
	      out.println("<th width='150'><span>�����</span></th>");
	      out.println("<th width='80'><span>�Ŵ�����ȣ</span></th>");
	      out.println("<th width='100'><span>����</span></th>");
	      out.println("<th width='100'><span>����</span></th>");
	      out.println("<th width='150'><span>�Ի���</span></th>");
	      out.println("</tr>");
	      
	      List<EmpVO> list = searchAllEmp();
	      if(list == null) { //DB���� ������ �߻��� ���
	    	  out.println("<tr><td colspan='7'>���E�մϴ�. ������ �߻��Ͽ����ϴ�.</td></tr>");
	      } else {
	    	  EmpVO ev = null;
	    	  for(int i=0; i<list.size(); i++) {
	    		  ev = list.get(i);
	    		  out.println("<tr>");
	    		  
	    		  out.print("<td>");
	    		  out.print(i+1);
	    		  out.print("</td>");
	    		  
	    		  out.print("<td>");
	    		  out.print(ev.getEmpno());
	    		  out.print("</td>");
	    		  
	    		  out.print("<td>");
	    		  out.print(ev.getEname());
	    		  out.print("</td>");
	    		  
	    		  out.print("<td>");
	    		  out.print(ev.getMgr());
	    		  out.print("</td>");
	    		  
	    		  out.print("<td>");
	    		  out.print(ev.getJob());
	    		  out.print("</td>");
	    		  
	    		  out.print("<td>");
	    		  out.print(ev.getSal());
	    		  out.print("</td>");
	    		  
	    		  out.print("<td>");
	    		  out.print(ev.getHiredate());
	    		  out.print("</td>");
	    		  
	    		  out.println("</tr>");
	    	  }//end for
	    	  
	    	  if(list.isEmpty()) {
	    		  out.print("<tr><td colspan='7'>���E�մϴ�. ������ �߻��Ͽ����ϴ�.</td></tr>");
	    		  out.print("<img srd='common/images/img2.jpg' title='#�Ͼ��ϳ�? #�������'/>");
	    		  out.println("</td></tr>");
	    	  }//end if
	    	  
	      }//end else
	      
	      out.println("</table>");

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
	
	public List<EmpVO> searchAllEmp() {
		List<EmpVO> list = null;
		
		EmpDAO ed = new EmpDAO();
		try {
			list = ed.selectAllEmp();
		} catch (SQLException se) {
			se.printStackTrace();
		}//end catch
		
		return list;
	}//searchAllEmp

}//class
