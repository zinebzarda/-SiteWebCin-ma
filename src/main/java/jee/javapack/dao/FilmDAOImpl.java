package jee.javapack.dao;

import jee.javapack.beans.Film;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class FilmDAOImpl implements FilmDAO{

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cinema_db";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
    
    @Override
    public ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException{
        Connection connection = ConnectionDAO.getConnection();

        ArrayList<Film> SearchFilmsRe=new ArrayList<>();
        String requet = "SELECT * FROM  film WHERE titleFilm=?";
        PreparedStatement statement = connection.prepareStatement(requet);
        statement.setString(1,Title);
        ResultSet resultat = statement.executeQuery();

        while (resultat.next()) {
            Integer idFilm = resultat.getInt("idFilm");
            String titleFilm=resultat.getString("titleFilm");
            String descriptionFilm =resultat.getString("descriptionFilm");
            Integer runTimeFilm = resultat.getInt("runTimeFilm");
            String genreFilm=resultat.getString("genreFilm");
            Date producedIn=resultat.getDate("producedIn");
            String directedBy=resultat.getString("directedBy");
            String pictureURL=resultat.getString("pictureURL");

            Film searchfilms=new Film(idFilm,titleFilm,descriptionFilm,runTimeFilm,genreFilm, producedIn,directedBy,pictureURL);
            SearchFilmsRe.add(searchfilms);

        }

        return SearchFilmsRe;
    }


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
