package com.skole;

public class Movie {

    private String movieName;
    private int likes;
    private int prodYear;
    private double duration;

    public Movie() {
    }

    public boolean getMoviesAfter2000(){
        return this.prodYear > 2000;
    }

    public Movie(String movieName, int likes, int prodYear, double duration) {
        this.movieName = movieName;
        this.likes = likes;
        this.prodYear = prodYear;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", likes=" + likes +
                ", prodYear=" + prodYear +
                ", duration=" + duration +
                '}';
    }
}

