package com.Sady.MovieCRUD.Controller;

import com.Sady.MovieCRUD.Model.Actor;
import com.Sady.MovieCRUD.Service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")

public class ActorController {
    @Autowired
    private ActorService actorService;

    @PostMapping("")
    public ResponseEntity<String> addActor(@RequestBody Actor actor) {
        return ResponseEntity.ok(actorService.addActor(actor));
    }
    @GetMapping("")
    public ResponseEntity<List<Actor>> getAllActors() {
        return ResponseEntity.ok(actorService.getAllActors());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Actor> getActorById(@PathVariable int id) {
        return ResponseEntity.ok(actorService.getActorById(id));
    }
    @PutMapping
    public ResponseEntity<String> updateActor(@RequestBody Actor actor) {
        return ResponseEntity.ok(actorService.updateActor(actor));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteActor(@PathVariable int id) {
        return ResponseEntity.ok(actorService.deleteActor(id));
    }

}
