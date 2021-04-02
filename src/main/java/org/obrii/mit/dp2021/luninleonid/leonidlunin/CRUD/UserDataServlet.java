package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.obrii.mit.dp2021.luninleonid.leonidlunin.Spring.Spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@WebServlet(name = "SpringServlet", urlPatterns = {"/SpringServlet"})
public class UserDataServlet extends HttpServlet {
    String  formType1 = "update"; 

    @Autowired
    Spring Spring;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session  = request.getSession();
        session.setAttribute("formType1", formType1);
        if(request.getParameter("search")!=null){
            request.setAttribute("data", Spring.sortData(request.getParameter("search")));
            }
        else{
            request.setAttribute("data", Spring.readData());
        }
        
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        formType1="create";
        Data user = new Data(
            Integer.parseInt(req.getParameter("id")),
            req.getParameter("name"),
            Integer.parseInt(req.getParameter("age")),
            req.getParameter("gender"),
            req.getParameter("email")
        );
        Spring.createData(user);
        doGet(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Spring.deleteData(Integer.parseInt(req.getParameter("id")));
        doGet(req, resp); 
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        formType1="update";
        Data user = new Data(
            Integer.parseInt(req.getParameter("id")),
            req.getParameter("name"),
            Integer.parseInt(req.getParameter("age")),
            req.getParameter("gender"),
            req.getParameter("email")
        );
        Spring.updateData(user, Integer.parseInt(req.getParameter("id")));
        doGet(req, resp); 
    }
}