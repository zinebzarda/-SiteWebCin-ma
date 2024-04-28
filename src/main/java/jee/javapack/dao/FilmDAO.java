package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public interface FilmDAO {

    ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException;
    List<Film> getAllFilms();
    List<Film> getHighRatedFilms();
    Film getMovieById(Integer idMovie) throws SQLException, ClassNotFoundException;
    void addFilms(Film film) throws SQLException;
    ArrayList<Film> showFilm()  throws SQLException;
    void updateFilm(Film film) throws SQLException;
    void deleteFilm(int idFilm) throws SQLException;
}
