package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.util.List;

public interface FilmDAO {

    List<Film> getAllFilms();

    ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException;
    ArrayList<Film> getAllFilms() throws SQLException, ClassNotFoundException;


}
