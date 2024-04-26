package jee.javapack.dao;



import jee.javapack.beans.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FilmDAOImpl implements FilmDAO {

            @Override
            public ArrayList<Film> getAllFilms() throws SQLException, ClassNotFoundException{

                ArrayList<Film> films = new ArrayList<>();

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
                        film.setRunTimeFilm(resultSet.getInt("runTimeFilm"));
                        film.setGenreFilm(resultSet.getString("genreFilm"));
                        film.setProducedIn(resultSet.getDate("producedIn"));
                        film.setPictureURL(resultSet.getString("pictureURL"));
                        film.setStreamingNow(resultSet.getDate("streamingNow"));
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
            Integer runTimeFilm = resultat.getInt("runTimeFilm");
            String genreFilm = resultat.getString("genreFilm");
            Date producedIn = resultat.getDate("producedIn");
            String directedBy = resultat.getString("directedBy");
            String pictureURL = resultat.getString("pictureURL");
            String backgroundURL = resultat.getString("backgroundURL");
            String ratingFilm = resultat.getString("ratingFilm");
            Date streamingNow = resultat.getDate("streamingNow");
            SearchFilmsRe.add(new Film(idFilm,  titleFilm,  descriptionFilm,  runTimeFilm,  genreFilm,  producedIn,  directedBy,  pictureURL,  backgroundURL,  ratingFilm,  streamingNow));
        }

        return SearchFilmsRe;
    }

        }


