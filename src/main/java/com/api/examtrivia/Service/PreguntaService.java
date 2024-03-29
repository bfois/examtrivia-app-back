package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Disciplina;
import com.api.examtrivia.Entity.Pregunta;

import java.util.List;
import java.util.Optional;

public interface PreguntaService {
    List<Pregunta> listAll();
    Optional<Pregunta> listById(int id);

    List<Pregunta> listByIds(List<Integer> ids);

}
