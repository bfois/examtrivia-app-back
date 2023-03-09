package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespuesta extends JpaRepository<Respuesta, Integer> {
}
