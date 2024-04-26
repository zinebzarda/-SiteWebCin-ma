package jee.javapack.dao;



import jee.javapack.beans.Film;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class FilmDAOImpl implements FilmDAO{
    @Override
    public ArrayList<Film> SearchFilms(String Title) throws SQLException, ClassNotFoundException{
        Connection connection = ConnectionDAO.getConnection();

        ArrayList<Film> SearchFilmsRe=new ArrayList<>();
        String requet = "SELECT * FROM  film WHERE titleFilm=?";
        PreparedStatement statement = connection.prepareStatement(requet);
        statement.setString(1,Title);
        ResultSet resultat = statement.executeQuery();

        while (resultat.next()) {
            Integer idFilm = resultat.getInt("idFilm");
            String titleFilm=resultat.getString("titleFilm");
            String descriptionFilm =resultat.getString("descriptionFilm");
            Integer runTimeFilm = resultat.getInt("runTimeFilm");
            String genreFilm=resultat.getString("genreFilm");
            Date producedIn=resultat.getDate("producedIn");
            String directedBy=resultat.getString("directedBy");
            String pictureURL=resultat.getString("pictureURL");

            Film searchfilms=new Film(idFilm,titleFilm,descriptionFilm,runTimeFilm,genreFilm, producedIn,directedBy,pictureURL);
            SearchFilmsRe.add(searchfilms);

        }

        return SearchFilmsRe;
    }



//    @Override
//    public List<Film> getAllFilms() throws SQLException, ClassNotFoundException {
//        Connection connection = ConnectionDAO.getConnection();
//
//        return java.util.Collections.emptyList();
//    }
}
