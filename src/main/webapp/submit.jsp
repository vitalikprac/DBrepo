<%-- 
    Document   : submit
    Created on : 3 лют. 2021 р., 14:34:20
    Author     : 38068
--%>

<%@page import="java.util.List"%>
<%@page import="org.obrii.mit.dp2021.luninleonid.leonidlunin.UserInterface"%>
<%@page import="org.obrii.mit.dp2021.luninleonid.leonidlunin.Application"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/main_header.jsp" />
<div class="form_wrapper">
    <%
        
        Application app = (Application)request.getAttribute("app");
        UserInterface user = app.getUser();
    %>
    <p>Name is: <%= user.getName()%></p><br>
    
    <p>Gender is: 
    <%
    String gender = user.getGender();
    if (gender == null) {
        out.print("unknown");
    }
    else out.print(gender);
    %>
    </p><br>

    <p>Languages is:
    <%
    List<String> languages = user.getLanguage();
    if (languages != null) {
    for (int i = 0; i < languages.size(); i++) {
            out.print(languages.get(i)+" ");
        }                 
        }else {
        out.print("no choose");
        }
    %>
    </p><br>
    <br>
    <p>Country: 
    <%
    String country = user.getCountry();
    if (country == null) {
        out.print("unknown");
    }
    else out.print(country);
    %>
    </p>
    <br>
    <p>Privileges:  
    <%=
        user.getIsAdmin()
    %>
    </p>
    <a class="return" href="<%=request.getContextPath()%>">Return</a>
</div>  
    
<jsp:include page="include/main_footer.jsp" />