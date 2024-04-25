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

    private final FilmDAO filmDAO = new FilmDAOImpl();
    private final ReservationDAO reservationDAO = new ReservationDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Film> films = null;
        try {
            films = filmDAO.getAllFilms();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("films", films);


        int userId = 1;


        List<Reservation> reservations = reservationDAO.getReservationsByUserId(userId);
        request.setAttribute("reservations", reservations);

        
        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
}
