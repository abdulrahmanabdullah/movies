package com.example.abdulrahman.getlastmovie.model;

public class Movie {

    private int movie_image ;
    private String title ;


    public Movie(int movie_image, String title) {
        this.movie_image = movie_image;
        this.title = title;
    }


    public int getMovie_image() {
        return movie_image;
    }

    public void setMovie_image(int movie_image) {
        this.movie_image = movie_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
