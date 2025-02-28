package com.Sady.MovieCRUD.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "movies")

public class Movie
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private double rating;


    @ManyToOne
    @JoinColumn(name = "director_id")
    @JsonIgnore
    private Director director;


    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<Actor> actors;

    public Movie() {}

    public Movie(Long id, String title, String genre, double rating, Director director, List<Actor> actor) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.director = director;
        this.actors = actor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActor() {
        return actors;
    }

    public void setActor(List<Actor> actor) {
        this.actors = actor;
    }
}
