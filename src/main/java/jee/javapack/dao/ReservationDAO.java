package jee.javapack.dao;

import jee.javapack.beans.Reservation;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationDAO {
    ArrayList<Reservation> getReservationsByUserId(int userId) throws SQLException, ClassNotFoundException;
}
