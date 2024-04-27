package jee.javapack.servlets;

import jee.javapack.beans.Film;
import jee.javapack.beans.Reservation;
import jee.javapack.dao.FilmDAO;
import jee.javapack.dao.FilmDAOImpl;
import jee.javapack.dao.ReservationDAO;
import jee.javapack.dao.ReservationDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

    private final FilmDAO filmDAO;
    private final ReservationDAO reservationDAO = new ReservationDAOImpl();

    public DisplayServlet() {
        filmDAO = new FilmDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Film> films = filmDAO.getAllFilms();

            request.setAttribute("films", films);
        System.out.println("jhgmkppmlkjhgjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");

        request.getRequestDispatcher("/WEB-INF/CinemaHome.jsp").forward(request, response);
    }
}
