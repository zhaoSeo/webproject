<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.*" %>
 <%@ page import = "exBean.studentVO" %>
 <%@ page import = "exBean.studentDAO" %>
  <%-- DAO 객체 생성 --%>
<%
 	studentDAO dao = new studentDAO();
  	List<studentVO> items = new ArrayList<studentVO>();
	items = dao.selectStudent(); //selectStudent()메서드를 수행하여 List로 record set을 넘겨 받는다
%>

 


 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  for(int i=0;i<items.size();i++) {
   studentVO item = (studentVO)items.get(i); //List에서 record를 하나씩 가져온다
%>
<%=item.getNo()%> 

  <%=item.getName()%><BR> 

 <%}%>
</body>
</html>
 <%
  request.setCharacterEncoding("UTF-8");
  studentVO item = new studentVO(); //사용자 객체 생성

  item.setNo(request.getParameter("no"));
  item.setName(request.getParameter("name"));
	items.add(item);
 //코드내에서 객체생성 javabean
 %>