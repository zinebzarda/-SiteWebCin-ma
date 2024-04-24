package jee.javapack.servlets;

import jee.javapack.dao.FilmDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title=request.getParameter("title");
        FilmDAOImpl serachfilm=new FilmDAOImpl();

        try {
            request.setAttribute("filmSe",serachfilm.SearchFilms(title));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        this.getServletContext().getRequestDispatcher("/CinemaHome.jsp").forward(request, response);

    }

}