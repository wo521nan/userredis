<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <%
       String path = request.getContextPath();
       String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
 <html>
 <head>
         <title></title>
     </head>
 <body>
 登入失败!
 ${message}
 <br>
 <a href="<%=path%>/WEB-INF/jsp/login.jspsp/login.jsp">返回</a>
 </body>
 </html>
