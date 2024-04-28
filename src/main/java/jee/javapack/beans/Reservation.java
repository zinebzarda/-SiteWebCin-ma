package jee.javapack.beans;

import java.util.Date;

public class Reservation {
    private Integer idReservation;
    private Integer idUser;
    private Integer idFilm;
    private Date dateReservation;
    private Integer numberBillets;

    public Reservation(Integer idReservation, Integer idUser, Integer idFilm, Date dateReservation, Integer numberBillets) {
        this.idReservation = idReservation;
        this.idUser = idUser;
        this.idFilm = idFilm;
        this.dateReservation = dateReservation;
        this.numberBillets = numberBillets;
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

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Integer getNumberBillets() {
        return numberBillets;
    }

    public void setNumberBillets(Integer numberBillets) {
        this.numberBillets = numberBillets;
    }
}
