package jee.javapack.servlets;

import jee.javapack.beans.Film;
import jee.javapack.dao.FilmDAO;
import jee.javapack.dao.FilmDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CinemaHome", value = "/CinemaHome")
public class CinemaHome extends HttpServlet {
    private final FilmDAO filmDAO = new FilmDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Film> ratingFilms = filmDAO.getHighRatedFilms();
        request.setAttribute("ratingFilms", ratingFilms);

<<<<<<< HEAD
        List<Film> films;
        try {
            films = filmDAO.getAllFilms();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
=======
        List<Film> films = filmDAO.getAllFilms();
>>>>>>> 7a8dc9b08099e6affebef5e4db0cbb67eb5b18fe
        request.setAttribute("films", films);
        System.out.println(films);
        request.getRequestDispatcher("/CinemaHome.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
        doGet(request,response);
=======

>>>>>>> 7a8dc9b08099e6affebef5e4db0cbb67eb5b18fe
    }
}
