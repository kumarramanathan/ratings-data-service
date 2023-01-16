package com.example.microservices.ratingsdataservice.model;

public class Rating {

private String movieId;
private int ranking;

    public Rating(String movieId, int ranking) {
        this.movieId = movieId;
        this.ranking = ranking;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
