<%-- 
    Document   : submit
    Created on : 3 лют. 2021 р., 14:34:20
    Author     : 38068
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/main_header.jsp" />

<p>Name is: <%= request.getParameter("name")%></p>
        <p>Gender is: <%= request.getParameter("gender")%></p>
        <p>Languages is:</p>
        <%
        String[] languages = request.getParameterValues("language");
        if (languages != null) {
        for (int i = 0; i < languages.length; i++) {
                out.print(languages[i]);
                out.print("<br/>");
            }                 
            }else {
            out.print("Unselected");
            }
        %>
        <br/>
        <a href="../">Return</a>
        
<jsp:include page="include/main_footer.jsp" />