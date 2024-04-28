package jee.javapack.dao;

import jee.javapack.beans.Reservation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAOImpl implements ReservationDAO {


    @Override
    public List<Reservation> getReservationsByUserId(int userId) throws SQLException {
        List<Reservation> reservations = new ArrayList<>();
        Connection connection = ConnectionDAO.getConnection();

        return reservations;
    }

    @Override
    public void makeReservation(Integer idMovie, Date dateReserve, Time timeReserve, String qrCode, String seat, String experience, String offer) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionDAO.getConnection();
        String queryReserve = "INSERT INTO Reservation (idUser, idFilm, dateReservation, timeReservation, qrCodeBillet, seatPlace, experienceType, offerBillet) VALUES (1, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(queryReserve);
        statement.setInt(1, idMovie);
        statement.setDate(2, dateReserve);
        statement.setTime(3, timeReserve);
        statement.setString(4, qrCode);
        statement.setString(5, seat);
        statement.setString(6, experience);
        statement.setString(7, offer);
        statement.executeUpdate();
        connection.close();
        statement.close();
    }


}
