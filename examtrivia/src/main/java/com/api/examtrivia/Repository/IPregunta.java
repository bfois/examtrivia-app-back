package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPregunta extends JpaRepository<Pregunta, Integer> {
}
