package com.api.examtrivia.Repository;

import com.api.examtrivia.Entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPregunta extends JpaRepository<Pregunta, Integer> {

}
