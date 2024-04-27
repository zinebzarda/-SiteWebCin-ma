package jee.javapack.servlets;

import jee.javapack.beans.Film;
import jee.javapack.dao.FilmDAO;
import jee.javapack.dao.FilmDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CinemaHome", value = "/CinemaHome")
public class CinemaHome extends HttpServlet {
    private final FilmDAO filmDAO = new FilmDAOImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Film> ratingFilms = filmDAO.getHighRatedFilms();
        request.setAttribute("ratingFilms", ratingFilms);

        List<Film> films = filmDAO.getAllFilms();
        request.setAttribute("films", films);
        System.out.println(films);
        request.getRequestDispatcher("/CinemaHome.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("titleInput");
        String date = request.getParameter("dateInput");
        String time = request.getParameter("timeInput");
        String experience = request.getParameter("experienceInput");
        String seat = request.getParameter("seatInput");
        String offer = request.getParameter("offerInput");
        System.out.println(title);
        System.out.println(date);
        System.out.println(time);
        System.out.println(experience);
        System.out.println(seat);
        System.out.println(offer);

    }
}