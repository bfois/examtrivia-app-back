package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.PreguntaRespuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPreguntaRespuesta extends JpaRepository<PreguntaRespuesta, Integer> {
}
