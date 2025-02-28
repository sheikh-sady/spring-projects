package com.Sady.MovieCRUD.Service;

import com.Sady.MovieCRUD.Model.Actor;
import com.Sady.MovieCRUD.Model.Director;
import com.Sady.MovieCRUD.Model.Movie;
import com.Sady.MovieCRUD.Repository.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepo actorRepo;

    public String addActor(Actor actor) {
        actor.getMovies().forEach(movie -> movie.setActor(List.of(actor)));
        actorRepo.save(actor);
        return "Actor added successfully";
    }

    public List<Actor> getAllActors() {
        return actorRepo.findAll();
    }
    public Actor getActorById(int id) {
        return actorRepo.findById(id).orElseThrow(()-> new RuntimeException("No actor found with id: " + id));
    }
    public String updateActor(Actor actor) {
        actorRepo.save(actor);
        return "Actor updated";
    }
    public String deleteActor(int id) {
        actorRepo.deleteById(id);
        return "Actor deleted";
    }
}
