package jee.javapack.servlets;

import jee.javapack.beans.Film;
import jee.javapack.dao.FilmDAOImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "ReserveNow", value = "/ReserveNow")
public class ReserveNow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idMovie = Integer.valueOf(request.getParameter("id"));
        FilmDAOImpl filmDAO = new FilmDAOImpl();
        Film foundFilm = null;
        try {
            foundFilm = filmDAO.getMovieById(idMovie);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String[] dates = foundFilm.getStreamingNow().split(" ");
        List<String> outputDates = new ArrayList<>();
// Maintenant, la variable dates est un tableau de chaînes contenant chaque date séparée
        for (String date : dates) {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");


            try {

                // Conversion de la chaîne en objet Date
                Date dateFormat = inputFormat.parse(date);
                // Création du format pour la date de sortie
                SimpleDateFormat outputFormat = new SimpleDateFormat("EEE dd MMM");

                // Conversion de la date en chaîne au format souhaité
                String outputDate = outputFormat.format(dateFormat);
                outputDates.add(outputDate.toUpperCase()); // Utilisation de toUpperCase pour afficher "FRI" en majuscules

                // Affichage du résultat
                System.out.println(outputDates);

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }




        }
        request.setAttribute("Movie", foundFilm);
        this.getServletContext().getRequestDispatcher("/Reservation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}