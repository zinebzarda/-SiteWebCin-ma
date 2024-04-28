package jee.javapack.servlets;

import jee.javapack.dao.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String login = request.getParameter("login");
        String password = request.getParameter("pwd");

        try {
            boolean isValidUser = LoginDAO.validateUser(login, password);
            if (isValidUser) {
                session.setAttribute("login", login);
                String role = getUserRole(login, password);
                if ("admin".equals(role)) {
                    response.sendRedirect("Reservation.jsp");
                } else {
                    response.sendRedirect("CinemaHome.jsp");
                }
            } else {
                response.sendRedirect("authentication.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the error appropriately, maybe redirect to an error page
        }
    }

    private String getUserRole(String login, String password) throws SQLException {
        String userRole = "";
        // You can reuse the code to get the user role from the database
        return userRole;
    }
}
