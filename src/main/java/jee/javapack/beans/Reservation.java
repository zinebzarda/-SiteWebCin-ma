package jee.javapack.beans;

import java.sql.Time;
import java.util.Date;

public class Reservation {
    private Integer idReservation;
    private Integer idUser;
    private Integer idFilm;
    private Integer idBillets;
    private Date dateReservation;

    private Time timeReservation;

    public Reservation(Integer idReservation, Integer idUser, Integer idFilm, Integer idBillets, Date dateReservation, Time timeReservation) {
        this.idReservation = idReservation;
        this.idUser = idUser;
        this.idFilm = idFilm;
        this.idBillets = idBillets;
        this.dateReservation = dateReservation;
        this.timeReservation = timeReservation;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public Integer getIdBillets() {
        return idBillets;
    }

    public void setIdBillets(Integer idBillets) {
        this.idBillets = idBillets;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Time getTimeReservation() {
        return timeReservation;
    }

    public void setTimeReservation(Time timeReservation) {
        this.timeReservation = timeReservation;
    }
}
