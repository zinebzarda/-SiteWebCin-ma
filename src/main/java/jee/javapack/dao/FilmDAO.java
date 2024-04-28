package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public interface FilmDAO {
    List<Film> getAllFilms();
    List<Film> getHighRatedFilms();
    Film getMovieById(Integer idMovie) throws SQLException, ClassNotFoundException;
    ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException;
}
