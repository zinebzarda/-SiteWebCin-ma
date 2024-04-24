package jee.javapack.dao;

import jee.javapack.beans.Reservation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationDAOImpl implements ReservationDAO{
    @Override
    public ArrayList<Reservation> getReservationsByUserId(int userId) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectionDAO.getConnection();
        return null;
    }
}
