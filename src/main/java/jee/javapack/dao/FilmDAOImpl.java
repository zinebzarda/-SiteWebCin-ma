package jee.javapack.dao;
import jee.javapack.beans.Film;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FilmDAOImpl implements FilmDAO {


    public void statementFilm(ArrayList<Film> listFilm, PreparedStatement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Film film = new Film(
                    resultSet.getInt("idFilm"),
                    resultSet.getString("titleFilm"),
                    resultSet.getString("descriptionFilm"),
                    resultSet.getString("runTimeFilm"),
                    resultSet.getString("genreFilm"),
                    resultSet.getDate("producedIn"),
                    resultSet.getString("directedBy"),
                    resultSet.getString("pictureURL"),
                    resultSet.getString("backgroundURL"),
                    resultSet.getString("ratingFilm"),
                    resultSet.getString("streamingNow")
            );
            listFilm.add(film);
        }
    }

    @Override
    public List<Film> getHighRatedFilms() {
        List<Film> highRatedFilms = new ArrayList<>();

        try {
            Connection connection = ConnectionDAO.getConnection();
            String query = "SELECT * FROM film WHERE ratingFilm > 4 ORDER BY ratingFilm DESC";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Film film = new Film();
                film.setIdFilm(resultSet.getInt("idFilm"));
                film.setTitleFilm(resultSet.getString("titleFilm"));
                film.setDescriptionFilm(resultSet.getString("descriptionFilm"));
                film.setRunTimeFilm(resultSet.getString("runTimeFilm"));
                film.setGenreFilm(resultSet.getString("genreFilm"));
                film.setProducedIn(resultSet.getDate("producedIn"));
                film.setPictureURL(resultSet.getString("pictureURL"));
                film.setStreamingNow(resultSet.getString("streamingNow"));
                film.setRatingFilm(resultSet.getString("ratingFilm"));

                highRatedFilms.add(film);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return highRatedFilms;
    }

    @Override
    public Film getMovieById(Integer idMovie) throws SQLException, ClassNotFoundException {
        Film foundFilm = null;
        Connection connection = ConnectionDAO.getConnection();
        String queryIdMovie = "SELECT * FROM film WHERE idFilm = ?";
        PreparedStatement statement = connection.prepareStatement(queryIdMovie);
        statement.setInt(1, idMovie);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            foundFilm = new Film(
                    resultSet.getInt("idFilm"),
                    resultSet.getString("titleFilm"),
                    resultSet.getString("descriptionFilm"),
                    resultSet.getString("runTimeFilm"),
                    resultSet.getString("genreFilm"),
                    resultSet.getDate("producedIn"),
                    resultSet.getString("directedBy"),
                    resultSet.getString("pictureURL"),
                    resultSet.getString("backgroundURL"),
                    resultSet.getString("ratingFilm"),
                    resultSet.getString("streamingNow")
            );
        }
        return foundFilm;
    }


    @Override
    public List<Film> getAllFilms(){

        List<Film> films = new ArrayList<>();

        try {
            Connection connection = ConnectionDAO.getConnection();
            String query = "SELECT * FROM film";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Film film = new Film();
                film.setIdFilm(resultSet.getInt("idFilm"));
                film.setTitleFilm(resultSet.getString("titleFilm"));
                film.setDescriptionFilm(resultSet.getString("descriptionFilm"));
                film.setRunTimeFilm(resultSet.getString("runTimeFilm"));
                film.setGenreFilm(resultSet.getString("genreFilm"));
                film.setProducedIn(resultSet.getDate("producedIn"));
                film.setPictureURL(resultSet.getString("pictureURL"));
                film.setStreamingNow(resultSet.getString("streamingNow"));
                film.setRatingFilm(resultSet.getString("ratingFilm"));

                films.add(film);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return films;
    }
}
