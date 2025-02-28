package com.Sady.MovieCRUD.Service;

import com.Sady.MovieCRUD.Model.Director;
import com.Sady.MovieCRUD.Repository.DirectorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    @Autowired
    private DirectorRepo directorRepo;


    public String addDirector(Director director) {
        director.getMovies().forEach(movie -> movie.setDirector(director));
        directorRepo.save(director);
        return "Director added successfully";
    }
    public Director getSingleDirector(int id) {
        return directorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Director not found with id: " + id));
    }

    public List<Director> getAllDirectors() {
        return directorRepo.findAll();
    }

    public String updateDirector(Director director) {
        directorRepo.save(director);
        return "Director updated successfully";
    }
    public String deleteDirector(int id) {
        directorRepo.deleteById(id);
        return "Director deleted successfully";
    }
}
