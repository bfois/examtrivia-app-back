package com.api.examtrivia.Service;


import com.api.examtrivia.Entity.Disciplina;


import java.util.List;
import java.util.Optional;

public interface DisciplinaService {

    List<Disciplina> listAll();
    Optional<Disciplina> listById(int id);
}
