package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.SQLException;
import java.util.ArrayList;

public interface FilmDAO {
    ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException;
    ArrayList<Film> getAllFilms() throws SQLException, ClassNotFoundException;

}
