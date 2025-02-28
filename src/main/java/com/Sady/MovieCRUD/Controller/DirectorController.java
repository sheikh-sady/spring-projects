package com.Sady.MovieCRUD.Controller;

import com.Sady.MovieCRUD.Model.Director;
import com.Sady.MovieCRUD.Service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/director")

public class DirectorController {
    @Autowired
    private DirectorService directorService;

  @PostMapping("")
  public ResponseEntity<String> add(@RequestBody Director director) {
      return ResponseEntity.ok(directorService.addDirector(director));
  }
  @GetMapping("")
  public ResponseEntity<List<Director>> getAll() {
      return ResponseEntity.ok(directorService.getAllDirectors());
  }
  @GetMapping("/{id}")
  public ResponseEntity<Director> getById(@PathVariable int id) {
      return ResponseEntity.ok(directorService.getSingleDirector(id));
  }
  @PutMapping("")
  public ResponseEntity<String> update(@RequestBody Director director) {
      return ResponseEntity.ok(directorService.updateDirector(director));
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<String> delete(@PathVariable int id) {
      return ResponseEntity.ok(directorService.deleteDirector(id));
  }
}
