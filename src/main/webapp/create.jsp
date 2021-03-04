<%-- 
    Document   : index
    Created on : 3 лют. 2021 р., 14:24:10
    Author     : 38068
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="include/main_header.jsp" />
<div class="form_wrapper">
    <form action="<%=request.getContextPath()%>/" method="post">
                <input type="hidden" name="id" value="0">
                Fill in form <br>
                <input type="hidden" name="title" value="Submited"/>

                <input type="text" name="name" placeholder="Your name"><br/>
                <input type="text" name="age" placeholder="Age"><br/>
                Gender: 
                <input type="radio" name="gender" value="male">Male    
                <input type="radio" name="gender" value="female">Female<br/>
                <input type="text" name="email" placeholder="Email"><br/>

                <button class="button" type="submit">Submit</button>
            </form>
</div>
<jsp:include page="include/main_footer.jsp" />
