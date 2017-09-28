/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3lab1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 721292
 */
public class LoginServlet extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request,response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("usern");
        String pass = request.getParameter("passw");
        
        UserService us = new UserService();
        
        if(user == null || pass == null || user.trim().isEmpty() || pass.trim().isEmpty())
        {
            request.setAttribute("message", "Both Values are requried!");
            getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
        }
        else if(!us.login(user, pass))
        {
            request.setAttribute("message", "Wrong user name or password.");
            request.setAttribute("usern", user);
            request.setAttribute("passw", pass);
            getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
        }
        else
        {
            String adduser = "+++/"+user+"/+++";
            request.setAttribute("username", adduser);
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
        }
        
        
    }

}
