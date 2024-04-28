package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public interface FilmDAO {
<<<<<<< HEAD
    ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException;
    List<Film> getAllFilms() throws SQLException, ClassNotFoundException;
    List<Film> getHighRatedFilms();
    void addFilms(Film film) throws SQLException;
    ArrayList<Film> showFilm()  throws SQLException;
    void updateFilm(Film film) throws SQLException;
    void deleteFilm(int idFilm) throws SQLException;
=======
    List<Film> getAllFilms();
    List<Film> getHighRatedFilms();
    Film getMovieById(Integer idMovie) throws SQLException, ClassNotFoundException;
    ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException;
>>>>>>> 7a8dc9b08099e6affebef5e4db0cbb67eb5b18fe
}
