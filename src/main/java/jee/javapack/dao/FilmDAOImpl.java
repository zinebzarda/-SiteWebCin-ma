package jee.javapack.dao;

import jee.javapack.beans.Film;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmDAOImpl implements FilmDAO{
    @Override
    public ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException{
        Connection connection = ConnectionDAO.getConnection();
        return null;
    }

    @Override
    public ArrayList<Film> getAllFilms() throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionDAO.getConnection();
        return null;
    }
}
