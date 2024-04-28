package jee.javapack.dao;



import jee.javapack.beans.Film;

import java.sql.*;
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
                film.setBackgroundURL(resultSet.getString("backgroundURL"));
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
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return films;
    }



    @Override
    public ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionDAO.getConnection();

        ArrayList<Film> SearchFilmsRe = new ArrayList<>();
        String requet = "SELECT * FROM  film WHERE titleFilm=?";
        PreparedStatement statement = connection.prepareStatement(requet);
        statement.setString(1, Title);
        ResultSet resultat = statement.executeQuery();

        while (resultat.next()) {
            Integer idFilm = resultat.getInt("idFilm");
            String titleFilm = resultat.getString("titleFilm");
            String descriptionFilm = resultat.getString("descriptionFilm");
            String runTimeFilm = resultat.getString("runTimeFilm");
            String genreFilm = resultat.getString("genreFilm");
            Date producedIn = resultat.getDate("producedIn");
            String directedBy = resultat.getString("directedBy");
            String pictureURL = resultat.getString("pictureURL");
            String backgroundURL = resultat.getString("backgroundURL");
            String ratingFilm = resultat.getString("ratingFilm");
            String streamingNow = resultat.getString("streamingNow");
            SearchFilmsRe.add(new Film(idFilm,  titleFilm,  descriptionFilm,  runTimeFilm,  genreFilm,  producedIn,  directedBy,  pictureURL,  backgroundURL,  ratingFilm,  streamingNow));
        }

        return SearchFilmsRe;
    }

        }


