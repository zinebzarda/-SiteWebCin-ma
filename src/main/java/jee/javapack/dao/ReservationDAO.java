package jee.javapack.dao;

import jee.javapack.beans.Reservation;

import java.util.List;

public interface ReservationDAO {
    List<Reservation> getReservationsByUserId(int userId);

}
