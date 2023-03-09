package com.api.examtrivia.Service;

import com.api.examtrivia.Entity.Disciplina;
import com.api.examtrivia.Entity.Respuesta;

import java.util.List;
import java.util.Optional;

public interface RespuestaService {
    List<Respuesta> listAll();
    Optional<Respuesta> ListById(int id);
}
