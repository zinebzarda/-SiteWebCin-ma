package jee.javapack.beans;

import java.sql.Date;


public class Film {
    private Integer idFilm;
    private String titleFilm;
    private String descriptionFilm;
    private Integer runTimeFilm;
    private String genreFilm;
    private Date producedIn;
    private String directedBy;
    private String pictureURL;

    public Film(Integer idFilm, String titleFilm, String descriptionFilm, Integer runTimeFilm, String genreFilm, Date producedIn, String directedBy, String pictureURL) {
        this.idFilm = idFilm;
        this.titleFilm = titleFilm;
        this.descriptionFilm = descriptionFilm;
        this.runTimeFilm = runTimeFilm;
        this.genreFilm = genreFilm;
        this.producedIn = producedIn;
        this.directedBy = directedBy;
        this.pictureURL = pictureURL;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitleFilm() {
        return titleFilm;
    }

    public void setTitleFilm(String titleFilm) {
        this.titleFilm = titleFilm;
    }

    public String getDescriptionFilm() {
        return descriptionFilm;
    }

    public void setDescriptionFilm(String descriptionFilm) {
        this.descriptionFilm = descriptionFilm;
    }

    public Integer getRunTimeFilm() {
        return runTimeFilm;
    }

    public void setRunTimeFilm(Integer runTimeFilm) {
        this.runTimeFilm = runTimeFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public Date getProducedIn() {
        return producedIn;
    }

    public void setProducedIn(Date producedIn) {
        this.producedIn = producedIn;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
}
