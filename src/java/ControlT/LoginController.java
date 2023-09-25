/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlT;

import DAO.LoginDAO;
import entity.Account;
import entity.Custom;
import entity.NoAdmin;
import entity.Store;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSII
 */
@WebServlet(name = "LoginController", urlPatterns = {"/loginController"})
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

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
        request.getRequestDispatcher("login.jsp").forward(request, response);// đừng xóa cái này
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
        String username = request.getParameter("account");
        String password = request.getParameter("pass");
        LoginDAO loginDAO = new LoginDAO();
        int pass = password.hashCode();
        Account a = loginDAO.checkLogin(username, pass);
        Custom c = loginDAO.checkCustomer(username);
        NoAdmin s = loginDAO.checkSeller(username);
        Store t = loginDAO.checkStore(username);
//        AdminProfile ad = loginDAO.checkAdmin(username);
        if (a == null) {
            request.setAttribute("mess", "Wrong UserName or Password!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else if (a.getRoles() == 1) {
            HttpSession session = request.getSession();
            session.setAttribute("account", a);
            response.sendRedirect("load");
        } else if (a.getRoles() == 2) {
            if (s == null) {
                HttpSession session = request.getSession();
                session.setAttribute("account", a);
                response.sendRedirect("profileSeller");
            } else {
                if (t == null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("account", a);
                    session.setAttribute("seller", s);
                    request.getRequestDispatcher("newStore.jsp").forward(request, response);
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("account", a);
                    session.setAttribute("seller", s);
                    session.setAttribute("store", t);

                    response.sendRedirect("view-product");
                }
            }
        } else if (a.getRoles() == 3) {
            if (c == null) {
                HttpSession session = request.getSession();
                session.setAttribute("account", a);             
                response.sendRedirect("profileCustomer");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("account", a);
                session.setAttribute("custom", c);
                response.sendRedirect("home");
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
