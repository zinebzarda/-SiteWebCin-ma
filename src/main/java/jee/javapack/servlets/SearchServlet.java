package jee.javapack.servlets;

import jee.javapack.beans.Film;
import jee.javapack.dao.FilmDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String titleFilm =request.getParameter("titleFilm");
       FilmDAOImpl filmDAO = new FilmDAOImpl();
       FilmDAOImpl serachfilm=new FilmDAOImpl();

        try {
            request.setAttribute("trendFilms",serachfilm.SearchFilms(titleFilm));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Film> ratingFilms = filmDAO.getHighRatedFilms();
        request.setAttribute("ratingFilms", ratingFilms);

        List<Film> films = filmDAO.getAllFilms();
        request.setAttribute("films", films);
        System.out.println(films);

        this.getServletContext().getRequestDispatcher("/CinemaHome.jsp").forward(request, response);

    }

}