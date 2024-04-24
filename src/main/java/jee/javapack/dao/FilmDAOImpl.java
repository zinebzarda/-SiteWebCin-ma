package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDAOImpl implements FilmDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cinema_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    @Override
    public List<Film> getAllFilms() {
        List<Film> films = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Film");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Film film = new Film(
                        resultSet.getInt("idFilm"),
                        resultSet.getString("titleFilm"),
                        resultSet.getString("descriptionFilm"),
                        resultSet.getInt("runTimeFilm"),
                        resultSet.getString("genreFilm"),
                        resultSet.getDate("producedIn"),
                        resultSet.getString("directedBy"),
                        resultSet.getString("pictureURL")
                );
                films.add(film);
            }

        } catch (SQLException e) {
            System.err.println("Error fetching films: " + e.getMessage());
            e.printStackTrace();
        }

        return films;
    }

    // Implémentez d'autres méthodes nécessaires pour votre DAO
}
