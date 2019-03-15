package day0306;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class EmpDAO {
	public List<EmpVO> selectAllEmp() throws SQLException {
		List<EmpVO> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			try {
				//1. JNDI ��밴ü ���
				Context ctx = new InitialContext();
				//2. DataSource�� DBCP���� �����´�.
				DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/dbcp");
				//3. Connection�� ��´�
				con = ds.getConnection();
				
			} catch (NamingException ne) {
				ne.printStackTrace();
			}//end catch
			
			//4. ������ ���� ��ü ���
			String selectEmp = "select empno, mgr, sal, ename, job, to_char(hiredate,'yyyy-mm-dd dy') hiredate from emp order by sal";
			pstmt = con.prepareStatement(selectEmp);
			
			//5. ������ ���� �� ��� ���
			rs = pstmt.executeQuery();
			EmpVO ev = null;
			while(rs.next()) {
				ev = new EmpVO(rs.getInt("empno"), rs.getInt("mgr"), rs.getInt("sal"), rs.getString("ename"), rs.getString("job"), rs.getString("hiredate"));
				list.add(ev);
			}//end while
			
		} finally {
			//6. ���� ����
			if(rs != null) {
				rs.close();
			}//end if
			if(pstmt != null) {
				pstmt.close();
			}//end if
			if(con != null) {
				con.close();
			}//end if
		}//end finally
		
		return list;
	}//selectAllEmp
}//class
