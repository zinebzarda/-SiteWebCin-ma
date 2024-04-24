package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cinema_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    public List<Film> getAllFilms() {
        List<Film> films = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM films");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Film film = new Film();
                film.setIdFilm(resultSet.getInt("idFilm"));
                film.setTitre(resultSet.getString("titre"));
                film.setDescription(resultSet.getString("description"));
                film.setDuree(resultSet.getInt("duree"));
                film.setGenre(resultSet.getString("genre"));
                film.setAnnee(resultSet.getInt("annee"));
                film.setImageURL(resultSet.getString("imageURL"));

                films.add(film);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return films;
    }
}
