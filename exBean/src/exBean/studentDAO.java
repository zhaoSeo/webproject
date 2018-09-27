package exBean;
 import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
 public class studentDAO {
	 
  public void insertStudent(studentVO item) throws Exception {
   String no = item.getNo();
   String name = item.getName();


   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201312626","201312626");

 

  PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?)");
   pstmt.setString(1,no);
   pstmt.setString(2,name);
   pstmt.executeUpdate();

 

  pstmt.close();

  conn.close();
  }
  
  public List<studentVO> selectStudent() throws Exception { //List에 record set을 담아 넘겨 준다
	  
	   List<studentVO> items = new ArrayList<studentVO>();

	   Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201312626","201312626");
	   
	   PreparedStatement sql = conn.prepareStatement("select * from student");
	   ResultSet rs = sql.executeQuery();
	   // SQL문 실행
	   
	   while(rs.next()) {
		  studentVO item = new studentVO();
	     // 가져온 레코드 값 리스트에 세트
		item.setNo(rs.getString("no"));
		item.setName(rs.getString("name"));
	    items.add(item);
	    } 

	   return items;
	  }

 }
