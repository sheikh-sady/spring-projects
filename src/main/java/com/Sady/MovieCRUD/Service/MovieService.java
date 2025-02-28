package com.Sady.MovieCRUD.Service;

import com.Sady.MovieCRUD.Repository.MovieRepo;
import com.Sady.MovieCRUD.Model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService
{

    @Autowired
    private MovieRepo movieRepo;

    public Movie addMovie(Movie movie)
    {
        return movieRepo.save(movie);
    }

    public List<Movie> getAllMovies()
    {
        return movieRepo.findAll();
    }

    public Movie getMovieById(Long id)
    {
        return movieRepo.findById(id).orElse(null);
    }

    public Movie updateMovie(Movie movie)
    {
        return movieRepo.save(movie);
    }

    public void deleteMovie(Long id)
    {
        movieRepo.deleteById(id);
    }
}
