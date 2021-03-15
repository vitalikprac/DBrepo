package org.obrii.mit.dp2021.luninleonid.leonidlunin.CRUD;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserDataServlet", urlPatterns = {"/"})
public class UserDataServlet extends HttpServlet {
    CrudDataInterface CRUD = new PostgresCrud();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Read users
        if(request.getParameter("search")!=null){
            request.setAttribute("data", CRUD.sortData(request.getParameter("search")));
            }
        else{
            request.setAttribute("data", CRUD.readData());
        }
        
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Create new user
        Data user = new Data(
            Integer.parseInt(req.getParameter("id")),
            req.getParameter("name"),
            Integer.parseInt(req.getParameter("age")),
            req.getParameter("gender"),
            req.getParameter("email")
        );
        CRUD.createData(user);
        doGet(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Delete User
        CRUD.deleteData(Integer.parseInt(req.getParameter("id")));
        doGet(req, resp); 
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Update User
        Data user = new Data(
            Integer.parseInt(req.getParameter("id")),
            req.getParameter("name"),
            Integer.parseInt(req.getParameter("age")),
            req.getParameter("gender"),
            req.getParameter("email")
        );
        CRUD.updateData(Integer.parseInt(req.getParameter("id")), user);
        doGet(req, resp); 
    }
}