package jee.javapack.dao;

import jee.javapack.beans.Reservation;

import java.sql.SQLException;
import java.util.List;

public interface ReservationDAO {
    List<Reservation> getReservationsByUserId(int userId) throws SQLException;

}
