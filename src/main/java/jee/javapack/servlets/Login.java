
package jee.javapack.servlets;


import jee.javapack.dao.LoginDAO;
import jee.javapack.dao.UserrDAO;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String login = request.getParameter("login");
        String password = request.getParameter("pwd");

        UserrDAO user = LoginDAO.authenticate(login, password);
        System.out.println("Login Attempt: Email - " + login + ", Password - " + password);
        if (user != null) {
            session.setAttribute("login", login);
            String role = user.getRole();
            if ("admin".equals(role)) {
                response.sendRedirect("Reservation.jsp");
            } else {
                response.sendRedirect("CinemaHome.jsp");
            }
        } else {
            response.sendRedirect("authentication.jsp");
        }
    }
}
