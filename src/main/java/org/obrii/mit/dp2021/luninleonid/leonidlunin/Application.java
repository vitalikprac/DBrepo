package org.obrii.mit.dp2021.luninleonid.leonidlunin;


import javax.servlet.http.HttpServletRequest;

public abstract class Application {

    protected UserInterface user;
    public Application() {
    }
    
    public void setUser(HttpServletRequest request){
        user = new User(
        request.getParameter("name"),
        request.getParameter("gender"),
        request.getParameterValues("language"),
        request.getParameter("country"),false);
    }
    
    public abstract void setUser(HttpServletRequest request, boolean isAdmin);
    
    final public UserInterface getUser(){
    return user;
    }
    
}