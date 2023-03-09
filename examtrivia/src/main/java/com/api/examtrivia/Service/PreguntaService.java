package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Disciplina;
import com.api.examtrivia.Entity.Pregunta;

import java.util.List;
import java.util.Optional;

public interface PreguntaService {
    List<Pregunta> listAll();
    Optional<Pregunta> ListById(int id);
}
