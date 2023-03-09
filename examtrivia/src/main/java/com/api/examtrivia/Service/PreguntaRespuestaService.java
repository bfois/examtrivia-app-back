package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Disciplina;
import com.api.examtrivia.Entity.PreguntaRespuesta;

import java.util.List;
import java.util.Optional;

public interface PreguntaRespuestaService {
    List<PreguntaRespuesta> listAll();
    Optional<PreguntaRespuesta> ListById(int id);
}
