package jee.javapack.servlets;

import jee.javapack.beans.Film;
import jee.javapack.dao.FilmDAO;
import jee.javapack.dao.FilmDAOImpl;
import jee.javapack.dao.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final FilmDAO filmDAO = new FilmDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String login = request.getParameter("login");
        String password = request.getParameter("pwd");

        try {
            boolean isValidUser = LoginDAO.validateUser(login, password);
            System.out.println("Login Attempt: Email - " + login + ", Password - " + password);
            if (isValidUser) {
                session.setAttribute("login", login);
                String role = getUserRole(login, password);
                if ("admin".equals(role)) {
                    request.getRequestDispatcher("/Admin.jsp").forward(request, response);
                } else {
                    List<Film> ratingFilms = filmDAO.getHighRatedFilms();
                    request.setAttribute("ratingFilms", ratingFilms);
                    request.setAttribute("trendFilms", ratingFilms);
                    List<Film> films = filmDAO.getAllFilms();
                    request.setAttribute("films", films);
                    System.out.println(films);
                    request.getRequestDispatcher("/CinemaHome.jsp").forward(request, response);

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
