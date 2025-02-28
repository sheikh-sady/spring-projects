package com.Sady.MovieCRUD.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="director")

public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String nationality;

    @OneToMany(mappedBy = "director",cascade = CascadeType.PERSIST)
    private List<Movie> movies=new ArrayList<>();

    public Director() {
    }

    public Director(int id, String name, String nationality, List<Movie> movies) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
