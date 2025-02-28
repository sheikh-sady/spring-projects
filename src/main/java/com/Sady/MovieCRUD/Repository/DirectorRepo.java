package com.Sady.MovieCRUD.Repository;

import com.Sady.MovieCRUD.Model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepo extends JpaRepository<Director, Integer> {

}
