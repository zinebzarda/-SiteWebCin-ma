package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDAOImpl implements FilmDAO {

    public void statementFilm(List<Film> listFilm, PreparedStatement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery();
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
            listFilm.add(film);
        }
    }

    @Override
    public List<Film> getAllFilms() throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionDAO.getConnection();
        List<Film> films = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Film");
        statementFilm(films, preparedStatement);
        connection.close();
        preparedStatement.close();
        return films;
    }

}
