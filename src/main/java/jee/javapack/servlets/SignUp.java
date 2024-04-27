package jee.javapack.servlets;

import jee.javapack.dao.SignInDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/signUp")
public class SignUp extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String userEmail = request.getParameter("email");
        String userPassword = request.getParameter("password");
        RequestDispatcher dispatcher = null;

        try {
            int counter = SignInDAO.createUser(userName, userEmail, userPassword);
            dispatcher = request.getRequestDispatcher("authentication.jsp");

            if (counter > 0) {
                request.setAttribute("status", "success");
            } else {
                request.setAttribute("status", "failed");
            }

            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the error appropriately, maybe redirect to an error page
        }
    }
}
