package jee.javapack.beans;

public class Film {
    private int idFilm;
    private String titre;
    private String description;
    private int duree;
    private String genre;
    private int annee;
    private String imageURL;

    // Getters
    public int getIdFilm() {
        return idFilm;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public int getDuree() {
        return duree;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnnee() {
        return annee;
    }

    public String getImageURL() {
        return imageURL;
    }

    // Setters
    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
