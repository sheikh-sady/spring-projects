package com.Sady.MovieCRUD.Repository;

import com.Sady.MovieCRUD.Model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Integer> {

}
