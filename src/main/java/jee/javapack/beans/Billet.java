package jee.javapack.beans;

public class Billet {
    private Integer idBillet;
    private Integer idReservation;
    private Integer qrCodeBillet;
    private String seatPlace;
    private String cinemaRoomType;
    private String offerBillet;

    public Billet(Integer idBillet, Integer idReservation, Integer qrCodeBillet, String seatPlace, String cinemaRoomType, String offerBillet) {
        this.idBillet = idBillet;
        this.idReservation = idReservation;
        this.qrCodeBillet = qrCodeBillet;
        this.seatPlace = seatPlace;
        this.cinemaRoomType = cinemaRoomType;
        this.offerBillet = offerBillet;
    }

    public Integer getIdBillet() {
        return idBillet;
    }

    public void setIdBillet(Integer idBillet) {
        this.idBillet = idBillet;
    }

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Integer getQrCodeBillet() {
        return qrCodeBillet;
    }

    public void setQrCodeBillet(Integer qrCodeBillet) {
        this.qrCodeBillet = qrCodeBillet;
    }

    public String getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(String seatPlace) {
        this.seatPlace = seatPlace;
    }

    public String getCinemaRoomType() {
        return cinemaRoomType;
    }

    public void setCinemaRoomType(String cinemaRoomType) {
        this.cinemaRoomType = cinemaRoomType;
    }

    public String getOfferBillet() {
        return offerBillet;
    }

    public void setOfferBillet(String offerBillet) {
        this.offerBillet = offerBillet;
    }
}
